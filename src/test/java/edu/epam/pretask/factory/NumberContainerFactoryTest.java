package edu.epam.pretask.factory;

import edu.epam.pretask.entity.CustomNumber;
import edu.epam.pretask.entity.NumberContainer;
import edu.epam.pretask.entity.SeparatedLine;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NumberContainerFactoryTest extends TestCase {

    NumberContainerFactory numberContainerFactory;
    @Before
    public void setUp(){
        numberContainerFactory = new NumberContainerFactory();
    }

    @Test
    public void testFactoryNumberContainer() {
        String[] line1 = {"123", "425.33"};
        String[] line2 = {"123", "777.222"};
        SeparatedLine separatedLine1 = new SeparatedLine(line1);
        SeparatedLine separatedLine2 = new SeparatedLine(line2);
        ArrayList<SeparatedLine> separatedLines = new ArrayList<>();
        separatedLines.add(separatedLine1);
        separatedLines.add(separatedLine2);
        ArrayList<NumberContainer> numberContainersActual = numberContainerFactory.factoryNumberContainer(separatedLines);
        Double actual = numberContainersActual.get(0).getNumbers().get(0).getNum();
        Double expected = 123.;
        Assert.assertEquals(actual, expected);
    }
}