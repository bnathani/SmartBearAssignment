package org.smartbear.app;

import org.junit.Assert;
import org.junit.Test;
import org.smartbear.exception.InvalidTimeException;


public class TimeToBritishSpokenFormTest {
    TimeToBritishSpokenForm timeToSpokenForm = new TimeToBritishSpokenForm();

    @Test
    public void testNoon(){
        try{
            Assert.assertEquals("noon",timeToSpokenForm.getBritishSpokenFormOfTime("12:00"));
        }catch (InvalidTimeException ex){
            Assert.fail();
        }
    }
    @Test
    public void testMidnight(){
        try{
            Assert.assertEquals("midnight",timeToSpokenForm.getBritishSpokenFormOfTime("00:00"));
        }catch (InvalidTimeException ex){
            Assert.fail();
        }
    }
    @Test
    public void testOneOClock(){
        try{
            Assert.assertEquals("one o'clock",timeToSpokenForm.getBritishSpokenFormOfTime("1:00"));
        }catch (InvalidTimeException ex){
            Assert.fail();
        }
    }

    @Test
    public void testFourFifteen(){
        try{
            Assert.assertEquals("quarter past four",timeToSpokenForm.getBritishSpokenFormOfTime("4:15"));
        }catch (InvalidTimeException ex){
            Assert.fail();
        }
    }

    @Test
    public void testSixThirtyTwo(){
        try{
            Assert.assertEquals("six thirty two",timeToSpokenForm.getBritishSpokenFormOfTime("6:32"));
        }catch (InvalidTimeException ex){
            Assert.fail();
        }
    }

    @Test
    public void testSevenThirty(){
        try{
            Assert.assertEquals("half past seven",timeToSpokenForm.getBritishSpokenFormOfTime("7:30"));
        }catch (InvalidTimeException ex){
            Assert.fail();
        }
    }

    @Test
    public void testEightForty(){
        try{
            Assert.assertEquals("twenty to nine",timeToSpokenForm.getBritishSpokenFormOfTime("8:40"));
        }catch (InvalidTimeException ex){
            Assert.fail();
        }
    }
    @Test
    public void testNineFortyFive(){
        try{
            Assert.assertEquals("quarter to ten",timeToSpokenForm.getBritishSpokenFormOfTime("9:45"));
        }catch (InvalidTimeException ex){
            Assert.fail();
        }
    }

    @Test
    public void testElevenFiftyFive(){
        try{
            Assert.assertEquals("five to twelve",timeToSpokenForm.getBritishSpokenFormOfTime("11:55"));
        }catch (InvalidTimeException ex){
            Assert.fail();
        }
    }

}
