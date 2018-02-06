package net.codejava.spring.dao;

import java.util.List;

//import net.codejava.spring.model.Menu;
import net.codejava.spring.model.Users;

/**
 * Đây là DAO của trang Quản lý người dùng dành riêng cho Admin.
 * 
 * @author DungLT-05/03/2017
 * 
 */
public interface UsersDAO {

    public List<Users> getDataUsersAll();

    public void saveOrUpdate(Users users);

    public void delete(int usersId);

    public Users get(int usersId);

    public Users getInfoLogin(String usercode, String password);

//    public List<Menu> getDataMenuAll();

}
