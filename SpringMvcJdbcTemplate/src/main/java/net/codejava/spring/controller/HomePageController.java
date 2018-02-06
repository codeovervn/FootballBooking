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
public class HomePageController {

    @RequestMapping(value = "/homepageTemplate", method = RequestMethod.GET)
    public ModelAndView loadHomepage(ModelAndView model, HttpServletRequest request) {
        if(request.getAttribute("checkdangnhap") == null || !request.getAttribute("checkdangnhap").equals("1")){
            request.setAttribute("checkdangnhap", "0");
        }
        model.setViewName("pages/homepageTemplate");

        return model;
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView loadIndex(ModelAndView model, HttpServletRequest request) {
    	if(request.getAttribute("checkdangnhap") == null || !request.getAttribute("checkdangnhap").equals("1")){
            request.setAttribute("checkdangnhap", "0");
        }
        model.setViewName("pages/homepageTemplate");

        return model;
    }

    @RequestMapping(value = "/portfolio", method = RequestMethod.GET)
    public ModelAndView loadPortfolio(ModelAndView model, HttpServletRequest request) {
    	if(request.getAttribute("checkdangnhap") == null || !request.getAttribute("checkdangnhap").equals("1")){
            request.setAttribute("checkdangnhap", "0");
        }
        model.setViewName("pages/portfolio");

        return model;
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public ModelAndView loadContact(ModelAndView model, HttpServletRequest request) {
    	if(request.getAttribute("checkdangnhap") == null || !request.getAttribute("checkdangnhap").equals("1")){
            request.setAttribute("checkdangnhap", "0");
        }
        model.setViewName("pages/contact");

        return model;
    }
}
