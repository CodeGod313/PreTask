package edu.epam.pretask.factory;

import edu.epam.pretask.entity.CustomNumber;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class NumberFactory {
    static Logger logger = LogManager.getLogger(NumberFactory.class);
    public ArrayList<CustomNumber> factoryNumbers(ArrayList<String> strings){
        List<CustomNumber> customNumbers = strings.stream()
                .map(s-> new CustomNumber(Double.parseDouble(s)))
                .toList();
        return new ArrayList<>(customNumbers);
    }
}
