package net.codejava.spring.dao;

import java.util.List;

import net.codejava.spring.model.Menu;
import net.codejava.spring.model.News;

/**
 * Đây là DAO của trang Quản lý tin tức dành riêng cho Admin.
 * 
 * @author DungLT-05/03/2017
 * 
 */
public interface NewsDAO {

    public List<News> getDataNewsAll();

    public void saveOrUpdate(News news);

    public void delete(int newsId);

    public News get(int newsId);

    public List<Menu> getDataMenuAll();

}
