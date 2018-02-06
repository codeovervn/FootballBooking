package net.codejava.spring.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.codejava.spring.dao.ClubInfoDAO;
import net.codejava.spring.model.ClubInfo;
import net.codejava.spring.service.ClubInfoService;

public class ClubInfoServiceImpl implements ClubInfoService {

    @Autowired
    private ClubInfoDAO clubInfoDAO;

    /** 
     * Phương thức hiển thị trang Thông tin chi tiết của 1 câu lạc bộ.
     * 
     * @return : Service clubInfo
     */
    @Override
    public List<ClubInfo> getDataClubInfo() {

        List<ClubInfo> clubInfoList = clubInfoDAO.getDataClubInfo();
        return clubInfoList;
    }

    /** 
     * Phương thức hiển thị trang Thông tin chi tiết của 1 câu lạc bộ.
     * 
     * @param String madoituyen
     * 
     * @return : Service clubInfo
     */
    @Override
    public ClubInfo getDataClubInfo(String madoituyen) {

        ClubInfo clubInfo = clubInfoDAO.getDataClubInfo(madoituyen);
        return clubInfo;
    }

    public void saveOrUpdate(ClubInfo users) {
    }

    public void delete(int usersId) {
    }

    public ClubInfo get(int usersId) {
        ClubInfo clubInfo = new ClubInfo();
        return clubInfo;
    }

    public ClubInfo getInfoLogin(String usercode, String password) {
        ClubInfo clubInfo = new ClubInfo();
        return clubInfo;
    }
}
