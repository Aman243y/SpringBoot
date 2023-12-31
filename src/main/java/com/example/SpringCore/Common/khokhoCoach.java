package com.example.SpringCore.Common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component

public class khokhoCoach implements Coach{
    khokhoCoach() {
        System.out.printf("Inside khokhoCoach constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "lets play kho kho";
    }
}
