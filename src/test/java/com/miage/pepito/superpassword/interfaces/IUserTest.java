package com.miage.pepito.superpassword.interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IUserTest {

    private IUser userOne, userTwo, userAdmin;

    @BeforeEach
    public void init(){
        userAdmin = new IUser() {
            @Override
            public boolean isAdmin() {
                return true;
            }

            @Override
            public String getId() {
                return "userAdmin";
            }

            @Override
            public String getPassword() {
                return "admin123456";
            }
        } ;
        userOne = new IUser() {
            @Override
            public boolean isAdmin() {
                return false;
            }

            @Override
            public String getId() {
                return "userOne";
            }

            @Override
            public String getPassword() {
                return "userOnePassword";
            }
        };
        userTwo = new IUser() {
            @Override
            public boolean isAdmin() {
                return false;
            }

            @Override
            public String getId() {
                return "userTwo";
            }

            @Override
            public String getPassword() {
                return "userTwoPassword";
            }
        };

    }

    @Test
    void isAdmin() {
        assertTrue(userAdmin.isAdmin());
        assertFalse(userOne.isAdmin());
        assertFalse(userTwo.isAdmin());
    }

    @Test
    void getId() {
        assertEquals("userAdmin",userAdmin.getId());
        assertEquals("userOne",userOne.getId());
        assertEquals("userTwo",userTwo.getId());
    }

    @Test
    void getPassword() {
        assertEquals("admin123456",userAdmin.getPassword());
        assertEquals("userOnePassword",userOne.getPassword());
        assertEquals("userTwoPassword",userTwo.getPassword());
    }
}