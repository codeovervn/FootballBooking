package net.codejava.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.codejava.spring.dao.NewsDAO;
import net.codejava.spring.model.Menu;
import net.codejava.spring.model.News;
import net.codejava.spring.service.NewsService;

public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsDAO newsDAO;

    /** 
     * Phương thức hiển thị trang Quản lý tin tức dành riêng cho Admin.
     * 
     * @return : Service news
     */
    @Override
    public List<News> getDataNewsAll() {
        List<News> getDataNewsAll = newsDAO.getDataNewsAll();
        return getDataNewsAll;
    }

    @Override
    public void saveOrUpdate(News news) {
        newsDAO.saveOrUpdate(news);
    }

    @Override
    public void delete(int newsId) {
        newsDAO.delete(newsId);
    }

    @Override
    public News get(int newsId) {
        News news = newsDAO.get(newsId);
        return news;
    }

    @Override
    public List<Menu> getDataMenuAll() {
        List<Menu> getDataMenuAll = newsDAO.getDataMenuAll();
        return getDataMenuAll;
    }
}
