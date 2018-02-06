package net.codejava.spring.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import net.codejava.spring.dao.MatchDAO;
import net.codejava.spring.model.Match;
import net.codejava.spring.util.MatchResultSetUtil;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.util.StringUtils;

/**
 * Đây là DAOImpl của trang Lịch Thi Đấu
 * 
 * @author DungLT-27/02/2017
 * 
 */
public class MatchDAOImpl implements MatchDAO {

    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public MatchDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    /** 
     * Phương thức để truy vấn toàn bộ giải đấu. 
     */
    @Override
    public List<Match> listMatchAll() {
        //String sql = "SELECT * FROM fbmatchs WHERE giai IN (SELECT giai FROM fbmatchs ORDER BY giai) ORDER BY vong";
        //String sql = "SELECT * FROM fbmatchs";
    	String sql = "SELECT * FROM fbmatchs ORDER BY giai DESC, vong DESC;";
        List<Match> listMatchInfo = jdbcTemplate.query(sql, new RowMapper<Match>() {

            @Override
            public Match mapRow(ResultSet rs, int rowNum) throws SQLException {
                Match matchInfo = new Match();

                matchInfo.setId(rs.getString("id"));
                matchInfo.setGiai(rs.getString("giai"));
                matchInfo.setTengiai(rs.getString("tengiai"));
                matchInfo.setVong(rs.getString("vong"));
                matchInfo.setMatran(rs.getString("matran"));
                matchInfo.setChunha(rs.getString("chunha"));
                matchInfo.setTyso(rs.getString("tyso"));
                matchInfo.setKhach(rs.getString("khach"));
                matchInfo.setNgay(rs.getString("ngay"));
                matchInfo.setStatus(rs.getString("status"));

                return matchInfo;
            }
        });
        return listMatchInfo;
    }

    /** 
     * Phương thức để truy vấn toàn bộ giải đấu. 
     */
    @Override
    public List<Match> listMatchAllSearch() {
        String sql = "SELECT DISTINCT giai, tengiai FROM fbmatchs ";
        List<Match> listMatchInfo = jdbcTemplate.query(sql, new RowMapper<Match>() {

            @Override
            public Match mapRow(ResultSet rs, int rowNum) throws SQLException {
                Match matchInfo = new Match();

                //matchInfo.setId(rs.getString("id"));
                matchInfo.setGiai(rs.getString("giai"));
                matchInfo.setTengiai(rs.getString("tengiai"));

                return matchInfo;
            }
        });
        return listMatchInfo;
    }

    /** 
     * Phương thức để truy vấn từng giải đấu. 
     */
    @Override
    public List<Match> listMatchDetail(String giai) {
        String sql = "SELECT * FROM fbmatchs WHERE giai = ?";
        List<Match> listMatchInfo = jdbcTemplate.query(sql, new RowMapper<Match>() {

            @Override
            public Match mapRow(ResultSet rs, int rowNum) throws SQLException {
                Match matchInfo = new Match();

                matchInfo.setId(rs.getString("id"));
                matchInfo.setGiai(rs.getString("giai"));
                matchInfo.setTengiai(rs.getString("tengiai"));
                matchInfo.setVong(rs.getString("vong"));
                matchInfo.setMatran(rs.getString("matran"));
                matchInfo.setChunha(rs.getString("chunha"));
                matchInfo.setTyso(rs.getString("tyso"));
                matchInfo.setKhach(rs.getString("khach"));
                matchInfo.setNgay(rs.getString("ngay"));
                matchInfo.setStatus(rs.getString("status"));

                return matchInfo;
            }
        }, giai);
        return listMatchInfo;
    }

    /** 
     * Phương thức để truy vấn từng giải đấu. 
     */
    @Override
    public List<Match> listMatchDetail(String giai, int records, int recordsPerPage) {
        String sql = "SELECT * FROM fbmatchs WHERE giai = ? LIMIT ?, ?";
        List<Match> listMatchInfo = jdbcTemplate.query(sql, new RowMapper<Match>() {

            @Override
            public Match mapRow(ResultSet rs, int rowNum) throws SQLException {
                Match matchInfo = new Match();

                matchInfo.setId(rs.getString("id"));
                matchInfo.setGiai(rs.getString("giai"));
                matchInfo.setTengiai(rs.getString("tengiai"));
                matchInfo.setVong(rs.getString("vong"));
                matchInfo.setMatran(rs.getString("matran"));
                matchInfo.setChunha(rs.getString("chunha"));
                matchInfo.setTyso(rs.getString("tyso"));
                matchInfo.setKhach(rs.getString("khach"));
                matchInfo.setNgay(rs.getString("ngay"));
                matchInfo.setStatus(rs.getString("status"));

                return matchInfo;
            }
        }, giai, records, recordsPerPage);
        return listMatchInfo;
    }

    /** 
     * Phương thức để truy vấn vòng đấu của từng giải đấu. 
     */
    @Override
    public List<Match> searchMatchList(String giai, String vong, String doituyen, int records, int recordsPerPage) {
        /*String sql = "SELECT * FROM fbmatchs WHERE giai = ? AND vong = ? LIMIT ?, ?";
        List<Match> searchMatchList = jdbcTemplate.query(sql, new RowMapper<Match>() {

            @Override
            public Match mapRow(ResultSet rs, int rowNum) throws SQLException {
                Match matchInfo = new Match();

                matchInfo.setId(rs.getString("id"));
                matchInfo.setGiai(rs.getString("giai"));
                matchInfo.setTengiai(rs.getString("tengiai"));
                matchInfo.setVong(rs.getString("vong"));
                matchInfo.setMatran(rs.getString("matran"));
                matchInfo.setChunha(rs.getString("chunha"));
                matchInfo.setTyso(rs.getString("tyso"));
                matchInfo.setKhach(rs.getString("khach"));
                matchInfo.setNgay(rs.getString("ngay"));

                return matchInfo;
            }
        }, giai, vong, records, recordsPerPage);
        return searchMatchList;*/

        boolean flg = false;
        Map<String, Object> nameParameter = new HashMap<>();
        String sql = "SELECT * FROM fbmatchs ";
        sql += "WHERE 1 = 1 ";
        if (!StringUtils.isEmpty(giai)) {
            sql += "AND giai = :giai ";
            nameParameter.put("giai", giai);
            flg = true;
        }
        if (!StringUtils.isEmpty(vong)) {
            sql += "AND vong = :vong ";
            nameParameter.put("vong", vong);
        }
        if (!StringUtils.isEmpty(doituyen)) {
            sql += "AND (machunha = :doituyen OR makhach = :doituyen ) ";
            nameParameter.put("doituyen", doituyen);
        }
        if (flg) {
            sql += "LIMIT :records, :recordsPerPage ";
        }
        nameParameter.put("records", records);
        nameParameter.put("recordsPerPage", recordsPerPage);

        //String sql = "SELECT * FROM fbmatchs WHERE giai = ? AND vong = ? LIMIT ?, ?";
        //List<Match> searchMatchList = jdbcTemplate.query(sql, nameParameter, MatchResultSetUtil.extractData());
        List<Match> searchMatchList = namedParameterJdbcTemplate.query(sql, nameParameter, MatchResultSetUtil.extractData());
        return searchMatchList;
    }
}
