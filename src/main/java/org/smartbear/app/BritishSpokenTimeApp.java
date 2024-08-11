package org.smartbear.app;

import org.smartbear.exception.InvalidTimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class BritishSpokenTimeApp {
    
    private static final Logger log = LoggerFactory.getLogger(BritishSpokenTimeApp.class);

    public static void main(String[] args) {
        BritishTimeToSpokenForm timeToSpokenForm = new BritishTimeToSpokenForm();
        String time = getUserInput();
        try{
            log.info("The entered British time is {}",time);
            String spokenTime = timeToSpokenForm.getSpokenFormOfBritishTime(time);
            log.info("The spoken form of british time {} is: {}",time,spokenTime);
        }catch (InvalidTimeException ex){
            log.error("Caught Exception while converting British time to spoken form. {}",ex.getMessage());
            System.exit(1);
        }
        System.exit(0);
    }
    private static String getUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entire British time:");
        return scanner.nextLine();
    }
}