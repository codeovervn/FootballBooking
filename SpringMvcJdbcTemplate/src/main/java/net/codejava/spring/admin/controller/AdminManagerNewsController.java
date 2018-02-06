package net.codejava.spring.admin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.codejava.spring.action.NewsAction;
import net.codejava.spring.model.Menu;
import net.codejava.spring.model.News;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Đây là trang Admin Manager News
 * 
 * @author DungLT-05/03/2017
 * 
 */
@Controller
public class AdminManagerNewsController {

    @Autowired
    private NewsAction newsAction;

    @RequestMapping(value="/adminquanlytintuc")
    public ModelAndView listNews(ModelAndView model) throws IOException {
        List<News> dataNewsAll = newsAction.getDataNewsAll();
        //System.out.println(dataNewsAll);
        model.addObject("dataNewsAll", dataNewsAll);
        model.setViewName("admins/admin_quanly_tintuc");

        return model;
    }

    @RequestMapping(value = "/addNews", method = RequestMethod.GET)
    public ModelAndView addNews(ModelAndView model, HttpServletRequest request) {
        request.setAttribute("checkdangki", 0);
        List<Menu> getMenuList = newsAction.getDataMenuAll();
        request.setAttribute("getMenuList", getMenuList);

        News news = new News();
        model.addObject("news", news);
        model.setViewName("admins/admin_quanly_tintuc_edit");

        return model;
    }

    @RequestMapping(value = "/saveNews", method = RequestMethod.POST)
    public ModelAndView saveNews(@ModelAttribute News news, HttpServletRequest request) {
        newsAction.saveOrUpdate(news);

        return new ModelAndView("redirect:/adminquanlytintuc");
    }

    @RequestMapping(value = "/deleteNews", method = RequestMethod.GET)
    public ModelAndView deleteNews(HttpServletRequest request) {
        int newsId = Integer.parseInt(request.getParameter("id"));
        newsAction.delete(newsId);

        return new ModelAndView("redirect:/adminquanlytintuc");
    }

    @RequestMapping(value = "/editNews", method = RequestMethod.GET)
    public ModelAndView editNews(HttpServletRequest request) {
        request.setAttribute("checkdangki", 1);
        List<Menu> getMenuList = newsAction.getDataMenuAll();
        request.setAttribute("getMenuList", getMenuList);
        int newsId = Integer.parseInt(request.getParameter("id"));
        //System.out.println(newsId);

        News news = newsAction.get(newsId);
        ModelAndView model = new ModelAndView("admins/admin_quanly_tintuc_edit");
        model.addObject("news", news);

        return model;
    }

    @RequestMapping(value = "/copyNews", method = RequestMethod.GET)
    public ModelAndView copyNews(HttpServletRequest request) {
        request.setAttribute("checkdangki", 1);
        List<Menu> getMenuList = newsAction.getDataMenuAll();
        request.setAttribute("getMenuList", getMenuList);
        int newsId = Integer.parseInt(request.getParameter("id"));
        System.out.println(newsId);

        if(newsId > 0) {
            News news = newsAction.get(newsId);
            if(news != null) {
	            news.setId(0);
	            newsAction.saveOrUpdate(news);
            }
        }
        return new ModelAndView("redirect:/adminquanlytintuc");
    }
}
