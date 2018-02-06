package net.codejava.spring.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.codejava.spring.model.SearchNews;
import net.codejava.spring.service.SearchNewsService;

/**
 * Đây là Action của trang Tin tức
 * 
 * @author DungLT-05/03/2017
 * 
 */
public class SearchNewsAction {

    @Autowired
    SearchNewsService searchNewsService;

    public List<SearchNews> getNewsInfo(String searchnewsname) {
        List<SearchNews> getNewsInfoList = searchNewsService.getNewsInfo(searchnewsname);
        return getNewsInfoList;
    }
}
