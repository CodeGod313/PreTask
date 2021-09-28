package edu.epam.pretask.factory;

import edu.epam.pretask.entity.CustomNumber;
import edu.epam.pretask.entity.NumberContainer;
import edu.epam.pretask.entity.SeparatedLine;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class NumberContainerFactory {
    static Logger logger = LogManager.getLogger(NumberContainerFactory.class);
    public ArrayList<NumberContainer> factoryNumberContainer(ArrayList<SeparatedLine> separatedLines){
        NumberFactory numberFactory = new NumberFactory();
        List<NumberContainer> containerList = separatedLines.stream()
                        .map(s->{
                            ArrayList<String> lineElements = s.getElements();
                            ArrayList<CustomNumber> numbers = numberFactory.factoryNumbers(lineElements);
                            return new NumberContainer(numbers);
                        })
                        .filter(s->s.getNumbers().size() != 0)
                        .toList();
        return new ArrayList<>(containerList);
    }
}
