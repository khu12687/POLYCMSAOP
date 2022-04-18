package kr.ac.kopo.polycms.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import kr.ac.kopo.polycms.model.Article;
import kr.ac.kopo.polycms.model.Member;

@Aspect
@Component
public class LogAspect {
	
	@AfterReturning(pointcut = "@annotation(PointcutLogin) && args(member)", returning = "result")
	public void LogLogin(JoinPoint joinPoint, Member member, boolean result) { //LogLogin 어드바이스 ->프록시
		System.out.println("LOGIN : "+member.getId() + "-> "+result + joinPoint);
		
	}
	
	@Before("execution(* kr..ArticleServiceImpl.add(..)) && args(item)")
	public void LogArticleAdd(Article item) {
		System.out.println("새로운 글 등록: "+ item.getSubject());
	}
	
}
