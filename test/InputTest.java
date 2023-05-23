import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InputTest {
    MainFrame mainFrame;

    @BeforeEach
    public void initEach() {
        this.mainFrame = new MainFrame();
    }

    @Test
    public void testCheckInputBetu() {
        boolean actual = this.mainFrame.checkInput("f");
        assertFalse(actual);
    }
    @Test
    public void testCheckInputSzam() {
        boolean actual = this.mainFrame.checkInput("64981968");
        assertTrue(actual);
    }
}
