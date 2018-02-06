package net.codejava.spring.service;

import java.util.List;

import net.codejava.spring.model.SearchNews;

public interface SearchNewsService {

    public List<SearchNews> getNewsInfo(String searchnewsname);

}
