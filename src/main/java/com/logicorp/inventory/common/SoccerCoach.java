package com.logicorp.inventory.common;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach{

//    error due no using @qualifier -required a single bean, but 2 were found
    @Override
    public String getDailyWorkout() {
        return "Practice your penalty kicks";
    }
}
