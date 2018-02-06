package net.codejava.spring.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import net.codejava.spring.dao.SearchNewsDAO;
import net.codejava.spring.model.SearchNews;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.util.StringUtils;

/**
 * Đây là DAOImpl của trang Tin tức.
 * 
 * @author DungLT-05/03/2017
 * 
 */
public class SearchNewsDAOImpl implements SearchNewsDAO {

    private JdbcTemplate jdbcTemplate;

    public SearchNewsDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    /** 
     * Phương thức để truy vấn 1 trận đấu.
     * 
     * @param String searchnewsname
     * 
     * @return : DAOImpl searchNewsInfoList
     */
    @Override
    public List<SearchNews> getNewsInfo(String searchnewsname) {

        String sql = "SELECT * FROM fbnews WHERE title LIKE ?";
        String convert = "";

        if(StringUtils.isEmpty(searchnewsname)) {
            convert = "%%";
        } else {
            convert = "%" + searchnewsname + "%";
        }
        List<SearchNews> getSearchNewsInfoList;
        try {
            getSearchNewsInfoList = jdbcTemplate.query(sql, new RowMapper<SearchNews>() {
                @Override
                public SearchNews mapRow(ResultSet rs, int rowNum) throws SQLException {
                    SearchNews searchNewsInfo = new SearchNews();

                    searchNewsInfo.setId(rs.getInt("id"));
                    searchNewsInfo.setTitle(rs.getString("title"));
                    searchNewsInfo.setImg(rs.getString("img"));
                    searchNewsInfo.setDescription(rs.getString("description"));
                    searchNewsInfo.setDetail(rs.getString("detail"));
                    searchNewsInfo.setFeed(rs.getInt("feed"));
                    searchNewsInfo.setMenuId(rs.getInt("menuId"));
                    searchNewsInfo.setCreateDate(rs.getString("createDate"));
                    searchNewsInfo.setCreateBy(rs.getString("createBy"));

                    return searchNewsInfo;
                }
            }, convert);
        } catch(IncorrectResultSizeDataAccessException iex) {
            getSearchNewsInfoList = new ArrayList<>();
        }
        return getSearchNewsInfoList;
    }
}
