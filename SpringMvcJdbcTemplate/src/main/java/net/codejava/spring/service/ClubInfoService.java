package net.codejava.spring.service;

import java.util.List;

import net.codejava.spring.model.ClubInfo;

public interface ClubInfoService {

    public List<ClubInfo> getDataClubInfo();

    public ClubInfo getDataClubInfo(String madoituyen);

    public void saveOrUpdate(ClubInfo users);

    public void delete(int usersId);

    public ClubInfo get(int usersId);

    public ClubInfo getInfoLogin(String usercode, String password);
}
