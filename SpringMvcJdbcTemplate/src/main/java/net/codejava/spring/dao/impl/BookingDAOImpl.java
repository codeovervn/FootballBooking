package net.codejava.spring.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import net.codejava.spring.dao.BookingDAO;
import net.codejava.spring.model.Booking;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * Đây là DAOImpl của trang Đặt Vé
 * 
 * @author DungLT-28/02/2017
 * 
 */
public class BookingDAOImpl implements BookingDAO {

    private JdbcTemplate jdbcTemplate;

    public BookingDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    /** 
     * Phương thức để truy vấn 1 trận đấu.
     * 
     * @param int id
     * @param int vong
     * @param String matran
     * 
     * @return : DAOImpl bookingInfo
     */
    @Override
    public Booking getDataMatchInfo(int id, int vong, String matran) {
        String sql = "SELECT * FROM fbmatchs WHERE id = ? AND vong = ? AND matran = ?";
        Booking getMatchInfo;
        try {
            getMatchInfo = jdbcTemplate.queryForObject(sql, new RowMapper<Booking>() {
                @Override
                public Booking mapRow(ResultSet rs, int rowNum) throws SQLException {
                    Booking matchInfo = new Booking();

                    matchInfo.setId(rs.getInt("id"));
                    matchInfo.setGiai(rs.getString("giai"));
                    matchInfo.setTengiai(rs.getString("tengiai"));
                    matchInfo.setVong(rs.getInt("vong"));
                    matchInfo.setMatran(rs.getString("matran"));
                    matchInfo.setMachunha(rs.getString("machunha"));
                    matchInfo.setChunha(rs.getString("chunha"));
                    matchInfo.setTyso(rs.getString("tyso"));
                    matchInfo.setMakhach(rs.getString("makhach"));
                    matchInfo.setKhach(rs.getString("khach"));
                    matchInfo.setSan(rs.getString("san"));
                    matchInfo.setNgay(rs.getString("ngay"));
                    matchInfo.setNam(rs.getInt("nam"));
                    matchInfo.setStatus(rs.getInt("status"));

                    return matchInfo;
                }
            }, id, vong, matran);
        } catch(IncorrectResultSizeDataAccessException iex) {
            getMatchInfo = new Booking();
        }
        return getMatchInfo;
    }
}
