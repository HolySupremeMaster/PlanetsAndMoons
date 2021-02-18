package input;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EarthTest {

    @Test
    void earthTest(){
        Earth e1 = new Earth();
        assertEquals(e1.getMass(),1);
        assertEquals(e1.getName(), "Earth");
        assertEquals(e1.getType(),"terrestrial");
    }


}