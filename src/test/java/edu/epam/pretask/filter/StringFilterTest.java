package edu.epam.pretask.filter;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.ref.SoftReference;
import java.util.ArrayList;

public class StringFilterTest extends TestCase {

    StringFilter stringFilter;
    @Before
    public void setUp(){
        stringFilter = new StringFilter();
    }

    @Test
    public void testFilterNum() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("123");
        strings.add("asdf");
        strings.add("555.222");
        ArrayList<String> stringNums = stringFilter.filterNum(strings);
        String expected1 = "123";
        String expected2 = "555.222";
        String actual1 = stringNums.get(0);
        String actual2 = stringNums.get(1);
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }
}