package com.example.SpringCore.Common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component

public class CricketCoach implements Coach{
    CricketCoach(){
        System.out.printf("Inside CricketCoach constructor");
    }


    @Override
    public String getDailyWorkout() {
        return "play cover drive";
    }
}
