package com.miage.pepito.superpassword.interfaces;

public interface IUserManager {
    public void addUser(String id, String password);
    public IUser getUserByName(String name);
}
