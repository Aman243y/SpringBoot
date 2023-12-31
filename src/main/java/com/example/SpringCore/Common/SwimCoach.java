package com.example.SpringCore.Common;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SwimCoach implements Coach{
    public SwimCoach(){
        System.out.println("Inside swimCoach constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 5km";
    }
}
