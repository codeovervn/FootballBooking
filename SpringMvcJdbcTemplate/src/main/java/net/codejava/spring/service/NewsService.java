package net.codejava.spring.service;

import java.util.List;

import net.codejava.spring.model.Menu;
import net.codejava.spring.model.News;

public interface NewsService {

    public List<News> getDataNewsAll();

    public void saveOrUpdate(News news);

    public void delete(int newsId);

    public News get(int newsId);

    public List<Menu> getDataMenuAll();

}
