package edu.epam.pretask.filter;

import edu.epam.pretask.entity.SeparatedLine;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class StringFilter {
    public static final String REGEX_INTEGER = "-?\\d+";
    public static final String REGEX_FLOAT = "-?\\d+.\\d+";
    static Logger logger = LogManager.getLogger(StringFilter.class);
    public ArrayList<String> filterNum(ArrayList<String> strings){
         List<String> stringList = strings.stream()
                 .filter(s-> s.matches(REGEX_INTEGER) || s.matches(REGEX_FLOAT))
                 .toList();
         return new ArrayList<>(stringList);
    }

    public ArrayList<SeparatedLine> filterNumFromLines(ArrayList<SeparatedLine> separatedLines){
        List<SeparatedLine> separatedLinesList = separatedLines.stream()
                .map(s->new SeparatedLine(filterNum(s.getElements())))
                .toList();
        return new ArrayList<>(separatedLinesList);
    }
}
