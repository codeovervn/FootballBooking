package net.codejava.spring.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

//import net.codejava.spring.model.Menu;
import net.codejava.spring.model.Users;
import net.codejava.spring.service.UsersService;

/**
 * Đây là Action của trang Quản lý người dùng dành riêng cho Admin.
 * 
 * @author DungLT-05/03/2017
 * 
 */
public class UsersAction {

    @Autowired
    UsersService usersService;

    public List<Users> getDataUsersAll() {
        List<Users> getUsersInfoList = usersService.getDataUsersAll();
        return getUsersInfoList;
    }

    public void saveOrUpdate(Users users) {
        usersService.saveOrUpdate(users);
    }

    public void delete(int usersId) {
        usersService.delete(usersId);
    }

    public Users get(int usersId) {
        Users users = usersService.get(usersId);
        return users;
    }

    public Users getInfoLogin(String usercode, String password) {
        Users users = usersService.getInfoLogin(usercode, password);
        return users;
    }

//    public List<Menu> getDataMenuAll() {
//        List<Menu> getMenuInfoList = usersService.getDataMenuAll();
//        return getMenuInfoList;
//    }
}
