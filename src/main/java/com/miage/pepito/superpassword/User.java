package com.miage.pepito.superpassword;

import com.miage.pepito.superpassword.interfaces.IUser;

public class User implements IUser {

    private String id;
    private String password;
    private boolean isAdmin;

    public User(String id, String password, boolean isAdmin) {
        this.id = id;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    @Override
    public boolean isAdmin() {
        return isAdmin;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getPassword() {
        return password;
    }

}
