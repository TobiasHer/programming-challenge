package de.exxcellent.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sun.tools.javac.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

/**
 * Example JUnit 5 test case.
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
class AppTest {

    private int dayWithSmallestSpread = -1;
    private String teamWithSmallestSpread = "";

    @BeforeEach
    void setUpAppTest() throws IOException {
        dayWithSmallestSpread = App.GetSmallestTemperatureSpread();
        teamWithSmallestSpread = App.GetSmallestGoalSpread();
    }
    
    @Test
    void appTest() {
        assertEquals(14, dayWithSmallestSpread, "My expectations were not met");
        assertEquals("Arsenal", teamWithSmallestSpread, "My expectations were not met");
    }
    
}