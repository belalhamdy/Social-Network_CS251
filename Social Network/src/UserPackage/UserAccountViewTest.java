package UserPackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserAccountViewTest {

    @Test
    void showLoginRegisterForm() {
        assertNotEquals(UserAccountView.showLoginRegisterForm(),null);
    }
}