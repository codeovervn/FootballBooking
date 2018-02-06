package net.codejava.spring.dao;

import java.util.List;

import net.codejava.spring.model.ClubInfo;

/**
 * Đây là DAO của trang Thông tin Chi tiết về câu lạc bộ.
 * 
 * @author DungLT-01/03/2017
 * 
 */
public interface ClubInfoDAO {

    public List<ClubInfo> getDataClubInfo();

    public ClubInfo getDataClubInfo(String madoituyen);

}
