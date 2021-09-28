package edu.epam.pretask.reader;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.stream.Stream;

public class InputReader {
    static Logger logger = LogManager.getLogger(InputReader.class);
    public ArrayList<String> readStringsFromFile(Path filePath){
        try (Stream<String> lines = Files.lines(filePath)) {
            return new ArrayList<>(lines.toList());
        } catch (IOException ex) {
            logger.error("ErrorWhileReadingFile", ex);
        }
        return null;
    }
}
