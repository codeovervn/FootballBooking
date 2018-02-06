package net.codejava.spring.admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.codejava.spring.action.StadiumsAction;
import net.codejava.spring.model.Stadium;

/**
 * Đây là trang Admin Manager Stadium.
 * 
 * @author DungLT-13/03/2017
 * 
 */
@Controller
public class AdminManagerSeasonsController {

    @Autowired
    private StadiumsAction stadiumsAction;

    @RequestMapping(value = "/addSeasons", method = RequestMethod.GET)
    public ModelAndView addNews(ModelAndView model, HttpServletRequest request) {
        request.setAttribute("checkdangki", 0);
        List<Stadium> getMenuList = stadiumsAction.getDataStadium();
        request.setAttribute("getMenuList", getMenuList);

        Stadium seasons = new Stadium();
        model.addObject("seasons", seasons);
        model.setViewName("admins/admin_quanly_season_edit");

        return model;
    }

    @RequestMapping(value = "/saveSeasons", method = RequestMethod.POST)
    public ModelAndView saveNews(@ModelAttribute Stadium seasons, HttpServletRequest request) {
    	stadiumsAction.saveOrUpdate(seasons);

        return new ModelAndView("redirect:/adminquanlyseasons");
    }

    @RequestMapping(value = "/deleteSeasons", method = RequestMethod.GET)
    public ModelAndView deleteNews(HttpServletRequest request) {
        int newsId = Integer.parseInt(request.getParameter("id"));
        stadiumsAction.delete(newsId);

        return new ModelAndView("redirect:/adminquanlyseasons");
    }

    @RequestMapping(value = "/editSeasons", method = RequestMethod.GET)
    public ModelAndView editNews(HttpServletRequest request) {
        request.setAttribute("checkdangki", 1);
        List<Stadium> getMenuList = stadiumsAction.getDataStadium();
        request.setAttribute("getMenuList", getMenuList);
        int newsId = Integer.parseInt(request.getParameter("id"));
        //System.out.println(newsId);

        Stadium seasons = stadiumsAction.get(newsId);
        ModelAndView model = new ModelAndView("admins/admin_quanly_season_edit");
        model.addObject("seasons", seasons);

        return model;
    }
}
