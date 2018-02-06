package net.codejava.spring.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import net.codejava.spring.dao.TicketsDAO;
import net.codejava.spring.model.Ticket;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

/**
 * Đây là DAOImpl của trang Quản lý Vé dành riêng cho Admin.
 * 
 * @author DungLT-05/03/2017
 * 
 */
public class TicketsDAOImpl implements TicketsDAO {

    private JdbcTemplate jdbcTemplate;

    public TicketsDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    /** 
     * Phương thức để truy vấn toàn bộ thông tin người dùng.
     * 
     * @return : DAOImpl getTicketsInfoList
     */
    @Override
    public List<Ticket> getDataTicketsAll() {

        String sql = "SELECT * FROM fbTickets";
        List<Ticket> getTicketsInfoList;
        try {
            getTicketsInfoList = jdbcTemplate.query(sql, new RowMapper<Ticket>() {
                @Override
                public Ticket mapRow(ResultSet rs, int rowNum) throws SQLException {
                    Ticket ticketsInfo = new Ticket();

                    ticketsInfo.setId(rs.getInt("id"));
                    ticketsInfo.setGiaidau(rs.getString("giaidau"));
                    ticketsInfo.setVongdau(rs.getString("vongdau"));
                    ticketsInfo.setTrandau(rs.getString("trandau"));
                    ticketsInfo.setSandau(rs.getString("sandau"));
                    ticketsInfo.setKhandai(rs.getString("khandai"));
                    ticketsInfo.setCuaso(rs.getString("cuaso"));
                    ticketsInfo.setGiave(rs.getString("giave"));
                    ticketsInfo.setCreateDate(rs.getString("createDate"));
                    ticketsInfo.setCreateBy(rs.getString("createBy"));
                    ticketsInfo.setUpdateDate(rs.getString("updateDate"));
                    return ticketsInfo;
                }
            });
        } catch(IncorrectResultSizeDataAccessException iex) {
            getTicketsInfoList = new ArrayList<>();
        }
        return getTicketsInfoList;
    }

    /** 
     * Phương thức để truy vấn thông tin của 1 người dùng.
     * 
     * @param : TicketsId : tên người dùng.
     * 
     * @return : Tickets TicketsInfo <thông tin của 1 người dùng>.
     */
    @Override
    public Ticket get(int TicketsId) {
        String sql = "SELECT * FROM fbTickets WHERE id = ?";
        return jdbcTemplate.query(sql, new ResultSetExtractor<Ticket>() {

            @Override
            public Ticket extractData(ResultSet rs) throws SQLException, DataAccessException {
                if (rs.next()) {
                    Ticket ticketsInfo = new Ticket();
                    ticketsInfo.setId(rs.getInt("id"));
                    ticketsInfo.setGiaidau(rs.getString("giaidau"));
                    ticketsInfo.setVongdau(rs.getString("vongdau"));
                    ticketsInfo.setTrandau(rs.getString("trandau"));
                    ticketsInfo.setSandau(rs.getString("sandau"));
                    ticketsInfo.setKhandai(rs.getString("khandai"));
                    ticketsInfo.setCuaso(rs.getString("cuaso"));
                    ticketsInfo.setGiave(rs.getString("giave"));
                    ticketsInfo.setTrangthai(rs.getString("trangthai"));
                    ticketsInfo.setCreateDate(rs.getString("createDate"));
                    ticketsInfo.setCreateBy(rs.getString("createBy"));
                    ticketsInfo.setUpdateDate(rs.getString("updateDate"));
                    return ticketsInfo;
                }
                return null;
            }
        }, TicketsId);
    }

    @Override
    public void saveOrUpdate(Ticket tickets) {
        if (tickets.getId() > 0) {
            // update
            String sql = "UPDATE fbTickets SET logo = ?, name = ?, birthday = ?, address = ?, job = ?, user = ?, "
                    + " password = ?, admin = ?, createDate = ?, createBy=?, updateDate = ? WHERE id = ?";
            try {
            jdbcTemplate.update(sql, tickets.getGiaidau(), tickets.getVongdau(), tickets.getTrandau(), tickets.getSandau(), tickets.getKhandai(), tickets.getCuaso(), 
                    tickets.getGiave(), tickets.getCreateDate(), tickets.getCreateBy(), tickets.getUpdateDate(), tickets.getId());
            } catch (Exception e) {
                // handle exception
            }
        } else {
            // insert
            String sql = "INSERT INTO fbTickets (logo, name, birthday, address, job,  user, password, admin, "
                    + " createDate, createBy, updateDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            jdbcTemplate.update(sql, tickets.getGiaidau(), tickets.getVongdau(), tickets.getTrandau(), tickets.getSandau(), tickets.getKhandai(), tickets.getCuaso(), 
                    tickets.getGiave(), tickets.getCreateDate(), tickets.getCreateBy(), tickets.getUpdateDate());
        }
    }

    @Override
    public void delete(int ticketsId) {
        String sql = "DELETE FROM fbTickets WHERE id = ?";
        try{
            jdbcTemplate.update(sql, ticketsId);
        } catch (Exception e) {
            // handle exception
        }
    }

    @Override
    public Ticket getInfoLogin(String usercode, String password) {
        String sql = "SELECT * FROM fbTickets WHERE user = ? AND password = ?";
        Ticket getUserInfoLogin;
        try{
            getUserInfoLogin = jdbcTemplate.queryForObject(sql, new RowMapper<Ticket>() {
                @Override
                public Ticket mapRow(ResultSet rs, int rowNum) throws SQLException {
                    Ticket ticketsInfo = new Ticket();
                    ticketsInfo.setId(rs.getInt("id"));
                    ticketsInfo.setGiaidau(rs.getString("giaidau"));
                    ticketsInfo.setVongdau(rs.getString("vongdau"));
                    ticketsInfo.setTrandau(rs.getString("trandau"));
                    ticketsInfo.setSandau(rs.getString("sandau"));
                    ticketsInfo.setKhandai(rs.getString("khandai"));
                    ticketsInfo.setCuaso(rs.getString("cuaso"));
                    ticketsInfo.setGiave(rs.getString("giave"));
                    ticketsInfo.setCreateDate(rs.getString("createDate"));
                    ticketsInfo.setCreateBy(rs.getString("createBy"));
                    ticketsInfo.setUpdateDate(rs.getString("updateDate"));
                    return ticketsInfo;
                }
            }, usercode, password);
        } catch (Exception e) {
            // handle exception
            return null;
        }
        return getUserInfoLogin;
    }
}
