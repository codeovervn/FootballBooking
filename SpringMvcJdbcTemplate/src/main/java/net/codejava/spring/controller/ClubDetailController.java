package net.codejava.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.codejava.spring.action.ClubInfoAction;
import net.codejava.spring.model.ClubInfo;

/**
 * Đây là trang Chi Tiết của 1 Câu lạc bộ.
 * 
 * @author DungLT-01/03/2017
 * 
 */
@Controller
public class ClubDetailController {

    @Autowired
    private ClubInfoAction clubInfoAction;

    /** 
     * Phương thức hiển thị trang Chi Tiết của 1 Câu lạc bộ.
     * 
     * @param String madoituyen
     * 
     * @return : model chitietclub
     */
    @RequestMapping(value = "/chitietclub", method = RequestMethod.GET)
    public ModelAndView lichThiDau(HttpServletRequest request) {
        String madoituyen = request.getParameter("id");
        ClubInfo clubInfoDetail = clubInfoAction.getDataClubInfo(madoituyen);

        ModelAndView model = new ModelAndView("pages/chitietclub");
        model.addObject("clubInfoDetail", clubInfoDetail);

        return model;
    }
}
