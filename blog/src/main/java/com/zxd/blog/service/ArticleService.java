package com.zxd.blog.service;


import com.zxd.blog.pojo.Article;
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
