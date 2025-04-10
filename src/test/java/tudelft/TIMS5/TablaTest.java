package tudelft.TIMS5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TablaTest {
    @Test
    public void testComprobarTrueCase() {
        Tabla tabs = new Tabla();
        Assertions.assertTrue(tabs.comprobar('v', 'v', 'v'));
        Assertions.assertTrue(tabs.comprobar('v', 'v', 'f'));
        Assertions.assertTrue(tabs.comprobar('v', 'f', 'v'));
        Assertions.assertTrue(tabs.comprobar('f', 'v', 'v'));
        Assertions.assertTrue(tabs.comprobar('f', 'f', 'v'));
    }
    @Test
    public void testComprobarFalseCase() {
        Tabla tabs = new Tabla();
        Assertions.assertFalse(tabs.comprobar('f', 'f', 'f'));
        Assertions.assertFalse(tabs.comprobar('v', 'f', 'f'));
        Assertions.assertFalse(tabs.comprobar('f', 'v', 'f'));
    }
}
