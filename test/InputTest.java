/*
File: InputTest.java
Author: Tóth Fedor László, SzoftI2E
Copyright: 2023, Tóth Fedor László
Date: 2023.05.23
Web: https://github.com/TothFL
*/

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class InputTest {
    MainFrame mainFrame;

    @Test
    public void testCheckInputBetu() {
        this.mainFrame = new MainFrame();
        boolean actual = this.mainFrame.checkInput("f");
        assertFalse(actual);
    }
    @Test
    public void testCheckInputSzam() {
        this.mainFrame = new MainFrame();
        boolean actual = this.mainFrame.checkInput("64981968");
        assertTrue(actual);
    }
}
