package com.miage.pepito.superpassword.interfaces;

public interface IUser {
    public boolean isAdmin();
    public String getId();
    public String getPassword();
    public boolean setAdmin();
}
