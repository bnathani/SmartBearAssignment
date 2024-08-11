package org.example.app;

import org.junit.Assert;
import org.junit.Test;
import org.smartbear.app.BritishTimeToSpokenForm;
import org.smartbear.exception.InvalidTimeException;


public class BritishToSpokenFormTest {
    BritishTimeToSpokenForm timeToSpokenForm = new BritishTimeToSpokenForm();

    @Test
    public void testNoon(){
        try{
            Assert.assertEquals("noon",timeToSpokenForm.getSpokenFormOfBritishTime("12:00"));
        }catch (InvalidTimeException ex){
            Assert.fail();
        }
    }
    @Test
    public void testMidnight(){
        try{
            Assert.assertEquals("midnight",timeToSpokenForm.getSpokenFormOfBritishTime("00:00"));
        }catch (InvalidTimeException ex){
            Assert.fail();
        }
    }
    @Test
    public void testOneOClock(){
        try{
            Assert.assertEquals("one o'clock",timeToSpokenForm.getSpokenFormOfBritishTime("1:00"));
        }catch (InvalidTimeException ex){
            Assert.fail();
        }
    }

    @Test
    public void testFourFifteen(){
        try{
            Assert.assertEquals("quarter past four",timeToSpokenForm.getSpokenFormOfBritishTime("4:15"));
        }catch (InvalidTimeException ex){
            Assert.fail();
        }
    }

    @Test
    public void testSixThirtyTwo(){
        try{
            Assert.assertEquals("six thirty two",timeToSpokenForm.getSpokenFormOfBritishTime("6:32"));
        }catch (InvalidTimeException ex){
            Assert.fail();
        }
    }

    @Test
    public void testSevenThirty(){
        try{
            Assert.assertEquals("half past seven",timeToSpokenForm.getSpokenFormOfBritishTime("7:30"));
        }catch (InvalidTimeException ex){
            Assert.fail();
        }
    }

    @Test
    public void testEightForty(){
        try{
            Assert.assertEquals("twenty to nine",timeToSpokenForm.getSpokenFormOfBritishTime("8:40"));
        }catch (InvalidTimeException ex){
            Assert.fail();
        }
    }
    @Test
    public void testNineFortyFive(){
        try{
            Assert.assertEquals("quarter to ten",timeToSpokenForm.getSpokenFormOfBritishTime("9:45"));
        }catch (InvalidTimeException ex){
            Assert.fail();
        }
    }

    @Test
    public void testElevenFiftyFive(){
        try{
            Assert.assertEquals("five to twelve",timeToSpokenForm.getSpokenFormOfBritishTime("11:55"));
        }catch (InvalidTimeException ex){
            Assert.fail();
        }
    }

}
