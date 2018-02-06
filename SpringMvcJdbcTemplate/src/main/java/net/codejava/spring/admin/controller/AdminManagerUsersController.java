package net.codejava.spring.admin.controller;

import java.io.IOException;
//import java.text.DateFormat;
import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.codejava.spring.action.UsersAction;
//import net.codejava.spring.model.Menu;
import net.codejava.spring.model.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Đây là trang Admin Manager Users
 * 
 * @author DungLT-05/03/2017
 * 
 */
@Controller
public class AdminManagerUsersController {

    @Autowired
    private UsersAction usersAction;

    @RequestMapping(value="/adminquanlyuser")
    public ModelAndView listUsers(ModelAndView model) throws IOException {
        List<Users> dataUsersAll = usersAction.getDataUsersAll();
        //System.out.println(dataUsersAll);
        model.addObject("dataUsersAll", dataUsersAll);
        model.setViewName("admins/admin_quanly_user");

        return model;
    }

    @RequestMapping(value = "/addUsers", method = RequestMethod.GET)
    public ModelAndView addUsers(ModelAndView model, HttpServletRequest request) {
        request.setAttribute("checkdangki", 0);
        Users users = new Users();
        model.addObject("users", users);
        model.setViewName("admins/admin_quanly_user_edit");

        return model;
    }

    @RequestMapping(value = "/saveUsers", method = RequestMethod.POST)
    public ModelAndView saveUsers(@ModelAttribute Users users, HttpServletRequest request) throws ParseException {
//        int check = Integer.parseInt(request.getParameter("checkdangki"));
//        if(check == 1) {
//            users.setLogo("logo");
//            users.setName(request.getParameter("username"));
//            LocalDate date = LocalDate.now();
//            /*DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
//            Date today = new Date();
//            Date todayWithZeroTime = formatter.parse(formatter.format(today));*/
//            users.setBirthday(date.toString());
//            users.setAddress("address");
//            users.setJob("job");
//            users.setUser(request.getParameter("usercode"));
//            users.setPassword(request.getParameter("password"));
//            users.setAdmin("0");
//            users.setCreateDate(date.toString());
//            users.setUpdateDate(date.toString());
//            usersAction.saveOrUpdate(users);
//            return new ModelAndView("redirect:/index");
//        } else {
//            usersAction.saveOrUpdate(users);
//            return new ModelAndView("redirect:/adminquanlyuser");
//        }

        usersAction.saveOrUpdate(users);
        return new ModelAndView("redirect:/adminquanlyuser");
    }

    @RequestMapping(value = "/deleteUsers", method = RequestMethod.GET)
    public ModelAndView deleteUsers(HttpServletRequest request) {
        int usersId = Integer.parseInt(request.getParameter("id"));
        usersAction.delete(usersId);

        return new ModelAndView("redirect:/adminquanlyuser");
    }

    @RequestMapping(value = "/editUsers", method = RequestMethod.GET)
    public ModelAndView editUsers(HttpServletRequest request) {
        request.setAttribute("checkdangki", 1);
        //List<Menu> getMenuList = usersAction.getDataMenuAll();
        //request.setAttribute("getMenuList", getMenuList);
        int usersId = Integer.parseInt(request.getParameter("id"));
        //System.out.println(usersId);
        Users users = usersAction.get(usersId);
        ModelAndView model = new ModelAndView("admins/admin_quanly_user_edit");
        model.addObject("users", users);

        return model;
    }
}
