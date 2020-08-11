package com.mark.carrental.controller;


import com.mark.carrental.dto.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LandingPageController {
    @GetMapping("/home")
    public String getCarList(Model model)
    {
        return "Landing-Page";
    }
}
