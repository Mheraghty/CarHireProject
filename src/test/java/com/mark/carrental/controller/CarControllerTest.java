package com.mark.carrental.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarControllerTest {
@Test
    public void getCarDetailsTest(){
    CarController controller = new CarController();
    String response = controller.getCarDetails();
    assertEquals("Mazda", response);
}
}