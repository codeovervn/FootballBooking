package net.codejava.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.codejava.spring.action.BookingAction;
import net.codejava.spring.action.ClubInfoAction;
import net.codejava.spring.action.MatchAction;
import net.codejava.spring.model.Booking;
import net.codejava.spring.model.ClubInfo;
import net.codejava.spring.model.Match;

/**
 * Đây là trang Đặt Vé
 * 
 * @author DungLT-28/02/2017
 * 
 */
@Controller
public class BookingController {

    @Autowired
    private BookingAction bookingAction;

    @Autowired
    private MatchAction matchAction;

    @Autowired
    private ClubInfoAction clubInfoAction;

    /** 
     * Phương thức hiển thị khởi tạo trang Đặt Vé. 
     */
    @RequestMapping(value = "/bookinglist", method = RequestMethod.GET)
    public ModelAndView loadDatveAll(ModelAndView model, HttpServletRequest request, Integer offset) {
    	if(request.getAttribute("checkdangnhap") == null || !request.getAttribute("checkdangnhap").equals("1")){
            request.setAttribute("checkdangnhap", "0");
        }
        if(offset == null) {
            offset = 0;
        }
        List<Match> listContact = matchAction.listMatchAll();
        model.addObject("count", listContact.size());
        model.addObject("offset", offset);
        List<String> listGiai = new ArrayList<String>();
        String giai = "";
        for (int i = 0; i < listContact.size(); i++) {
            giai = listContact.get(i).getGiai();
            if (!listGiai.contains(giai)) {
                listGiai.add(giai);
            }
        }

        List<Match> seasonListAll = matchAction.listMatchAllSearch();
        model.addObject("seasonListAll", seasonListAll);

        List<ClubInfo> clubInfoList = clubInfoAction.getDataClubInfo();
        model.addObject("clubInfoList", clubInfoList);
        model.addObject("listContact", listContact);
        model.addObject("listGiai", listGiai);
        model.setViewName("booking/bookinglist");

        return model;
    }

    /** 
     * Phương thức hiển thị trang Đặt Vé chi tiết.
     * 
     * @param int id
     * @param int vong
     * @param String matran
     * 
     * @return : model datve
     */
    @RequestMapping(value = "/datve", method = RequestMethod.GET)
    public ModelAndView loadDatveId(HttpServletRequest request) {
    //public ModelAndView loadDatveId(ModelAndView model, HttpServletRequest request) {
    	if(request.getAttribute("checkdangnhap") == null || !request.getAttribute("checkdangnhap").equals("1")){
            request.setAttribute("checkdangnhap", "0");
        }
        int id = Integer.parseInt(request.getParameter("id"));
        int vong = Integer.parseInt(request.getParameter("vong"));
        String matran = request.getParameter("matran");
        Booking booking = bookingAction.getDataMatchInfo(id, vong, matran);

        //model.setViewName("pages/datve");
        ModelAndView model = new ModelAndView("pages/datve");
        model.addObject("booking", booking);

        return model;
    }
}
