package net.codejava.spring.service.impl;


import org.springframework.beans.factory.annotation.Autowired;

import net.codejava.spring.dao.BookingDAO;
import net.codejava.spring.model.Booking;
import net.codejava.spring.service.BookingService;

public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingDAO bookingDAO;

    /** 
     * Phương thức hiển thị trang Đặt Vé chi tiết.
     * 
     * @param int id
     * @param int vong
     * @param String matran
     * 
     * @return : Service bookingInfo
     */
    @Override
    public Booking getDataMatchInfo(int id, int vong, String matran) {

        Booking bookingInfo = bookingDAO.getDataMatchInfo(id, vong, matran);
        return bookingInfo;
    }
}
