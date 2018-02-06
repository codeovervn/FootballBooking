package net.codejava.spring.dao;

import java.util.List;

import net.codejava.spring.model.Stadium;

/**
 * Đây là DAO của trang Quản lý Sân dành riêng cho Admin.
 * 
 * @author DungLT-13/03/2017
 * 
 */
public interface StadiumsDAO {

    public List<Stadium> getDataStadiumsAll();

    public void saveOrUpdate(Stadium stadium);

    public void delete(int stadiumsId);

    public Stadium get(int stadiumsId);

    public Stadium getInfoLogin(String usercode, String password);

}
