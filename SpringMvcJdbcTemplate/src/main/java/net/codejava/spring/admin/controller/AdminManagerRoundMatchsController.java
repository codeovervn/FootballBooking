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
 * Đây là trang Admin Manager RoundMatch.
 * 
 * @author DungLT-13/03/2017
 * 
 */
@Controller
public class AdminManagerRoundMatchsController {

    @Autowired
    private StadiumsAction stadiumsAction;

    @RequestMapping(value = "/addRoundMatchs", method = RequestMethod.GET)
    public ModelAndView addNews(ModelAndView model, HttpServletRequest request) {
        request.setAttribute("checkdangki", 0);
        List<Stadium> getMenuList = stadiumsAction.getDataStadium();
        request.setAttribute("getMenuList", getMenuList);

        Stadium roundmatchs = new Stadium();
        model.addObject("roundmatchs", roundmatchs);
        model.setViewName("admins/admin_quanly_roundmatch_edit");

        return model;
    }

    @RequestMapping(value = "/saveRoundMatchs", method = RequestMethod.POST)
    public ModelAndView saveNews(@ModelAttribute Stadium seasons, HttpServletRequest request) {
    	stadiumsAction.saveOrUpdate(seasons);

        return new ModelAndView("redirect:/adminquanlyroundmatchs");
    }

    @RequestMapping(value = "/deleteRoundMatchs", method = RequestMethod.GET)
    public ModelAndView deleteNews(HttpServletRequest request) {
        int newsId = Integer.parseInt(request.getParameter("id"));
        stadiumsAction.delete(newsId);

        return new ModelAndView("redirect:/adminquanlyroundmatchs");
    }

    @RequestMapping(value = "/editRoundMatchs", method = RequestMethod.GET)
    public ModelAndView editNews(HttpServletRequest request) {
        request.setAttribute("checkdangki", 1);
        List<Stadium> getMenuList = stadiumsAction.getDataStadium();
        request.setAttribute("getMenuList", getMenuList);
        int newsId = Integer.parseInt(request.getParameter("id"));
        //System.out.println(newsId);

        Stadium roundmatchs = stadiumsAction.get(newsId);
        ModelAndView model = new ModelAndView("admins/admin_quanly_roundmatch_edit");
        model.addObject("roundmatchs", roundmatchs);

        return model;
    }
}
