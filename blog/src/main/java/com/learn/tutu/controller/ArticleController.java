package com.learn.tutu.controller;

import com.learn.tutu.pojo.Article;
import com.learn.tutu.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ArticleController {

        @Autowired
        private ArticleService articleService;

        @RequestMapping("index")
        public String findTArticle(Model model,
                                   @RequestParam(value = "pageNum", defaultValue = "0") int pageNum,
                                   @RequestParam(value = "pageSize", defaultValue = "2") int pageSize){
            Page<Article> articlePage = articleService.findTArticle(pageNum,pageSize);
            model.addAttribute("page",articlePage);
            return "client/index";
        }
}
