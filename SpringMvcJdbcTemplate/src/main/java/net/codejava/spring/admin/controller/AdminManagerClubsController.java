package net.codejava.spring.admin.controller;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import net.codejava.spring.action.ClubInfoAction;
import net.codejava.spring.model.ClubInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Đây là trang Admin Manager Clubs
 * 
 * @author DungLT-13/03/2017
 * 
 */
@Controller
public class AdminManagerClubsController {

    @Autowired
    private ClubInfoAction clubInfoAction;

    @RequestMapping(value = "/addClubs", method = RequestMethod.GET)
    public ModelAndView addUsers(ModelAndView model, HttpServletRequest request) {
        request.setAttribute("checkdangki", 0);
        ClubInfo clubs = new ClubInfo();
        model.addObject("clubs", clubs);
        model.setViewName("admins/admin_quanly_club_edit");

        return model;
    }

    @RequestMapping(value = "/saveClubs", method = RequestMethod.POST)
    public ModelAndView saveUsers(@ModelAttribute ClubInfo clubInfo, HttpServletRequest request) throws ParseException {
    	clubInfoAction.saveOrUpdate(clubInfo);
        return new ModelAndView("redirect:/adminquanlyclub");
    }

    @RequestMapping(value = "/deleteClubs", method = RequestMethod.GET)
    public ModelAndView deleteUsers(HttpServletRequest request) {
        int usersId = Integer.parseInt(request.getParameter("id"));
        clubInfoAction.delete(usersId);

        return new ModelAndView("redirect:/adminquanlyclub");
    }

    @RequestMapping(value = "/editClubs", method = RequestMethod.GET)
    public ModelAndView editUsers(HttpServletRequest request) {
        request.setAttribute("checkdangki", 1);
        int clubInfoId = Integer.parseInt(request.getParameter("id"));
        ClubInfo clubInfo = clubInfoAction.get(clubInfoId);
        ModelAndView model = new ModelAndView("admins/admin_quanly_club_edit");
        model.addObject("clubInfo", clubInfo);

        return model;
    }
}
