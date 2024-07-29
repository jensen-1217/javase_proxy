package com.jensen.demo1;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService{
    @Override
    public boolean login(String name, String password)  {
        boolean result=false;

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<User> findAllUser() {
        List<User> userList=new ArrayList<>();

        try{
            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        userList.add(new User(1,"admin","admin"));
        userList.add(new User(2,"naiyan2","123"));
        userList.add(new User(3,"naiyan3","123"));
        userList.add(new User(4,"naiyan4","123"));
        return userList;
    }

    @Override
    public void deleteUserById(Integer id) {
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
