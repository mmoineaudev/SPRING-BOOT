package com.miage.pepito.superpassword;

import com.miage.pepito.superpassword.interfaces.IUser;
import com.miage.pepito.superpassword.interfaces.IUserManager;

import java.util.ArrayList;

public class DataBase implements IUserManager {
    @Override
    public void addUser(String id, String password, boolean admin) {
        ArrayList<String> listeUser= new ArrayList<String>();
        listeUser.add(id,password,admin);
    }

    @Override
    public IUser getUserByName(String name) {
        return null;
    }

}
