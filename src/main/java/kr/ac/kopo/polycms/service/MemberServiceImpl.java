package kr.ac.kopo.polycms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.polycms.aspects.PointcutLogin;
import kr.ac.kopo.polycms.dao.MemberDao;
import kr.ac.kopo.polycms.model.Member;
import kr.ac.kopo.polycms.util.Pager;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDao dao;

	@Override
	public List<Member> list(Pager pager) {
		Long total = dao.total(pager);
		
		pager.setTotal(total);
		
		return dao.list(pager);
	}

	@Override
	public void add(Member item) {
		dao.add(item);
	}

	@Override
	public Member item(String id) {
		return dao.item(id);
	}

	@Override
	public void update(Member item) {
		dao.update(item);
	}

	@Override
	public void delete(String id) {
		dao.delete(id);
	}

	@Override
	@PointcutLogin
	public boolean login(Member item) {
		Member member = dao.login(item);
		
		if(member != null) {
			item.setName( member.getName() );
			item.setGrade( member.getGrade() );
			item.setRegDate(member.getRegDate() );
			
			item.setPasswd(null);
			
			return true;
		}
		
		return false;
	}

}
