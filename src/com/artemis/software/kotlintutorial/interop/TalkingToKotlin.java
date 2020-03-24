package com.artemis.software.kotlintutorial.interop;

import com.artemis.software.kotlintutorial.classes.CustomerKotlin;
import com.artemis.software.kotlintutorial.classes.Status;

import java.io.IOException;

public class TalkingToKotlin {

    public void loadStats(CustomerKotlin customerKotlin){

        try {
            customerKotlin.loadStatistics("filename");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        CustomerKotlin customerKotlin = new CustomerKotlin(1, "Shaka", "mail@mail" );

        customerKotlin.setEmail("mail@themail.com");
        String value = customerKotlin.someField;

        customerKotlin.changeStatus(Status.current);
        customerKotlin.changeStatus();
        customerKotlin.preferential();



    }
}
