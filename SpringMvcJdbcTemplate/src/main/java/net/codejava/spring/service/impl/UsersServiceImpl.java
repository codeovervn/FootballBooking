package net.codejava.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.codejava.spring.dao.UsersDAO;
import net.codejava.spring.model.Users;
import net.codejava.spring.service.UsersService;

public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDAO usersDAO;

    /** 
     * Phương thức hiển thị trang Quản lý người dùng dành riêng cho Admin.
     * 
     * @return : Service users
     */
    @Override
    public List<Users> getDataUsersAll() {
        List<Users> getDataUsersAll = usersDAO.getDataUsersAll();
        return getDataUsersAll;
    }

    @Override
    public void saveOrUpdate(Users users) {
        usersDAO.saveOrUpdate(users);
    }

    @Override
    public void delete(int users) {
        usersDAO.delete(users);
    }

    @Override
    public Users get(int usersId) {
        Users users = usersDAO.get(usersId);
        return users;
    }

    @Override
    public Users getInfoLogin(String usercode, String password) {
        Users users = usersDAO.getInfoLogin(usercode, password);
        return users;
    }
}
