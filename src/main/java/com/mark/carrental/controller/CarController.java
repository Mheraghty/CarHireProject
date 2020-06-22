package com.mark.carrental.controller;

import com.mark.carrental.dto.Car;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CarController {
    @GetMapping("/car/details")
    public String getCarDetails(Model model, @RequestParam(name="name", required=false, defaultValue="World") String name) {
        Car newcar = new Car(4,4,2,"Grey","16SO1998","Petrol", "Saloon", "Mazda", "RX7", "https://www.motorbiscuit.com/wp-content/uploads/2020/03/1999-Mazda-RX7.jpg");
        model.addAttribute("test", newcar.getMake());
        model.addAttribute("doors", newcar.getNumber_of_doors());
        model.addAttribute("wheels", newcar.getNumber_of_wheels());
        model.addAttribute("enginesize", newcar.getEnginesize());
        model.addAttribute("colour", newcar.getColour());
        model.addAttribute("fueltype", newcar.getFuel_type());
        model.addAttribute("shape", newcar.getShape());
        model.addAttribute("regnumber", newcar.getReg_number());
        model.addAttribute("model", newcar.getModel());
        model.addAttribute("image", newcar.getImage());
        return "car";
    }
}

