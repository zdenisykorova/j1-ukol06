package cz.czechitas.ukol06.svatky;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.MonthDay;

import static org.junit.jupiter.api.Assertions.*;

class SvatkySluzbaTest {

    @Test
    void vyhledatSvatkyKeDni() throws IOException {
        //TODO implementovat test metody vyhledatSvatkyKeDni

        SvatkySluzba sluzba = new SvatkySluzba();
        assertTrue(sluzba.vyhledatSvatkyKeDni(MonthDay.parse("--01-16")).isEmpty());
        assertFalse(sluzba.vyhledatSvatkyKeDni(MonthDay.parse("--01-1")).isEmpty());
    }
}