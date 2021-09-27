package edu.epam.pretask.main;

import edu.epam.pretask.creator.StringFactory;
import edu.epam.pretask.entity.SeparatedString;
import edu.epam.pretask.filter.StringFilter;
import edu.epam.pretask.reader.InputReader;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        InputReader reader = new InputReader();
        Path filePath = Paths.get("/input/data.txt");
        ArrayList<String> lines = reader.readStringsFromFile(filePath);
        StringFactory stringFactory = new StringFactory();
        ArrayList<SeparatedString> separatedStrings = stringFactory.separate(lines);

    }
}
