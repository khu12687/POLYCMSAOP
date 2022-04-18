package kr.ac.kopo.polycms.service;

import java.util.List;

import kr.ac.kopo.polycms.model.Member;
import kr.ac.kopo.polycms.util.Pager;

public interface MemberService {

	List<Member> list(Pager pager);

	void add(Member item);

	Member item(String id);

	void update(Member item);

	void delete(String id);

	boolean login(Member item);

}
