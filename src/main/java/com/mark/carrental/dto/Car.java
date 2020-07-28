package com.mark.carrental.dto;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@ToString
@Data
public class Car{


    public Car() {
    }

    int number_of_doors;
    int number_of_wheels;
    double enginesize;
    String colour;
    String reg_number;
    String fuel_type;
    String shape;
    String make;
    String model;
    List<String> images;
    String description;


    public Car(int number_of_doors, int number_of_wheels, double enginesize, String colour, String reg_number, String fuel_type, String shape, String make, String model, List<String> images, String description)
    {
        this.number_of_doors = number_of_doors;
        this.number_of_wheels = number_of_wheels;
        this.enginesize = enginesize;
        this.colour = colour;
        this.reg_number = reg_number;
        this.fuel_type = fuel_type;
        this.shape = shape;
        this.make = make;
        this.model = model;
        this.images = images;
        this.description = description;
    }
}