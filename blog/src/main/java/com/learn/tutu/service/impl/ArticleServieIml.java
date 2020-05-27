package com.learn.tutu.service.impl;

import com.learn.tutu.dao.ArticleDao;
import com.learn.tutu.pojo.Article;
import com.learn.tutu.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ArticleServieIml implements ArticleService {

    @Autowired
    ArticleDao articleDao;

    @Override
    public Page<Article> findTArticle(int pageNum, int pageSize) {
        PageRequest pageable = PageRequest.of(pageNum, pageSize, Sort.Direction.DESC, "created");
        Page<Article> page = articleDao.findAll(pageable);
        return page;
    }
}
