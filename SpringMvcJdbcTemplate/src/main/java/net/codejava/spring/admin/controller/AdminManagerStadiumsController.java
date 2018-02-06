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
public class AdminManagerStadiumsController {

    @Autowired
    private StadiumsAction stadiumsAction;

    @RequestMapping(value = "/addStadiums", method = RequestMethod.GET)
    public ModelAndView addNews(ModelAndView model, HttpServletRequest request) {
        request.setAttribute("checkdangki", 0);
        List<Stadium> getMenuList = stadiumsAction.getDataStadium();
        request.setAttribute("getMenuList", getMenuList);

        Stadium stadiums = new Stadium();
        model.addObject("stadiums", stadiums);
        model.setViewName("admins/admin_quanly_stadium_edit");

        return model;
    }

    @RequestMapping(value = "/saveStadiums", method = RequestMethod.POST)
    public ModelAndView saveNews(@ModelAttribute Stadium stadiums, HttpServletRequest request) {
    	stadiumsAction.saveOrUpdate(stadiums);

        return new ModelAndView("redirect:/adminquanlystadiums");
    }

    @RequestMapping(value = "/deleteStadiums", method = RequestMethod.GET)
    public ModelAndView deleteNews(HttpServletRequest request) {
        int newsId = Integer.parseInt(request.getParameter("id"));
        stadiumsAction.delete(newsId);

        return new ModelAndView("redirect:/adminquanlystadiums");
    }

    @RequestMapping(value = "/editStadiums", method = RequestMethod.GET)
    public ModelAndView editNews(HttpServletRequest request) {
        request.setAttribute("checkdangki", 1);
        List<Stadium> getMenuList = stadiumsAction.getDataStadium();
        request.setAttribute("getMenuList", getMenuList);
        int newsId = Integer.parseInt(request.getParameter("id"));
        //System.out.println(newsId);

        Stadium stadiums = stadiumsAction.get(newsId);
        ModelAndView model = new ModelAndView("admins/admin_quanly_stadium_edit");
        model.addObject("stadiums", stadiums);

        return model;
    }
}
