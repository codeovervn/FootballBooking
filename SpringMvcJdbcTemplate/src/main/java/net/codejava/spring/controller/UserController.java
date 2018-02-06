package net.codejava.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.codejava.spring.action.UsersAction;
import net.codejava.spring.model.Users;

/**
 * Đây là trang Login
 * 
 * @author DungLT-04/03/2017
 * 
 */
@Controller
public class UserController {

    @Autowired
    private UsersAction usersAction;

    /** 
     * Phương thức hiển thị khởi tạo trang Đăng Nhập tài khoản người dùng. 
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView loadLogin(ModelAndView model, HttpServletRequest request) {
    	if(request.getAttribute("checkdangnhap") == null || !request.getAttribute("checkdangnhap").equals("1")){
            request.setAttribute("checkdangnhap", "0");
        }
        model.setViewName("users/login");

        return model;
    }

    @RequestMapping(value = "/loginsuccess", method = RequestMethod.POST)
    public ModelAndView loadLoginSuccess(ModelAndView model, HttpServletRequest request) {
    	if(request.getAttribute("checkdangnhap") == null || !request.getAttribute("checkdangnhap").equals("1")){
            request.setAttribute("checkdangnhap", "0");
        }

        String usercode = request.getParameter("usercode");
        String password = request.getParameter("password");
        Users usersInfoLogin = usersAction.getInfoLogin(usercode, password);
        if (usersInfoLogin != null) {
            model.setViewName("pages/homepageTemplate");
            request.setAttribute("checkdangnhap", "1");
        } else {
            model.setViewName("users/login");
        }

        return model;
    }

    /** 
     * Phương thức hiển thị khởi tạo trang Đăng kí tài khoản người dùng. 
     */
    @RequestMapping(value = "/regist", method = RequestMethod.GET)
    public ModelAndView loadRegistn(ModelAndView model, HttpServletRequest request) {
    	if(request.getAttribute("checkdangnhap") == null || !request.getAttribute("checkdangnhap").equals("1")){
            request.setAttribute("checkdangnhap", "0");
        }
        model.setViewName("users/regist");

        return model;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ModelAndView loadLogout(ModelAndView model, HttpServletRequest request) {
        request.setAttribute("checkdangnhap", "0");
        model.setViewName("pages/homepageTemplate");

        return model;
    }
}
