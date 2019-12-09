package com.miage.pepito.superpassword;

import com.miage.pepito.superpassword.interfaces.IUser;
import com.miage.pepito.superpassword.interfaces.IUserManager;

import java.util.ArrayList;

public class DataBase implements IUserManager {
    @Override
    public void addUser(IUser user) {
        ArrayList<IUser> listUser= new ArrayList<IUser>();
        listUser.add(user);
    }

    @Override
    public IUser getUserByName(String name) {
        
//        for(String s : listUser){
//
//                System.out.println(s);
//        }
        return null;
    }

}
