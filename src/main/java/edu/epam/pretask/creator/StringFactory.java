package edu.epam.pretask.creator;

import edu.epam.pretask.entity.SeparatedString;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class StringFactory {
    static Logger logger = LogManager.getLogger(StringFactory.class);

    public ArrayList<SeparatedString> separate(ArrayList<String> strings){
        return new ArrayList<SeparatedString>(
                strings.stream()
                        .map(s->{
                            s.trim();
                            return new SeparatedString(s.split("\\s+"));
                        })
                        .toList());
    }
}
