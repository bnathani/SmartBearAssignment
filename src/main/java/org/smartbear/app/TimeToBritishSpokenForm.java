package org.smartbear.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smartbear.exception.InvalidTimeException;
import org.smartbear.utils.TimeCheckerUtil;

import java.util.HashMap;
import java.util.Map;

public class TimeToBritishSpokenForm {

    private static final Logger log = LoggerFactory.getLogger(TimeToBritishSpokenForm.class);
    private static final Map<Integer,String> minutesLookUp = new HashMap<>();
    private static final Map<Integer,String> hourLookup = new HashMap<>();
    private static final String TIME_EMPTY_OR_BLANK_STRING = "Input cannot be empty or blank";
    private static final String VALID_TIME_FORMAT_STRING = "Time needs to be in valid 24 hour format form";

    static {
        minutesLookUp.put(0,"o'clock");
        minutesLookUp.put(1,"one");
        minutesLookUp.put(2,"two");
        minutesLookUp.put(3,"three");
        minutesLookUp.put(4,"four");
        minutesLookUp.put(5,"five");
        minutesLookUp.put(6,"six");
        minutesLookUp.put(7,"seven");
        minutesLookUp.put(8,"eight");
        minutesLookUp.put(9,"nine");
        minutesLookUp.put(10,"ten");
        minutesLookUp.put(11,"eleven");
        minutesLookUp.put(12,"twelve");
        minutesLookUp.put(13,"thirteen");
        minutesLookUp.put(14,"fourteen");
        minutesLookUp.put(15,"quarter");
        minutesLookUp.put(16,"sixteen");
        minutesLookUp.put(17,"seventeen");
        minutesLookUp.put(18,"eighteen");
        minutesLookUp.put(19,"nineteen");
        minutesLookUp.put(20,"twenty");
        minutesLookUp.put(21,"twenty one");
        minutesLookUp.put(22,"twenty two");
        minutesLookUp.put(23,"twenty three");
        minutesLookUp.put(24,"twenty four");
        minutesLookUp.put(25,"twenty five");
        minutesLookUp.put(26,"twenty six");
        minutesLookUp.put(27,"twenty seven");
        minutesLookUp.put(28,"twenty eight");
        minutesLookUp.put(29,"twenty nine");
        minutesLookUp.put(30,"half");
        minutesLookUp.put(31,"thirty one");
        minutesLookUp.put(32,"thirty two");
        minutesLookUp.put(33,"thirty three");
        minutesLookUp.put(34,"thirty four");

        hourLookup.put(0,"midnight");
        hourLookup.put(1,"one");
        hourLookup.put(2,"two");
        hourLookup.put(3,"three");
        hourLookup.put(4,"four");
        hourLookup.put(5,"five");
        hourLookup.put(6,"six");
        hourLookup.put(7,"seven");
        hourLookup.put(8,"eight");
        hourLookup.put(9,"nine");
        hourLookup.put(10,"ten");
        hourLookup.put(11,"eleven");
        hourLookup.put(12,"twelve");
        hourLookup.put(13,"thirteen");
        hourLookup.put(14,"fourteen");
        hourLookup.put(15,"quarter");
        hourLookup.put(16,"sixteen");
        hourLookup.put(17,"seventeen");
        hourLookup.put(18,"eighteen");
        hourLookup.put(19,"nineteen");
        hourLookup.put(20,"twenty");
        hourLookup.put(21,"twenty one");
        hourLookup.put(22,"twenty two");
        hourLookup.put(23,"twenty three");
    }

    public  String getBritishSpokenFormOfTime(String time) throws InvalidTimeException {
        StringBuilder sb = new StringBuilder();

        if(time == null || time.isBlank()){
            throw new InvalidTimeException(TIME_EMPTY_OR_BLANK_STRING);
        }

        if(!TimeCheckerUtil.checkTimeIn24HourFormat(time)){
            throw new InvalidTimeException(VALID_TIME_FORMAT_STRING);
        }

        String hourString = time.split(":")[0];
        String minutesString = time.split(":")[1];

        log.debug("hourString:{}, minutesString:{}",hourString,minutesString);

        if(!TimeCheckerUtil.hourChecker(hourString)){
            throw new InvalidTimeException("Invalid hour range found " + VALID_TIME_FORMAT_STRING);
        }
        if(!TimeCheckerUtil.minutesChecker(minutesString)){
            throw new InvalidTimeException("Invalid minutes range found " + VALID_TIME_FORMAT_STRING);
        }

        int hour = Integer.parseInt(hourString);
        int minutes = Integer.parseInt(minutesString);

        if(hour == 0 && minutes == 0){
            sb.append("midnight");
        }else if(hour == 12 && minutes == 0){
            sb.append("noon");
        } else if(minutes == 0){
            sb.append(hourLookup.get(hour)).append(" ").append(minutesLookUp.get(minutes));
        }else if(minutes <= 30){
            sb.append(minutesLookUp.get(minutes)).append(" past ").append(hourLookup.get(hour));
        }else if(minutes < 35){
            sb.append(hourLookup.get(hour)).append(" ").append(minutesLookUp.get(minutes));
        }else{
            sb.append(minutesLookUp.get(60-minutes)).append(" to ").append(hourLookup.get((hour+1)%24));
        }
        return sb.toString();
    }
}
