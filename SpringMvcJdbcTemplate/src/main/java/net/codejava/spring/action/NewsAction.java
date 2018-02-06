package net.codejava.spring.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.codejava.spring.model.Menu;
import net.codejava.spring.model.News;
import net.codejava.spring.service.NewsService;

/**
 * Đây là Action của trang Quản lý tin tức dành riêng cho Admin.
 * 
 * @author DungLT-05/03/2017
 * 
 */
public class NewsAction {

    @Autowired
    NewsService newsService;

    public List<News> getDataNewsAll() {
        List<News> getNewsInfoList = newsService.getDataNewsAll();
        return getNewsInfoList;
    }

    public void saveOrUpdate(News news) {
        newsService.saveOrUpdate(news);
    }

    public void delete(int newsId) {
        newsService.delete(newsId);
    }

    public News get(int newsId) {
        News contact = newsService.get(newsId);
        return contact;
    }

    public List<Menu> getDataMenuAll() {
        List<Menu> getMenuInfoList = newsService.getDataMenuAll();
        return getMenuInfoList;
    }
}
