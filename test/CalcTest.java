import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcTest {
    MainFrame mainFrame;

    @BeforeEach
    public void initEach() {
        this.mainFrame = new MainFrame();
    }
    
    @Test
    public void testCalTerfogat() {
        double actual = this.mainFrame.calTerfogat(5, 4,8);
        double expected = 160;
        assertEquals(expected, actual, 0.1);
    }
}
