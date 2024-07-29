package com.jensen.demo1;

import java.util.List;

public interface UserService {
    public boolean login(String name,String password);

    public List<User> findAllUser();

    public void deleteUserById(Integer id);
}
