package kr.ac.kopo.polycms.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.polycms.model.Member;
import kr.ac.kopo.polycms.util.Pager;

@Repository
public class MemberDaoImpl implements MemberDao {
	
	@Autowired
	SqlSession sql;

	@Override
	public Long total(Pager pager) {		
		return sql.selectOne("member.total", pager);
	}

	@Override
	public List<Member> list(Pager pager) {
		return sql.selectList("member.list", pager);
	}

	@Override
	public void add(Member item) {
		sql.insert("member.add", item);
	}

	@Override
	public Member item(String id) {
		return sql.selectOne("member.item", id);
	}

	@Override
	public void update(Member item) {
		sql.update("member.update", item);
	}

	@Override
	public void delete(String id) {
		sql.delete("member.delete", id);
	}

	@Override
	public Member login(Member item) {		
		return sql.selectOne("member.login", item);
	}

}
