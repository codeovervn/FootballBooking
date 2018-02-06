package net.codejava.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Đây là Controller của Trang Chủ VFF
 * 
 * @author DungLT-27/02/2017
 * 
 */
@Controller
public class VffNewsController {

    @RequestMapping(value = "/vffnews", method = RequestMethod.GET)
    public ModelAndView lichThiDau(ModelAndView model, HttpServletRequest request) {
        if(request.getAttribute("checkdangnhap") == null || !request.getAttribute("checkdangnhap").equals("1")){
            request.setAttribute("checkdangnhap", "0");
        }
        model.setViewName("pages/vffnews");
        return model;
    }

    @RequestMapping(value = "/videos_imgs", method = RequestMethod.GET)
    public ModelAndView loadVideosImgs(ModelAndView model, HttpServletRequest request) {
        if(request.getAttribute("checkdangnhap") == null || !request.getAttribute("checkdangnhap").equals("1")){
            request.setAttribute("checkdangnhap", "0");
        }
        model.setViewName("pages/videos_imgs");
        return model;
    }
}
