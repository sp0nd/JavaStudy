package com.tuyano.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testApp() {
        String name = "hoge";
        App app = new App();
        assertNotNull(app);
        assertTrue(app.showMessage(name));
        try {
            assertTrue(app.getMessage(name).contains(name));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
