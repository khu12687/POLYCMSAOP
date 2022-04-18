package kr.ac.kopo.polycms.dao;

import java.util.List;

import kr.ac.kopo.polycms.model.Article;
import kr.ac.kopo.polycms.model.ArticleCount;
import kr.ac.kopo.polycms.pager.ArticlePager;

public interface ArticleDao {

	List<Article> list(ArticlePager pager);

	void add(Article item);

	Article item(Long boardId, Long articleId);

	void update(Article item);

	void delete(Long boardId, Long articleId);

	void refCount(ArticleCount item);

	void goodCount(ArticleCount item);

	void badCount(ArticleCount item);

	long total(ArticlePager pager);

}
