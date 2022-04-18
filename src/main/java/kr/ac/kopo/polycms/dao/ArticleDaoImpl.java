package kr.ac.kopo.polycms.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.polycms.model.Article;
import kr.ac.kopo.polycms.model.ArticleCount;
import kr.ac.kopo.polycms.pager.ArticlePager;

@Repository
public class ArticleDaoImpl implements ArticleDao {
	
	@Autowired
	SqlSession sql;

	@Override
	public List<Article> list(ArticlePager pager) {
		
		return sql.selectList("article.list", pager);
	}

	@Override
	public void add(Article item) {
		sql.insert("article.add", item);
	}

	@Override
	public Article item(Long boardId, Long articleId) {
		HashMap<String, Object> map =  new HashMap<String, Object>();
		
		map.put("boardId", boardId);
		map.put("articleId", articleId);
		
		return sql.selectOne("article.item", map);
	}

	@Override
	public void update(Article item) {
		sql.update("article.update", item);
	}

	@Override
	public void delete(Long boardId, Long articleId) {
		HashMap<String, Object> map =  new HashMap<String, Object>();
		
		map.put("boardId", boardId);
		map.put("articleId", articleId);
		
		sql.delete("article.delete", map);
	}

	@Override
	public void refCount(ArticleCount item) {
		sql.update("article.ref_count", item);
	}

	@Override
	public void goodCount(ArticleCount item) {
		sql.update("article.good_count", item);
	}

	@Override
	public void badCount(ArticleCount item) {
		sql.update("article.bad_count", item);
	}

	@Override
	public long total(ArticlePager pager) {
		
		return sql.selectOne("article.total", pager);
	}

}
