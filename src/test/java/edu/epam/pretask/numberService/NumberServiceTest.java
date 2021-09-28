package edu.epam.pretask.numberService;

import edu.epam.pretask.entity.CustomNumber;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NumberServiceTest extends TestCase {

    NumberService numberService;

    @Before
    public void setUp() {
        numberService = new NumberService();
    }

    @Test
    public void testAdd() {
        CustomNumber number1 = new CustomNumber(33);
        CustomNumber number2 = new CustomNumber(55);
        CustomNumber actualNumber = numberService.add(number1, number2);
        CustomNumber expectedNumber = new CustomNumber(88);
        Assert.assertEquals(expectedNumber.getNum(), actualNumber.getNum());
    }

    @Test
    public void testDivide() {
        CustomNumber number1 = new CustomNumber(22);
        CustomNumber number2 = new CustomNumber(11);
        CustomNumber actualNumber = numberService.divide(number1, number2);
        CustomNumber expectedNumber = new CustomNumber(2);
        Assert.assertEquals(expectedNumber.getNum(), actualNumber.getNum());
    }

    @Test()
    public void testDivideException() {
        CustomNumber number1 = new CustomNumber(0);
        CustomNumber number2 = new CustomNumber(0);
        Exception exception = Assert.assertThrows(ArithmeticException.class, () -> {
            CustomNumber actualNumber = numberService.divide(number1, number2);
        });
    }

    @Test
    public void testMultiply() {
        CustomNumber number1 = new CustomNumber(11);
        CustomNumber number2 = new CustomNumber(11);
        CustomNumber actualNumber = numberService.multiply(number1, number2);
        CustomNumber expectedNumber = new CustomNumber(121);
        Assert.assertEquals(expectedNumber.getNum(), actualNumber.getNum());
    }

    @Test
    public void testSubtract() {
        CustomNumber number1 = new CustomNumber(33);
        CustomNumber number2 = new CustomNumber(55);
        CustomNumber actualNumber = numberService.subtract(number1, number2);
        CustomNumber expectedNumber = new CustomNumber(-22);
        Assert.assertEquals(expectedNumber.getNum(), actualNumber.getNum());
    }
}