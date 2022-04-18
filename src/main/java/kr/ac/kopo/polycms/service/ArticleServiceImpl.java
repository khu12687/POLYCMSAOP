package kr.ac.kopo.polycms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.polycms.dao.ArticleDao;
import kr.ac.kopo.polycms.model.Article;
import kr.ac.kopo.polycms.model.ArticleCount;
import kr.ac.kopo.polycms.pager.ArticlePager;

@Service
public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	ArticleDao dao;

	@Override
	public List<Article> list(ArticlePager pager) {
		long total = dao.total(pager);
		
		pager.setTotal(total);
		
		return dao.list(pager);
	}

	@Override
	public void add(Article item) {
		dao.add(item);
	}

	@Override
	public Article item(Long boardId, Long articleId) {
		return dao.item(boardId, articleId);
	}

	@Override
	public void update(Article item) {
		dao.update(item);
	}

	@Override
	public void delete(Long boardId, Long articleId) {
		dao.delete(boardId, articleId);
	}

	@Override
	public void updateCount(ArticleCount item) {
		if("ref_count".equals(item.getType()))
			dao.refCount(item);
		else if("good_count".equals(item.getType()))
			dao.goodCount(item);
		else if("bad_count".equals(item.getType()))
			dao.badCount(item);
	}

	@Override
	public void dummy(Long boardId) {
		for(int id=0; id < 100; id++) {
			Article item = new Article();
			
			item.setBoardId(boardId);
			item.setSubject("제목 테스트 " + id);
			item.setContents("내용 테스트 " + id);
			item.setMemberId("admin");
			 
			dao.add(item);
		}
	}

	@Override
	public void init(Long boardId) {
		ArticlePager pager = new ArticlePager();
		pager.setBoardId(boardId);
		pager.setPerPage(9999);
		
		List<Article> list = dao.list(pager);
		
		for(Article item : list)
			dao.delete(boardId, item.getArticleId());
	}
}
