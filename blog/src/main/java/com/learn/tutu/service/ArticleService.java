package com.learn.tutu.service;


import com.learn.tutu.pojo.Article;
import org.springframework.data.domain.Page;

public interface ArticleService {

    /**
     * 分页查询
     * @param pageNum  当前页
     * @param pageSize 每页记录数
     * @return
     */
    Page<Article> findTArticle(int pageNum, int pageSize);
}
