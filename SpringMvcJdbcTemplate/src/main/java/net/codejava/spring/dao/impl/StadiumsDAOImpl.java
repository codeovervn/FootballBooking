package net.codejava.spring.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import net.codejava.spring.dao.StadiumsDAO;
import net.codejava.spring.model.Stadium;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

/**
 * Đây là DAOImpl của trang Quản lý Sân dành riêng cho Admin.
 * 
 * @author DungLT-13/03/2017
 * 
 */
public class StadiumsDAOImpl implements StadiumsDAO {

    private JdbcTemplate jdbcTemplate;

    public StadiumsDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    /** 
     * Phương thức để truy vấn toàn bộ thông tin người dùng.
     * 
     * @return : DAOImpl getStadiumsInfoList
     */
    @Override
    public List<Stadium> getDataStadiumsAll() {

        String sql = "SELECT * FROM fbStadiums";
        List<Stadium> getStadiumsInfoList;
        try {
            getStadiumsInfoList = jdbcTemplate.query(sql, new RowMapper<Stadium>() {
                @Override
                public Stadium mapRow(ResultSet rs, int rowNum) throws SQLException {
                    Stadium stadiumsInfo = new Stadium();
                    stadiumsInfo.setId(rs.getInt("id"));
                    stadiumsInfo.setMasan(rs.getString("masan"));
                    stadiumsInfo.setTensan(rs.getString("tensan"));
                    stadiumsInfo.setLogo(rs.getString("logo"));
                    stadiumsInfo.setNgaythanhlap(rs.getString("ngaythanhlap"));
                    stadiumsInfo.setDoichuquan(rs.getString("doichuquan"));
                    stadiumsInfo.setThanhpho(rs.getString("thanhpho"));
                    stadiumsInfo.setSucchua(rs.getString("succhua"));
                    stadiumsInfo.setThongtin(rs.getString("thongtin"));
                    stadiumsInfo.setTrangthai(rs.getString("trangthai"));
                    stadiumsInfo.setCreateDate(rs.getString("createDate"));
                    stadiumsInfo.setCreateBy(rs.getString("createBy"));
                    stadiumsInfo.setUpdateDate(rs.getString("updateDate"));
                    return stadiumsInfo;
                }
            });
        } catch(IncorrectResultSizeDataAccessException iex) {
            getStadiumsInfoList = new ArrayList<>();
        }
        return getStadiumsInfoList;
    }

    /** 
     * Phương thức để truy vấn thông tin của 1 người dùng.
     * 
     * @param : StadiumsId : tên người dùng.
     * 
     * @return : Stadiums StadiumsInfo <thông tin của 1 người dùng>.
     */
    @Override
    public Stadium get(int StadiumsId) {
        String sql = "SELECT * FROM fbStadiums WHERE id = ?";
        return jdbcTemplate.query(sql, new ResultSetExtractor<Stadium>() {

            @Override
            public Stadium extractData(ResultSet rs) throws SQLException, DataAccessException {
                if (rs.next()) {
                    Stadium stadiumsInfo = new Stadium();
                    stadiumsInfo.setId(rs.getInt("id"));
                    stadiumsInfo.setMasan(rs.getString("masan"));
                    stadiumsInfo.setTensan(rs.getString("tensan"));
                    stadiumsInfo.setLogo(rs.getString("logo"));
                    stadiumsInfo.setNgaythanhlap(rs.getString("ngaythanhlap"));
                    stadiumsInfo.setDoichuquan(rs.getString("doichuquan"));
                    stadiumsInfo.setThanhpho(rs.getString("thanhpho"));
                    stadiumsInfo.setSucchua(rs.getString("succhua"));
                    stadiumsInfo.setThongtin(rs.getString("thongtin"));
                    stadiumsInfo.setTrangthai(rs.getString("trangthai"));
                    stadiumsInfo.setCreateDate(rs.getString("createDate"));
                    stadiumsInfo.setCreateBy(rs.getString("createBy"));
                    stadiumsInfo.setUpdateDate(rs.getString("updateDate"));
                    return stadiumsInfo;
                }
                return null;
            }
        }, StadiumsId);
    }

    @Override
    public void saveOrUpdate(Stadium stadiums) {
        if (stadiums.getId() > 0) {
            // update
            String sql = "UPDATE fbStadiums SET logo = ?, name = ?, birthday = ?, address = ?, job = ?, user = ?, "
                    + " password = ?, admin = ?, createDate = ?, createBy=?, updateDate = ? WHERE id = ?";
            try {
            jdbcTemplate.update(sql, stadiums.getMasan(), stadiums.getTensan(), stadiums.getLogo(), stadiums.getNgaythanhlap(), stadiums.getDoichuquan(), stadiums.getThanhpho(), 
                    stadiums.getSucchua(), stadiums.getThongtin(), stadiums.getTrangthai(), stadiums.getCreateDate(), stadiums.getCreateBy(), stadiums.getUpdateDate(), stadiums.getId());
            } catch (Exception e) {
                // handle exception
            }
        } else {
            // insert
            String sql = "INSERT INTO fbStadiums (logo, name, birthday, address, job,  user, password, admin, "
                    + " createDate, createBy, updateDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            jdbcTemplate.update(sql, stadiums.getMasan(), stadiums.getTensan(), stadiums.getLogo(), stadiums.getNgaythanhlap(), stadiums.getDoichuquan(), stadiums.getThanhpho(), 
                    stadiums.getSucchua(), stadiums.getThongtin(), stadiums.getTrangthai(), stadiums.getCreateDate(), stadiums.getCreateBy(), stadiums.getUpdateDate(), stadiums.getId());
        }
    }

    @Override
    public void delete(int StadiumsId) {
        String sql = "DELETE FROM fbStadiums WHERE id = ?";
        try{
            jdbcTemplate.update(sql, StadiumsId);
        } catch (Exception e) {
            // handle exception
        }
    }

    @Override
    public Stadium getInfoLogin(String usercode, String password) {
        String sql = "SELECT * FROM fbStadiums WHERE user = ? AND password = ?";
        Stadium getUserInfoLogin;
        try{
            getUserInfoLogin = jdbcTemplate.queryForObject(sql, new RowMapper<Stadium>() {
                @Override
                public Stadium mapRow(ResultSet rs, int rowNum) throws SQLException {
                    Stadium stadiumsInfo = new Stadium();
                    stadiumsInfo.setId(rs.getInt("id"));
                    stadiumsInfo.setMasan(rs.getString("masan"));
                    stadiumsInfo.setTensan(rs.getString("tensan"));
                    stadiumsInfo.setLogo(rs.getString("logo"));
                    stadiumsInfo.setNgaythanhlap(rs.getString("ngaythanhlap"));
                    stadiumsInfo.setDoichuquan(rs.getString("doichuquan"));
                    stadiumsInfo.setThanhpho(rs.getString("thanhpho"));
                    stadiumsInfo.setSucchua(rs.getString("succhua"));
                    stadiumsInfo.setThongtin(rs.getString("thongtin"));
                    stadiumsInfo.setTrangthai(rs.getString("trangthai"));
                    stadiumsInfo.setCreateDate(rs.getString("createDate"));
                    stadiumsInfo.setCreateBy(rs.getString("createBy"));
                    stadiumsInfo.setUpdateDate(rs.getString("updateDate"));
                    return stadiumsInfo;
                }
            }, usercode, password);
        } catch (Exception e) {
            // handle exception
            return null;
        }
        return getUserInfoLogin;
    }
}
