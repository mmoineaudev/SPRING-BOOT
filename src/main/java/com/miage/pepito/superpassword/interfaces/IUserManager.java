package com.miage.pepito.superpassword.interfaces;

public interface IUserManager {
    public void addUser(IUser user);
    public IUser getUserByName(String name);
}
