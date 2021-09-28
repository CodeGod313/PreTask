package edu.epam.pretask.factory;

import edu.epam.pretask.entity.SeparatedLine;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StringFactoryTest extends TestCase {

    StringFactory stringFactory;
    @Before
    public void setUp(){
        stringFactory = new StringFactory();
    }

    @Test
    public void testSeparate() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("   bbb ccc   ");
        ArrayList<SeparatedLine> separatedLines = stringFactory.separate(strings);
        String expected1 = "bbb";
        String expected2 = "ccc";
        String actual1 = separatedLines.get(0).getElements().get(0);
        String actual2 = separatedLines.get(0).getElements().get(1);
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }
}