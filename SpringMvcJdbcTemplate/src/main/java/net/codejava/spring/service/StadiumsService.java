package net.codejava.spring.service;

import java.util.List;

import net.codejava.spring.model.Stadium;

public interface StadiumsService {

    public List<Stadium> getDataStadiumsAll();

    public void saveOrUpdate(Stadium stadiums);

    public void delete(int stadiumsId);

    public Stadium get(int stadiumsId);

    public Stadium getInfoLogin(String usercode, String password);
}
