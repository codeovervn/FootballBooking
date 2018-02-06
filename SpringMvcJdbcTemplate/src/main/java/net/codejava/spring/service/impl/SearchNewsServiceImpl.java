package net.codejava.spring.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.codejava.spring.dao.SearchNewsDAO;
import net.codejava.spring.model.SearchNews;
import net.codejava.spring.service.SearchNewsService;

public class SearchNewsServiceImpl implements SearchNewsService {

    @Autowired
    private SearchNewsDAO searchNewsDAO;

    /** 
     * Phương thức tìm kiếm và hiển thị Tin tức.
     * 
     * @param String searchnewsname : chuỗi kí tự mà người dùng tìm kiếm
     * 
     * @return : Service searchNews
     */
    @Override
    public List<SearchNews> getNewsInfo(String searchnewsname) {

        List<SearchNews> searchNewsList = searchNewsDAO.getNewsInfo(searchnewsname);
        return searchNewsList;
    }
}
