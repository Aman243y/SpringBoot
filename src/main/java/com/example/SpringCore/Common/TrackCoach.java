package com.example.SpringCore.Common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    TrackCoach(){
        System.out.println("Inside track coach constructor");

    }

    @Override
    public String getDailyWorkout() {
        return "Run for life";
    }
}
