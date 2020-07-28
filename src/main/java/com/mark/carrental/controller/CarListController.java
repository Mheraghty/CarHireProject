package com.mark.carrental.controller;

import com.mark.carrental.dto.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarListController {
    @GetMapping("/test")
    public String getCarList(Model model)
    {
        ArrayList<Car> cars= new ArrayList<Car>();
        cars.add(new Car(4,4,2.0,"Grey","161SO1998","Petrol", "Saloon", "Mazda", "RX7", List.of("/images/Mazda-rx7.jpg", "/images/Mazda-RX7-interior.jpg", "/images/Mazda-rx7-engine.jpg"),"The Mazda RX-7 is a front/mid-engine, rear-wheel-drive, rotary engine-powered sports car that was manufactured and marketed by Mazda from 1978 to 2002 across three generations,\n" +
                "    all of which made use of a compact, lightweight Wankel rotary engine. The first generation of the RX-7, SA, was a two-seater coupé."));
        cars.add(new Car(5,4,1.4,"Navy Blue","141D19298","Diesel", "Hatchback", "Toyota", "Corolla", List.of("/images/toyota-corolla-navy.jpg", "/images/toyota-corolla-interior.jpg", "/images/toyota-corolla-engine.jpg"),"The Toyota Corolla is a line of subcompact and compact cars manufactured by Toyota. Introduced in 1966, the Corolla was the best-selling car worldwide by 1974 and has been one of the best-selling cars in the world since then."));
        cars.add(new Car(5,4,1.8,"Black","182KK291","Diesel", "Hatchback", "Nissan", "Qashqai", List.of("/images/Nissan-Qashqia.jpg", "'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQu9EGvwvqE3Kq2qmcd8d7tC3nbF_OpmkETOw&usqp=CAU'", "'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRTIwtI8rk10NAaWl3KC5X_50hWZtNmTHf6hw&usqp=CAU'"),"The Nissan Qashqai is a compact crossover SUV produced by the Japanese car manufacturer Nissan since 2006. The first generation of the vehicle was sold under the name Nissan Dualis in Japan and Australia, and Qashqai in other markets. The current generation, which was released in 2014, is not sold in Japan and is badged as the Qashqai everywhere it is sold, except in the United States, where it is rebadged as the Nissan Rogue Sport"));
        cars.add(new Car(4,4,1.2,"Red","142SO2096","Petrol", "Saloon", "Opel", "Corsa", List.of("/images/Opel-Corsa.jpg", "/images/Opel-corsa-interior.jpg", "/images/OPEL-Corsa-engine .jpg"),"The Opel Corsa is a supermini car engineered and produced by the German automobile manufacturer Opel since 1982. It has been sold under a variety of other brands (most notably Vauxhall, Chevrolet, and Holden) and also spawned various other derivatives."));
        cars.add(new Car(5, 4, 1.5, "Grey", "171C34152", "Diesel", "Saloon", "Renault", "Megane", List.of("/images/Renault.jpg", "'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQu9EGvwvqE3Kq2qmcd8d7tC3nbF_OpmkETOw&usqp=CAU'", "'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRTIwtI8rk10NAaWl3KC5X_50hWZtNmTHf6hw&usqp=CAU'"),"The Renault Mégane is a small family car produced by the French car manufacturer Renault since the end of 1995, and was the successor to the Renault 19."));
        cars.add(new Car(4,4,2.2,"White","201MO321","Petrol", "Saloon", "Honda", "Accord", List.of("/images/Honda.jpg", "'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQu9EGvwvqE3Kq2qmcd8d7tC3nbF_OpmkETOw&usqp=CAU'", "'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRTIwtI8rk10NAaWl3KC5X_50hWZtNmTHf6hw&usqp=CAU'"),"The 2020 Honda Accord is an excellent all-around vehicle. With upscale cabin materials, a good number of standard safety features, lively handling, energetic engines, and decent fuel economy, it stands out among midsize cars as a great family or commuter vehicle."));
        model.addAttribute("cars", cars);
        return "carlistpage";
    }

}
