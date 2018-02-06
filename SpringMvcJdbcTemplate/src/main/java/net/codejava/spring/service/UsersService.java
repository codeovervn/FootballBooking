package net.codejava.spring.service;

import java.util.List;

//import net.codejava.spring.model.Menu;
import net.codejava.spring.model.Users;

public interface UsersService {

    public List<Users> getDataUsersAll();

    public void saveOrUpdate(Users users);

    public void delete(int usersId);

    public Users get(int usersId);

    public Users getInfoLogin(String usercode, String password);

//    public List<Menu> getDataMenuAll();
}
