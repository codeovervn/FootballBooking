package net.codejava.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.codejava.spring.action.SearchNewsAction;
import net.codejava.spring.model.SearchNews;

/**
 * Đây là trang Tìm kiếm tin tức
 * 
 * @author DungLT-05/03/2017
 * 
 */
@Controller
public class SearchNewsController {

    @Autowired
    private SearchNewsAction searchNewsAction;

    /** 
     * Phương thức hiển thị trang Đặt Vé chi tiết.
     * 
     * @param String searchnewsname
     * 
     * @return : model vffnews
     */
    @RequestMapping(value = "/searchnews", method = RequestMethod.POST)
    public ModelAndView loadDatveId(HttpServletRequest request) {
    	if(request.getAttribute("checkdangnhap") == null || !request.getAttribute("checkdangnhap").equals("1")){
            request.setAttribute("checkdangnhap", "0");
        }
        String searchnewsname = request.getParameter("searchnewsname");
        List<SearchNews> searchNewsList = searchNewsAction.getNewsInfo(searchnewsname);
        System.out.println(searchNewsList);

        ModelAndView model = new ModelAndView("pages/videos_imgs");
        model.addObject("searchNews", searchNewsList);

        return model;
    }
}
