package com.mark.carrental.controller;

import com.mark.carrental.dto.Car;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class CarController {
    @GetMapping("/car/details")

    public String getCarDetails(Model model, @RequestParam(name="name", required=false, defaultValue="World") String name)
    {
        Car car = new Car();
        System.out.println(name);

        if (name.toLowerCase().equals("mazda"))
           car = new Car(4,4,2.0,"Grey","161SO1998","Petrol", "Saloon", "Mazda", "RX7", List.of("/images/Mazda-rx7.jpg", "/images/Mazda-RX7-interior.jpg", "/images/Mazda-rx7-engine.jpg"),"The Mazda RX-7 is a front/mid-engine, rear-wheel-drive, rotary engine-powered sports car that was manufactured and marketed by Mazda from 1978 to 2002 across three generations,\n" +
                   "    all of which made use of a compact, lightweight Wankel rotary engine. The first generation of the RX-7, SA, was a two-seater coupé.");
        if (name.equals("Toyota"))
            car =new Car(5,4,1.4,"Navy Blue","141D19298","Diesel", "Hatchback", "Toyota", "Corolla", List.of("/images/toyota-corolla-navy.jpg", "/images/toyota-corolla-interior.jpg", "/images/toyota-corolla-engine.jpg"),"The Toyota Corolla is a line of subcompact and compact cars manufactured by Toyota. Introduced in 1966, the Corolla was the best-selling car worldwide by 1974 and has been one of the best-selling cars in the world since then.");
        if (name.equals("Nissan"))
            car = new Car(5,4,1.8,"Black","182KK291","Diesel", "Hatchback", "Nissan", "Qashqai", List.of("/images/Nissan-Qashqia.jpg","/images/nissan-qashqai-interior.jpg", "/images/nissan-qashqai-engine.jpg"),"The Nissan Qashqai is a compact crossover SUV produced by the Japanese car manufacturer Nissan since 2006. The first generation of the vehicle was sold under the name Nissan Dualis in Japan and Australia, and Qashqai in other markets. The current generation, which was released in 2014, is not sold in Japan and is badged as the Qashqai everywhere it is sold, except in the United States, where it is rebadged as the Nissan Rogue Sport");
        if (name.equals("Opel"))
            car = new Car(4,4,1.2,"Red","142SO2096","Petrol", "Saloon", "Opel", "Corsa", List.of("/images/Opel-Corsa.jpg", "/images/Opel-corsa-interior.jpg", "/images/OPEL-Corsa-engine .jpg"),"The Opel Corsa is a supermini car engineered and produced by the German automobile manufacturer Opel since 1982. It has been sold under a variety of other brands (most notably Vauxhall, Chevrolet, and Holden) and also spawned various other derivatives.");
        if (name.equals("Renault"))
            car = new Car(5, 4, 1.5, "Grey", "171C34152", "Diesel", "Saloon", "Renault", "Megane", List.of("/images/Renault.jpg", "/images/renault-megane-interior.jpg", "/images/renault-megane-engine.jpg"),"The Renault Mégane is a small family car produced by the French car manufacturer Renault since the end of 1995, and was the successor to the Renault 19.");
        if (name.equals("Honda"))
            car = new Car(4,4,2.2,"White","201MO321","Petrol", "Saloon", "Honda", "Accord", List.of("/images/Honda.jpg", "/images/honda-accord-interior.jpg", "/images/honda-accord-engine.jpg"),"The 2020 Honda Accord is an excellent all-around vehicle. With upscale cabin materials, a good number of standard safety features, lively handling, energetic engines, and decent fuel economy, it stands out among midsize cars as a great family or commuter vehicle.");


        model.addAttribute("test", car.getMake());
        model.addAttribute("doors", car.getNumber_of_doors());
        model.addAttribute("wheels", car.getNumber_of_wheels());
        model.addAttribute("enginesize", car.getEnginesize());
        model.addAttribute("colour", car.getColour());
        model.addAttribute("fueltype", car.getFuel_type());
        model.addAttribute("shape", car.getShape());
        model.addAttribute("regnumber", car.getReg_number());
        model.addAttribute("model", car.getModel());
        model.addAttribute("images", car.getImages());
        model.addAttribute("description", car.getDescription());
        return "car";
    }
}

