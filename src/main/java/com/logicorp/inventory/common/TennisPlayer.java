package com.logicorp.inventory.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisPlayer {

    private final Coach coach;

    public TennisPlayer(@Qualifier("soccerCoach") Coach coach) {
        this.coach = coach;
    }
    public String train() {
        return "My coach says: " + coach.getDailyWorkout();
    }
}
