package net.codejava.spring.dao;

import net.codejava.spring.model.Booking;

/**
 * Đây là DAO của trang Đặt Vé.
 * 
 * @author DungLT-28/02/2017
 * 
 */
public interface BookingDAO {

    public Booking getDataMatchInfo(int id, int vong, String matran);

}
