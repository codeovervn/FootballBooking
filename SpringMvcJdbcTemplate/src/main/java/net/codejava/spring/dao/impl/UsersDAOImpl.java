package net.codejava.spring.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import net.codejava.spring.dao.UsersDAO;
//import net.codejava.spring.model.Menu;
import net.codejava.spring.model.Users;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

/**
 * Đây là DAOImpl của trang Quản lý người dùng dành riêng cho Admin.
 * 
 * @author DungLT-05/03/2017
 * 
 */
public class UsersDAOImpl implements UsersDAO {

    private JdbcTemplate jdbcTemplate;

    public UsersDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    /** 
     * Phương thức để truy vấn toàn bộ thông tin người dùng.
     * 
     * @return : DAOImpl getUsersInfoList
     */
    @Override
    public List<Users> getDataUsersAll() {

        String sql = "SELECT * FROM fbusers";
        List<Users> getUsersInfoList;
        try {
            getUsersInfoList = jdbcTemplate.query(sql, new RowMapper<Users>() {
                @Override
                public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
                    Users usersInfo = new Users();

                    usersInfo.setId(rs.getInt("id"));
                    usersInfo.setLogo(rs.getString("logo"));
                    usersInfo.setName(rs.getString("name"));
                    usersInfo.setBirthday(rs.getString("birthday"));
                    usersInfo.setAddress(rs.getString("address"));
                    usersInfo.setJob(rs.getString("job"));
                    usersInfo.setUser(rs.getString("user"));
                    usersInfo.setPassword(rs.getString("password"));
                    usersInfo.setAdmin(rs.getString("admin"));
                    usersInfo.setCreateDate(rs.getString("createDate"));
                    usersInfo.setCreateBy(rs.getString("createBy"));
                    usersInfo.setUpdateDate(rs.getString("updateDate"));
                    return usersInfo;
                }
            });
        } catch(IncorrectResultSizeDataAccessException iex) {
            getUsersInfoList = new ArrayList<>();
        }
        return getUsersInfoList;
    }

    /** 
     * Phương thức để truy vấn thông tin của 1 người dùng.
     * 
     * @param : usersId : tên người dùng.
     * 
     * @return : Users usersInfo <thông tin của 1 người dùng>.
     */
    @Override
    public Users get(int usersId) {
        String sql = "SELECT * FROM fbusers WHERE id = ?";
        return jdbcTemplate.query(sql, new ResultSetExtractor<Users>() {

            @Override
            public Users extractData(ResultSet rs) throws SQLException, DataAccessException {
                if (rs.next()) {
                    Users usersInfo = new Users();
                    usersInfo.setId(rs.getInt("id"));
                    usersInfo.setLogo(rs.getString("logo"));
                    usersInfo.setName(rs.getString("name"));
                    usersInfo.setBirthday(rs.getString("birthday"));
                    usersInfo.setAddress(rs.getString("address"));
                    usersInfo.setJob(rs.getString("job"));
                    usersInfo.setUser(rs.getString("user"));
                    usersInfo.setPassword(rs.getString("password"));
                    usersInfo.setAdmin(rs.getString("admin"));
                    usersInfo.setCreateDate(rs.getString("createDate"));
                    usersInfo.setCreateBy(rs.getString("createBy"));
                    usersInfo.setUpdateDate(rs.getString("updateDate"));
                    return usersInfo;
                }
                return null;
            }
        }, usersId);
    }

    @Override
    public void saveOrUpdate(Users users) {
        if (users.getId() > 0) {
            // update
            String sql = "UPDATE fbusers SET logo = ?, name = ?, birthday = ?, address = ?, job = ?, user = ?, "
                    + " password = ?, admin = ?, createDate = ?, createBy=?, updateDate = ? WHERE id = ?";
            try {
            jdbcTemplate.update(sql, users.getLogo(), users.getName(), users.getBirthday(), users.getAddress(), users.getJob(), users.getUser(), 
                    users.getPassword(), users.getAdmin(), users.getCreateDate(), users.getCreateBy(), users.getUpdateDate(), users.getId());
            } catch (Exception e) {
                // handle exception
            }
        } else {
            // insert
            String sql = "INSERT INTO fbusers (logo, name, birthday, address, job,  user, password, admin, "
                    + " createDate, createBy, updateDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//            try {
            jdbcTemplate.update(sql, users.getLogo(), users.getName(), users.getBirthday(), users.getAddress(), users.getJob(), users.getUser(), 
                    users.getPassword(), users.getAdmin(), users.getCreateDate(), users.getCreateBy(), users.getUpdateDate());
//            } catch (Exception e) {
//                // handle exception
//            }
        }
    }

    @Override
    public void delete(int usersId) {
        String sql = "DELETE FROM fbusers WHERE id = ?";
        try{
            jdbcTemplate.update(sql, usersId);
        } catch (Exception e) {
            // handle exception
        }
    }

    @Override
    public Users getInfoLogin(String usercode, String password) {
        String sql = "SELECT * FROM fbusers WHERE user = ? AND password = ?";
        Users getUserInfoLogin;
        try{
            getUserInfoLogin = jdbcTemplate.queryForObject(sql, new RowMapper<Users>() {
                @Override
                public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
                    Users usersInfo = new Users();
                    usersInfo.setId(rs.getInt("id"));
                    usersInfo.setLogo(rs.getString("logo"));
                    usersInfo.setName(rs.getString("name"));
                    usersInfo.setBirthday(rs.getString("birthday"));
                    usersInfo.setAddress(rs.getString("address"));
                    usersInfo.setJob(rs.getString("job"));
                    usersInfo.setUser(rs.getString("user"));
                    usersInfo.setPassword(rs.getString("password"));
                    usersInfo.setAdmin(rs.getString("admin"));
                    usersInfo.setCreateDate(rs.getString("createDate"));
                    usersInfo.setCreateBy(rs.getString("createBy"));
                    usersInfo.setUpdateDate(rs.getString("updateDate"));
                    return usersInfo;
                }
            }, usercode, password);
        } catch (Exception e) {
            // handle exception
            return null;
        }
        return getUserInfoLogin;
    }

//    /** 
//     * Phương thức để truy vấn toàn bộ Menu.
//     * 
//     * @return : DAOImpl getNewsInfoList
//     */
//    @Override
//    public List<Menu> getDataMenuAll() {
//
//        String sql = "SELECT * FROM fbmenus";
//        List<Menu> getMenuInfoList;
//        try {
//            getMenuInfoList = jdbcTemplate.query(sql, new RowMapper<Menu>() {
//                @Override
//                public Menu mapRow(ResultSet rs, int rowNum) throws SQLException {
//                    Menu menuInfo = new Menu();
//
//                    menuInfo.setId(rs.getInt("id"));
//                    menuInfo.setName(rs.getString("name"));
//                    menuInfo.setActionId(rs.getString("actionId"));
//                    menuInfo.setMobile(rs.getString("mobile"));
//                    menuInfo.setDisplay(rs.getString("display"));
//                    return menuInfo;
//                }
//            });
//        } catch(IncorrectResultSizeDataAccessException iex) {
//            getMenuInfoList = new ArrayList<>();
//        }
//        return getMenuInfoList;
//    }
}
