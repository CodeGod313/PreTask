package edu.epam.pretask.factory;

import edu.epam.pretask.entity.SeparatedLine;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class StringFactory {
    public static final String REGEX_DELIMITER = "\\s+";
    static Logger logger = LogManager.getLogger(StringFactory.class);
    public ArrayList<SeparatedLine> separate(ArrayList<String> strings) {
        List<SeparatedLine> separatedLines = strings.stream()
                .map(s -> {
                    s = s.trim();
                    String[] splitString = s.split(REGEX_DELIMITER);
                    return new SeparatedLine(splitString);
                })
                .toList();
        return new ArrayList<>(separatedLines);
    }
}
