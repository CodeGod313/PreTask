package edu.epam.pretask.factory;

import edu.epam.pretask.entity.CustomNumber;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class NumberFactoryTest extends TestCase {

    NumberFactory numberFactory;

    @Before
    public void setUp(){
        numberFactory = new NumberFactory();
    }


    @Test
    public void testFactoryNumbers() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("555.222");
        strings.add("777.333");
        ArrayList<CustomNumber> customNumbers = numberFactory.factoryNumbers(strings);
        CustomNumber actualNumber1 = customNumbers.get(0);
        CustomNumber actualNumber2 = customNumbers.get(1);
        Double expected1 = 555.222;
        Double expected2 = 777.333;
        Double actual1 = actualNumber1.getNum();
        Double actual2 = actualNumber2.getNum();
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }
}