package net.codejava.spring.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.codejava.spring.action.MatchAction;
import net.codejava.spring.model.Match;

/**
 * Đây là trang Bảng Xếp Hạng.
 * 
 * @author DungLT-18/03/2017
 * 
 */
@Controller
public class BangXepHangController {

    @Autowired
    private MatchAction matchAction;

    @RequestMapping(value="/bangxephang")
    public ModelAndView listContact(ModelAndView model, HttpServletRequest request, Integer offset) throws IOException {
        if(request.getAttribute("checkdangnhap") == null || !request.getAttribute("checkdangnhap").equals("1")) {
            request.setAttribute("checkdangnhap", "0");
        }

        if(offset == null) {
            offset = 0;
        }
        List<Match> listContact = matchAction.listMatchAll();
        //model.addObject("count", listContact.size());
        //model.addObject("offset", offset);
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

        //List<ClubInfo> clubInfoList = clubInfoAction.getDataClubInfo();
        //model.addObject("clubInfoList", clubInfoList);
        //model.addObject("listContact", listContact);
        //model.addObject("listGiai", listGiai);
        model.setViewName("pages/bangxephang");

        return model;
    }
}
