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
}
