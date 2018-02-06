package net.codejava.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.codejava.spring.dao.StadiumsDAO;
import net.codejava.spring.model.Stadium;
import net.codejava.spring.service.StadiumsService;

public class StadiumsServiceImpl implements StadiumsService {

    @Autowired
    private StadiumsDAO stadiumsDAO;

    /** 
     * Phương thức hiển thị trang Quản lý Vé dành riêng cho Admin.
     * 
     * @return : Service ticket
     */
    @Override
    public List<Stadium> getDataStadiumsAll() {
        List<Stadium> getDataUsersAll = stadiumsDAO.getDataStadiumsAll();
        return getDataUsersAll;
    }

    @Override
    public void saveOrUpdate(Stadium stadium) {
        stadiumsDAO.saveOrUpdate(stadium);
    }

    @Override
    public void delete(int stadium) {
        stadiumsDAO.delete(stadium);
    }

    @Override
    public Stadium get(int stadiumId) {
        Stadium stadium = stadiumsDAO.get(stadiumId);
        return stadium;
    }

    @Override
    public Stadium getInfoLogin(String usercode, String password) {
        Stadium stadium = stadiumsDAO.getInfoLogin(usercode, password);
        return stadium;
    }
}
