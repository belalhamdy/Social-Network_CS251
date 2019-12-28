package Sys;

import org.junit.Test;
import org.testng.annotations.AfterTest;

import static org.junit.jupiter.api.Assertions.*;

class APITest {

    @Test
    void getInstance() {
        assertNotEquals(API.getInstance(),null);
    }
    @Test
    void getUserByUsername() {
        assertNotEquals(API.getInstance().getUserByUsername("belal"),null);
    }


}