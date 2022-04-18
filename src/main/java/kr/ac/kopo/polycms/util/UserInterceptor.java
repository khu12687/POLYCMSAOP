package kr.ac.kopo.polycms.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import kr.ac.kopo.polycms.model.Member;

public class UserInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		HttpSession session = request.getSession();
		
		Member member = (Member) session.getAttribute("member");
		if(member != null) {
			System.out.println("UserInterceptor: TRUE");
			return true;
		}
		
		String query = request.getQueryString();	
		
		System.out.println(request.getRequestURI() + (query != null ? "?" + query : ""));
		
		session.setAttribute("target", request.getRequestURI() + (query != null ? "?" + query : ""));
				
		System.out.println("UserInterceptor: FALSE");		
		response.sendRedirect("/login");
		return false;
	}
}
