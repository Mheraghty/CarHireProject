package com.mark.carrental.controller;

import com.mark.carrental.dto.Car;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @GetMapping("/car/details")
    public String getCarDetails() {
        Car newcar = new Car(4,4,5, 1.4, "Yellow","16SO1998","Petrol", "Saloon", "Mazda", "RX7");

        return newcar.toString();
    }
}

