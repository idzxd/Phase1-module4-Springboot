package com.zxd.blog.dao;


import com.zxd.blog.pojo.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ArticleDao extends JpaRepository<Article, Integer>, JpaSpecificationExecutor<Article> {


}
