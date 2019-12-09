package com.miage.pepito.superpassword.interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IUserManagerTest {
    IUserManager userManager;
    @BeforeEach
    void addUser() {
        userManager.addUser("Jean", "passwordJean",false);
        userManager.addUser("Jean2", "passwordJean2", true);
    }

    @Test
    void getUserByName() {
        assertEquals("passwordJean",userManager.getUserByName("Jean").getPassword());
        assertEquals("passwordJean2",userManager.getUserByName("Jean2").getPassword());
        assertEquals(false,userManager.getUserByName("Jean").isAdmin());
        assertEquals(true,userManager.getUserByName("Jean2").isAdmin());
    }
}