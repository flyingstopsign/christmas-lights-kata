package com.example.project;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class lightingtesting {
    private lightcontroller grid;

    @BeforeEach
    public void setUp(){
        grid = new lightcontroller(1000);
    }
    @Test
public void testTurnOnSingleLight() {
    grid.turnOn(0, 0, 0, 0);
    assertEquals(1, grid.countLightsOn());
}
}
