package edu.epam.pretask.main;

import edu.epam.pretask.entity.CustomNumber;
import edu.epam.pretask.factory.NumberContainerFactory;
import edu.epam.pretask.factory.StringFactory;
import edu.epam.pretask.entity.NumberContainer;
import edu.epam.pretask.entity.SeparatedLine;
import edu.epam.pretask.filter.StringFilter;
import edu.epam.pretask.numberService.NumberService;
import edu.epam.pretask.reader.InputReader;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    static Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        InputReader reader = new InputReader();
        Path filePath = Paths.get("input/data.txt");
        ArrayList<String> lines = reader.readStringsFromFile(filePath);
        StringFactory stringFactory = new StringFactory();
        ArrayList<SeparatedLine> separatedLines = stringFactory.separate(lines);
        StringFilter stringFilter = new StringFilter();
        separatedLines = stringFilter.filterNumFromLines(separatedLines);
        NumberContainerFactory numberContainerFactory = new NumberContainerFactory();
        ArrayList<NumberContainer> numberContainers = numberContainerFactory.factoryNumberContainer(separatedLines);
        numberContainers.stream().forEach(e->{
            logger.info("Converted line");
            e.getNumbers().stream().forEach(x->logger.info(x.getNum()));
        });
        NumberService numberService = new NumberService();
        numberContainers.stream()
                .forEach(container->{
                    logger.info("Sum of all numbers in line");
                    CustomNumber sum = numberService.addAllNumbers(container);
                    logger.info(sum.getNum());
                    logger.info("Multiplication result of numbers in line");
                    CustomNumber mulResult = numberService.multiplyAllNumbers(container);
                    logger.info(mulResult.getNum());
                });
        numberService.divide(new CustomNumber(0), new CustomNumber(0));
    }
}
