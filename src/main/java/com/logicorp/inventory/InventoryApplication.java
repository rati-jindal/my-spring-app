package com.logicorp.inventory;

import com.logicorp.inventory.common.Coach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class InventoryApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(InventoryApplication.class, args);

        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());


    }

}
