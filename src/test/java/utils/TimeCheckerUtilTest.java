package utils;

import org.junit.Assert;
import org.junit.Test;
import org.smartbear.utils.TimeCheckerUtil;

public class TimeCheckerUtilTest {

    @Test
    public void testTimeIn24HourFormat(){
        Assert.assertTrue(TimeCheckerUtil.checkTimeIn24HourFormat("23:59"));
        Assert.assertFalse(TimeCheckerUtil.checkTimeIn24HourFormat("024:test"));
        Assert.assertFalse(TimeCheckerUtil.checkTimeIn24HourFormat("000:60"));
    }
    @Test
    public void testHourChecker(){
        Assert.assertTrue(TimeCheckerUtil.checkTimeIn24HourFormat("23:59"));
        Assert.assertFalse(TimeCheckerUtil.checkTimeIn24HourFormat("24:59"));
    }
    @Test
    public void testMinutesChecker(){
        Assert.assertTrue(TimeCheckerUtil.checkTimeIn24HourFormat("23:59"));
        Assert.assertFalse(TimeCheckerUtil.checkTimeIn24HourFormat("23:60"));
    }
}
