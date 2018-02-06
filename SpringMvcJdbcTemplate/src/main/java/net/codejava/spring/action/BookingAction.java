package net.codejava.spring.action;

import org.springframework.beans.factory.annotation.Autowired;

import net.codejava.spring.model.Booking;
import net.codejava.spring.service.BookingService;

/**
 * Đây là Action của trang Đặt Vé
 * 
 * @author DungLT-28/02/2017
 * 
 */
public class BookingAction {

    @Autowired
    BookingService bookingService;

    public Booking getDataMatchInfo(int id, int vong, String matran) {
        Booking getMatchInfo = bookingService.getDataMatchInfo(id, vong, matran);
        return getMatchInfo;
    }
}
