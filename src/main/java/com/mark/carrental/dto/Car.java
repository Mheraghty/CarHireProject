package com.mark.carrental.dto;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Car {


    int number_of_doors;
    int number_of_wheels;
    int years_old;
    double enginesize;
    String colour;
    String reg_number;
    String fuel_type;
    String shape;
    String make;
    String model;

    public Car(int number_of_doors, int number_of_wheels, int years_old, double enginesize, String colour, String reg_number, String fuel_type, String shape, String make, String model) {
        this.number_of_doors = number_of_doors;
        this.number_of_wheels = number_of_wheels;
        this.years_old = years_old;
        this.enginesize = enginesize;
        this.colour = colour;
        this.reg_number = reg_number;
        this.fuel_type = fuel_type;
        this.shape = shape;
        this.make = make;
        this.model = model;
    }
}