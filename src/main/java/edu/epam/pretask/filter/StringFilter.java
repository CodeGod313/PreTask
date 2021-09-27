package edu.epam.pretask.filter;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class StringFilter {
    static Logger logger = LogManager.getLogger(StringFilter.class);


    public ArrayList<String> filterNum(ArrayList<String> strings){
        strings.stream().filter(s-> s.matches("\\d+"));
        return strings;
    }
}
