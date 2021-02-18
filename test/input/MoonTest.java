package input;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoonTest {

    @Test
    void moonTest(){
        Moon m1 = new Moon();
        assertEquals(m1.getMass(),0.0123032);
        assertEquals(m1.getName(), "Moon");
        assertEquals(m1.getType(),"terrestrial");
    }



}