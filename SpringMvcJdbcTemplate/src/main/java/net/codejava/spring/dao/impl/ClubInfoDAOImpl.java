package net.codejava.spring.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import net.codejava.spring.dao.ClubInfoDAO;
import net.codejava.spring.model.ClubInfo;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * Đây là DAOImpl của trang Đặt Vé
 * 
 * @author DungLT-28/02/2017
 * 
 */
public class ClubInfoDAOImpl implements ClubInfoDAO {

    private JdbcTemplate jdbcTemplate;

    public ClubInfoDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    /** 
     * Phương thức để truy vấn thông tin của 1 câu lạc bộ.
     * 
     * @return : DAOImpl clubInfo
     */
    @Override
    public List<ClubInfo> getDataClubInfo() {
        String sql = "SELECT id, madoituyen, tendoituyen FROM fbclubs";
        List<ClubInfo> getClubInfoList;
        try {
            getClubInfoList = jdbcTemplate.query(sql, new RowMapper<ClubInfo>() {
                @Override
                public ClubInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
                    ClubInfo clubInfo = new ClubInfo();

                    clubInfo.setId(rs.getInt("id"));
                    clubInfo.setMadoituyen(rs.getString("madoituyen"));
                    clubInfo.setTendoituyen(rs.getString("tendoituyen"));
                    /*clubInfo.setMatrandau(rs.getString("matrandau"));
                    clubInfo.setNgaythanhlap(rs.getString("ngaythanhlap"));
                    clubInfo.setThongtin(rs.getString("thongtin"));
                    clubInfo.setThanhpho(rs.getString("thanhpho"));
                    clubInfo.setHLV(rs.getString("HLV"));
                    clubInfo.setDanhhieu(rs.getString("danhhieu"));*/

                    return clubInfo;
                }
            });
        } catch(IncorrectResultSizeDataAccessException iex) {
            getClubInfoList = new ArrayList<>();
        }

        return getClubInfoList;
    }

    /** 
     * Phương thức để truy vấn thông tin của 1 câu lạc bộ.
     * 
     * @param int id
     * @param int vong
     * @param String matran
     * 
     * @return : DAOImpl clubInfo
     */
    @Override
    public ClubInfo getDataClubInfo(String madoituyen) {
        String sql = "SELECT * FROM fbclubs WHERE madoituyen = ?";
        ClubInfo getClubInfo;
        try {
            getClubInfo = jdbcTemplate.queryForObject(sql, new RowMapper<ClubInfo>() {
                @Override
                public ClubInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
                    ClubInfo clubInfo = new ClubInfo();

                    clubInfo.setId(rs.getInt("id"));
                    clubInfo.setMadoituyen(rs.getString("madoituyen"));
                    clubInfo.setTendoituyen(rs.getString("tendoituyen"));
                    clubInfo.setMatrandau(rs.getString("matrandau"));
                    clubInfo.setNgaythanhlap(rs.getString("ngaythanhlap"));
                    clubInfo.setThongtin(rs.getString("thongtin"));
                    clubInfo.setThanhpho(rs.getString("thanhpho"));
                    clubInfo.setHLV(rs.getString("HLV"));
                    clubInfo.setDanhhieu(rs.getString("danhhieu"));
//                    clubInfo.setKhach(rs.getString("khach"));
//                    clubInfo.setSan(rs.getString("san"));
//                    clubInfo.setNgay(rs.getString("ngay"));
//                    clubInfo.setNam(rs.getInt("nam"));
//                    clubInfo.setStatus(rs.getInt("status"));

                    return clubInfo;
                }
            }, madoituyen);
        } catch(IncorrectResultSizeDataAccessException iex) {
            getClubInfo = new ClubInfo();
        }

        return getClubInfo;
    }
}
