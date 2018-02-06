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
 * Đây là trang Lịch Thi Đấu
 * 
 * @author DungLT-27/02/2017
 * 
 */
@Controller
public class MatchController {

    @Autowired
    private MatchAction matchAction;

    @Autowired
    private ClubInfoAction clubInfoAction;

    @RequestMapping(value = "/lichThiDau", method = RequestMethod.GET)
    public ModelAndView lichThiDau(ModelAndView model, HttpServletRequest request, Integer offset) {

        if(offset == null) {
            offset = 0;
        }

        /*String moreId = request.getParameter("moreId");
        List<Match> listContact;
        if (StringUtils.isEmpty(moreId)) {
            listContact = matchAction.listMatchAll();
            //System.out.println(">>>>>>>>>>>>>>>>" + listContact.size());
        } else {
            listContact = matchAction.listMatchDetail(moreId, 10, 10);
            System.out.println(">>>>....." + listContact.size());
        }*/

        List<Match> listContact = matchAction.listMatchAll();
        model.addObject("count", listContact.size());
        model.addObject("offset", offset);
        List<String> listGiai = new ArrayList<String>();
        //List<String> listTenGiai = new ArrayList<String>();
        //String tenGiai = "";
        String giai = "";
        for (int i = 0; i < listContact.size(); i++) {
            giai = listContact.get(i).getGiai();
            //tenGiai = listContact.get(i).getTengiai();
            if (!listGiai.contains(giai)) {
                listGiai.add(giai);
                //listTenGiai.add(tenGiai);
            }
        }

        List<Match> seasonListAll = matchAction.listMatchAllSearch();
        model.addObject("seasonListAll", seasonListAll);

        List<ClubInfo> clubInfoList = clubInfoAction.getDataClubInfo();
        model.addObject("clubInfoList", clubInfoList);
        model.addObject("listContact", listContact);
        model.addObject("listGiai", listGiai);
        //model.addObject("listTenGiai", listTenGiai);
        model.setViewName("pages/lichThiDau");

        return model;
    }

    @RequestMapping(value = "/giaiVLeague", method = RequestMethod.GET)
    public ModelAndView lichGiaiVLeague(ModelAndView model, HttpServletRequest request, Integer offset) {
        String giai = "V-League";
        String magiai = "giaiVLeague";
        loadPaging(model, request, giai, offset, magiai);
        model.setViewName("pages/lichThiDau");
        return model;
    }

    @RequestMapping(value = "/giaiSeagame", method = RequestMethod.GET)
    public ModelAndView lichGiaiSeagame(ModelAndView model, HttpServletRequest request, Integer offset) {

        String giai = "SeaGame";
        String magiai = "giaiSeagame";
        loadPaging(model, request, giai, offset, magiai);
        model.setViewName("pages/lichThiDau");

        return model;
    }

    @RequestMapping(value = "/giaiNgoaiHang", method = RequestMethod.GET)
    public ModelAndView lichGiaiNgoaiHang(ModelAndView model, HttpServletRequest request, Integer offset) {

        String giai = "EPL";
        String magiai = "giaiNgoaiHang";
        loadPaging(model, request, giai, offset, magiai);
        model.setViewName("pages/lichThiDau");

        return model;
    }

    @RequestMapping(value = "/giaiCupC1", method = RequestMethod.GET)
    public ModelAndView lichGiaiCupC1(ModelAndView model, HttpServletRequest request, Integer offset) {

        String giai = "CupC1";
        String magiai = "giaiCupC1";
        loadPaging(model, request, giai, offset, magiai);
        model.setViewName("pages/lichThiDau");

        return model;
    }

    @RequestMapping(value = "/giaiGiaoHuu", method = RequestMethod.GET)
    public ModelAndView lichGiaiGiaoHuu(ModelAndView model, HttpServletRequest request, Integer offset) {

        String giai = "GiaoHuu";
        String magiai = "giaiGiaoHuu";
        loadPaging(model, request, giai, offset, magiai);
        model.setViewName("pages/lichThiDau");

        return model;
    }

    public ModelAndView loadPaging(ModelAndView model, HttpServletRequest request, String strGiai, Integer offset, String magiai) {

        if(offset == null) {
            offset = 0;
        }
        if(request.getAttribute("checkdangnhap") == null || !request.getAttribute("checkdangnhap").equals("1")){
            request.setAttribute("checkdangnhap", "0");
        }

        List<Match> listMatchDetail = matchAction.listMatchDetail(strGiai, offset, 10);
        //request.setAttribute("listContact", listContact);
        List<Match> seasonName = matchAction.listMatchDetail(strGiai);

        List<Match> seasonListAllSearch = matchAction.listMatchAllSearch();
        List<Match> seasonListAll = matchAction.listMatchAll();
        model.addObject("seasonListAll", seasonListAllSearch);
        List<Match> seasonList = new ArrayList<>();
        Match match = null;
        for (int i = 0; i < seasonListAll.size(); i++) {
            match = seasonListAll.get(i);
            if (!seasonList.contains(match)) {
                seasonList.add(match);
            }
        }
        int seasonNameCount = seasonName.size();
        String giai = "";
        List<String> listGiai = new ArrayList<String>();
        for (int i = 0; i < listMatchDetail.size(); i++) {
            giai = listMatchDetail.get(i).getGiai();
            if (!listGiai.contains(giai)) {
                listGiai.add(giai);
            }
        }

        List<ClubInfo> clubInfoList = clubInfoAction.getDataClubInfo();
        model.addObject("seasonList", seasonList);
        model.addObject("count", seasonNameCount);
        model.addObject("offset", offset);
        model.addObject("magiai", magiai);
        model.addObject("clubInfoList", clubInfoList);
        model.addObject("listContact", listMatchDetail);
        model.addObject("listGiai", listGiai);

        return model;
    }

    @RequestMapping(value = "/xemlaitrandau", method = RequestMethod.GET)
    public ModelAndView loadReviewMatch(ModelAndView model, HttpServletRequest request, Integer offset) {

        if(offset == null) {
            offset = 0;
        }
        if(request.getAttribute("checkdangnhap") == null || !request.getAttribute("checkdangnhap").equals("1")){
            request.setAttribute("checkdangnhap", "0");
        }
        model.setViewName("pages/xemlai");

        return model;
    }
}
