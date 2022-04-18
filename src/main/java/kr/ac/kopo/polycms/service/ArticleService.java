package kr.ac.kopo.polycms.service;

import java.util.List;

import kr.ac.kopo.polycms.model.Article;
import kr.ac.kopo.polycms.model.ArticleCount;
import kr.ac.kopo.polycms.pager.ArticlePager;
import kr.ac.kopo.polycms.util.Pager;

public interface ArticleService {

	List<Article> list(ArticlePager pager);

	void add(Article item);

	Article item(Long boardId, Long articleId);

	void update(Article item);

	void delete(Long boardId, Long articleId);

	void updateCount(ArticleCount item);

	void dummy(Long boardId);

	void init(Long boardId);

}
