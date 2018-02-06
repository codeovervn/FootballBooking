package net.codejava.spring.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.codejava.spring.model.ClubInfo;
import net.codejava.spring.service.ClubInfoService;

/**
 * Đây là Action của trang Thông tin về Club.
 * 
 * @author DungLT-28/02/2017
 * 
 */
public class ClubInfoAction {

    @Autowired
    ClubInfoService clubInfoService;

    public List<ClubInfo> getDataClubInfo() {
        List<ClubInfo> getClubInfoList = clubInfoService.getDataClubInfo();
        return getClubInfoList;
    }

    public ClubInfo getDataClubInfo(String madoituyen) {
        ClubInfo getClubInfo = clubInfoService.getDataClubInfo(madoituyen);
        return getClubInfo;
    }

    public void saveOrUpdate(ClubInfo clubInfo) {
        clubInfoService.saveOrUpdate(clubInfo);
    }

    public void delete(int clubInfoId) {
        clubInfoService.delete(clubInfoId);
    }

    public ClubInfo get(int clubInfoId) {
        ClubInfo clubInfo = clubInfoService.get(clubInfoId);
        return clubInfo;
    }

    public ClubInfo getInfoLogin(String usercode, String password) {
        ClubInfo clubInfo = clubInfoService.getInfoLogin(usercode, password);
        return clubInfo;
    }
}
