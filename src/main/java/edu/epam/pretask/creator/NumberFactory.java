package edu.epam.pretask.creator;

import edu.epam.pretask.entity.Number;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class NumberFactory {
    static Logger logger = LogManager.getLogger(NumberFactory.class);

    public ArrayList<Number> factoryNumbers(ArrayList<String> strings){
        return new ArrayList<>(
                strings.stream()
                        .map(s-> new Number(Double.parseDouble(s)))
                        .toList()
        );
    }
}
