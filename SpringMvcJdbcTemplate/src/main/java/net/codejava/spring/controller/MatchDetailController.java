package net.codejava.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.codejava.spring.action.BookingAction;
import net.codejava.spring.model.Booking;

/**
 * Đây là trang Chi Tiết của 1 trận đấu
 * 
 * @author DungLT-28/02/2017
 * 
 */
@Controller
public class MatchDetailController {

    @Autowired
    private BookingAction bookingAction;

    /** 
     * Phương thức hiển thị trang Chi tiết trận đấu.
     * 
     * @param int id
     * @param int vong
     * @param String matran
     * 
     * @return : model chitiettrandau
     */
    @RequestMapping(value = "/chitiettrandau", method = RequestMethod.GET)
    public ModelAndView lichThiDau(HttpServletRequest request) {
    	if(request.getAttribute("checkdangnhap") == null || !request.getAttribute("checkdangnhap").equals("1")){
            request.setAttribute("checkdangnhap", "0");
        }
        int id = Integer.parseInt(request.getParameter("id"));
        int vong = Integer.parseInt(request.getParameter("vong"));
        String matran = request.getParameter("matran");
        Booking matchDetail = bookingAction.getDataMatchInfo(id, vong, matran);

        ModelAndView model = new ModelAndView("pages/chitiettrandau");
        model.addObject("matchDetail", matchDetail);

        return model;
    }
}
