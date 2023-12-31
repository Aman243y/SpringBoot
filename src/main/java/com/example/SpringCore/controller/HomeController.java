package com.example.SpringCore.controller;


import com.example.SpringCore.Common.Coach;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    Coach theCoach;

    public HomeController(@Qualifier("cricketCoach") Coach theCoach) {
        this.theCoach = theCoach;
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }

    @GetMapping("/dailyWorkout")
    public String cricket(){
        return theCoach.getDailyWorkout();

    }



    @GetMapping("/wish")
    public String sayWish(){
        return "she is now 50.";
    }
}
