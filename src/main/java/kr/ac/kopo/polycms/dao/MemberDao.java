package kr.ac.kopo.polycms.dao;

import java.util.List;

import kr.ac.kopo.polycms.model.Member;
import kr.ac.kopo.polycms.util.Pager;

public interface MemberDao {

	Long total(Pager pager);

	List<Member> list(Pager pager);

	void add(Member item);

	Member item(String id);

	void update(Member item);

	void delete(String id);

	Member login(Member item);

}
