package net.codejava.spring.admin.controller;

import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Đây là trang Admin Manager
 * 
 * @author DungLT-09/03/2017
 * 
 */
@Controller
public class AdminManagerController {

    @RequestMapping(value="/admin")
    public ModelAndView loadAdmin(ModelAndView model) throws IOException {
        model.setViewName("admins/admin");

        return model;
    }

    @RequestMapping(value="/adminquanlytickets")
    public ModelAndView loadAdminTickets(ModelAndView model) throws IOException {
        model.setViewName("admins/admin_quanly_ticket");

        return model;
    }

    @RequestMapping(value="/adminquanlystadiums")
    public ModelAndView loadAdminStadiums(ModelAndView model) throws IOException {
        model.setViewName("admins/admin_quanly_stadium");

        return model;
    }

    @RequestMapping(value="/adminquanlyclubs")
    public ModelAndView loadAdminClubs(ModelAndView model) throws IOException {
        model.setViewName("admins/admin_quanly_club");

        return model;
    }

    @RequestMapping(value="/adminquanlyseasons")
    public ModelAndView loadAdminSeasons(ModelAndView model) throws IOException {
        model.setViewName("admins/admin_quanly_season");

        return model;
    }

    @RequestMapping(value="/adminquanlyroundmatchs")
    public ModelAndView loadAdminRoundMatchs(ModelAndView model) throws IOException {
        model.setViewName("admins/admin_quanly_roundmatch");

        return model;
    }

    @RequestMapping(value="/adminquanlyschedulesmatchs")
    public ModelAndView loadAdminScheduleMatchs(ModelAndView model) throws IOException {
        model.setViewName("admins/admin_quanly_schedulematch");

        return model;
    }

    @RequestMapping(value="/adminquanlymenus")
    public ModelAndView loadAdminMenus(ModelAndView model) throws IOException {
        model.setViewName("admins/admin_quanly_menu");

        return model;
    }

    @RequestMapping(value="/adminquanlysubmenus")
    public ModelAndView loadAdminSubMenus(ModelAndView model) throws IOException {
        model.setViewName("admins/admin_quanly_submenu");

        return model;
    }
}
