package net.codejava.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.codejava.spring.action.ClubInfoAction;
import net.codejava.spring.action.MatchAction;
import net.codejava.spring.model.ClubInfo;
import net.codejava.spring.model.Match;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Đây là trang Tìm Kiếm Lịch Thi Đấu
 * 
 * @author DungLT-03/03/2017
 * 
 */
@Controller
public class SearchMatchController {

    @Autowired
    private MatchAction matchAction;

    @Autowired
    private ClubInfoAction clubInfoAction;

    /** 
     * 
     * 
     */
    @RequestMapping(value = "/seachlichthidau", method = RequestMethod.POST)
    public ModelAndView lichThiDau(ModelAndView model, HttpServletRequest request, Integer offset) {
    	if(request.getAttribute("checkdangnhap") == null || !request.getAttribute("checkdangnhap").equals("1")){
            request.setAttribute("checkdangnhap", "0");
        }
        String giaidau = request.getParameter("giaidau");
        String vongdau = request.getParameter("vongdau");
        String doituyen = request.getParameter("doituyen");
        loadPaging(model, request, giaidau, vongdau, doituyen, offset);
        model.setViewName("pages/lichThiDau");

        return model;
    }

    /** 
     * 
     * 
     */
    public ModelAndView loadPaging(ModelAndView model, HttpServletRequest request, String giaidau, String vongdau, String doituyen, Integer offset) {

        if(offset == null) {
            offset = 0;
        }

        List<Match> searchMatchList = matchAction.searchMatchList(giaidau, vongdau, doituyen, offset, 10);
        //int count = matchAction.listMatchDetail(giaidau).size();
        //model.addObject("count", count);
        //model.addObject("offset", offset);
        List<String> listGiai = new ArrayList<String>();
        String giai = "";
        for (int i = 0; i < searchMatchList.size(); i++) {
            giai = searchMatchList.get(i).getGiai();
            if (!listGiai.contains(giai)) {
                listGiai.add(giai);
            }
        }

        List<Match> seasonListAll = matchAction.listMatchAllSearch();
        List<Match> seasonList = new ArrayList<>();
        Match match = null;
        for (int i = 0; i < seasonListAll.size(); i++) {
            match = seasonListAll.get(i);
            if (!seasonList.contains(match)) {
                seasonList.add(match);
            }
        }
        model.addObject("seasonListAll", seasonListAll);
        List<ClubInfo> clubInfoList = clubInfoAction.getDataClubInfo();
        model.addObject("clubInfoList", clubInfoList);
        model.addObject("listContact", searchMatchList);
        model.addObject("listGiai", listGiai);

        List<Match> seasonName = matchAction.listMatchDetail(giaidau);
        int seasonNameCount = seasonName.size();
        model.addObject("seasonList", seasonList);
        model.addObject("count", seasonNameCount);
        model.addObject("offset", offset);
        String magiai = "";
        if(giaidau.equals("V-League")) {
            magiai = "giaiVLeague";
        }
        if(giaidau.equals("SeaGame")) {
            magiai = "giaiSeagame";
        }
        if(giaidau.equals("EPL")) {
            magiai = "giaiNgoaiHang";
        }
        if(giaidau.equals("CupC1")) {
            magiai = "giaiCupC1";
        }
        if(giaidau.equals("GiaoHuu")) {
            magiai = "giaiGiaoHuu";
        }
        model.addObject("magiai", magiai);

        return model;
    }
}
