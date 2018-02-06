package net.codejava.spring.dao;

import java.util.List;

import net.codejava.spring.model.SearchNews;

/**
 * Đây là DAO của trang Tin tức.
 * 
 * @author DungLT-05/03/2017
 * 
 */
public interface SearchNewsDAO {

    public List<SearchNews> getNewsInfo(String searchnewsname);

}
