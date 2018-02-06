package net.codejava.spring.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.codejava.spring.model.Stadium;
import net.codejava.spring.service.StadiumsService;

/**
 * Đây là Action của trang Thông tin về Sân Vận Động.
 * 
 * @author DungLT-13/03/2017
 * 
 */
public class StadiumsAction {

    @Autowired
    StadiumsService stadiumsService;

    public List<Stadium> getDataStadium() {
        List<Stadium> getStadiumList = stadiumsService.getDataStadiumsAll();
        return getStadiumList;
    }

    public void saveOrUpdate(Stadium stadium) {
        stadiumsService.saveOrUpdate(stadium);
    }

    public void delete(int stadiumId) {
        stadiumsService.delete(stadiumId);
    }

    public Stadium get(int stadiumId) {
        Stadium stadium = stadiumsService.get(stadiumId);
        return stadium;
    }

    public Stadium getInfoLogin(String usercode, String password) {
        Stadium stadium = stadiumsService.getInfoLogin(usercode, password);
        return stadium;
    }
}
