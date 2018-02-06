package net.codejava.spring.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import net.codejava.spring.dao.NewsDAO;
import net.codejava.spring.model.Menu;
import net.codejava.spring.model.News;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

/**
 * Đây là DAOImpl của trang Quản lý tin tức dành riêng cho Admin.
 * 
 * @author DungLT-05/03/2017
 * 
 */
public class NewsDAOImpl implements NewsDAO {

    private JdbcTemplate jdbcTemplate;

    public NewsDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    /** 
     * Phương thức để truy vấn toàn bộ tin tức.
     * 
     * @return : DAOImpl getNewsInfoList
     */
    @Override
    public List<News> getDataNewsAll() {

        String sql = "SELECT * FROM fbnews";
        List<News> getNewsInfoList;
        try {
            getNewsInfoList = jdbcTemplate.query(sql, new RowMapper<News>() {
                @Override
                public News mapRow(ResultSet rs, int rowNum) throws SQLException {
                    News newsInfo = new News();

                    newsInfo.setId(rs.getInt("id"));
                    newsInfo.setTitle(rs.getString("title"));
                    newsInfo.setImg(rs.getString("img"));
                    newsInfo.setDescription(rs.getString("description"));
                    newsInfo.setDetail(rs.getString("detail"));
                    newsInfo.setFeed(rs.getInt("feed"));
                    newsInfo.setMenuId(rs.getInt("menuId"));
                    newsInfo.setCreateDate(rs.getString("createDate"));
                    newsInfo.setCreateBy(rs.getString("createBy"));
                    newsInfo.setUpdateDate(rs.getString("updateDate"));
                    return newsInfo;
                }
            });
        } catch(IncorrectResultSizeDataAccessException iex) {
            getNewsInfoList = new ArrayList<>();
        }
        return getNewsInfoList;
    }

    @Override
    public News get(int newsId) {
        String sql = "SELECT * FROM fbnews WHERE id = ?";
        return jdbcTemplate.query(sql, new ResultSetExtractor<News>() {

            @Override
            public News extractData(ResultSet rs) throws SQLException, DataAccessException {
                if (rs.next()) {
                    News newsInfo = new News();
                    newsInfo.setId(rs.getInt("id"));
                    newsInfo.setTitle(rs.getString("title"));
                    newsInfo.setImg(rs.getString("img"));
                    newsInfo.setDescription(rs.getString("description"));
                    newsInfo.setDetail(rs.getString("detail"));
                    newsInfo.setFeed(rs.getInt("feed"));
                    newsInfo.setMenuId(rs.getInt("menuId"));
                    newsInfo.setCreateDate(rs.getString("createDate"));
                    newsInfo.setCreateBy(rs.getString("createBy"));
                    newsInfo.setUpdateDate(rs.getString("updateDate"));
                    return newsInfo;
                }
                return null;
            }
        }, newsId);
    }

    @Override
    public void saveOrUpdate(News news) {
        if (news.getId() > 0) {
            // update
            String sql = "UPDATE fbnews SET title = ?, img = ?, description = ?, detail = ?, feed = ?, menuId = ?, createDate = ?, createBy = ?, updateDate = ? WHERE id = ?";
            jdbcTemplate.update(sql, news.getTitle(), news.getImg(), news.getDescription(), news.getDetail(), news.getFeed(), 
                    news.getMenuId(), news.getCreateDate(), news.getCreateBy(), news.getUpdateDate(), news.getId());
        } else {
            // insert
            String sql = "INSERT INTO fbnews (title, img, description, detail, feed, menuId, createDate, createBy, updateDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            jdbcTemplate.update(sql, news.getTitle(), news.getImg(), news.getDescription(), news.getDetail(), news.getFeed(), 
                    news.getMenuId(), news.getCreateDate(), news.getCreateBy(), news.getUpdateDate());
        }
    }

    @Override
    public void delete(int newsId) {
        String sql = "DELETE FROM fbnews WHERE id = ?";
        jdbcTemplate.update(sql, newsId);
    }

    /** 
     * Phương thức để truy vấn toàn bộ Menu.
     * 
     * @return : DAOImpl getNewsInfoList
     */
    @Override
    public List<Menu> getDataMenuAll() {

        String sql = "SELECT * FROM fbmenus";
        List<Menu> getMenuInfoList;
        try {
            getMenuInfoList = jdbcTemplate.query(sql, new RowMapper<Menu>() {
                @Override
                public Menu mapRow(ResultSet rs, int rowNum) throws SQLException {
                    Menu menuInfo = new Menu();

                    menuInfo.setId(rs.getInt("id"));
                    menuInfo.setName(rs.getString("name"));
                    menuInfo.setActionId(rs.getString("actionId"));
                    menuInfo.setMobile(rs.getString("mobile"));
                    menuInfo.setDisplay(rs.getString("display"));
                    return menuInfo;
                }
            });
        } catch(IncorrectResultSizeDataAccessException iex) {
            getMenuInfoList = new ArrayList<>();
        }
        return getMenuInfoList;
    }
}
