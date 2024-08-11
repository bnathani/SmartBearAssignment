package org.smartbear.utils;

import java.util.regex.Pattern;

public class TimeCheckerUtil {
    private static final Pattern pattern = Pattern.compile("^([0-1]\\d|2[0-3]|[1-9]):[0-5]\\d$");
    public static boolean checkTimeIn24HourFormat(String time){
       return (pattern.matcher(time).matches());
    }
    public static boolean hourChecker(String hour){
        return (Integer.parseInt(hour) >=0 && Integer.parseInt(hour) < 24);
    }
    public static boolean minutesChecker(String minutes){
        return (Integer.parseInt(minutes) >=0 && Integer.parseInt(minutes) < 60);
    }
}
