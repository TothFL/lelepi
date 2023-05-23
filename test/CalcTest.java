/*
File: CalcTest.java
Author: Tóth Fedor László, SzoftI2E
Copyright: 2023, Tóth Fedor László
Date: 2023.05.23
Web: https://github.com/TothFL
*/

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
    MainFrame mainFrame;
    
    @Test
    public void testCalTerfogat() {
        this.mainFrame = new MainFrame();
        double actual = this.mainFrame.calTerfogat(5, 4,8);
        double expected = 160;
        assertEquals(expected, actual, 0.1);
    }
}
