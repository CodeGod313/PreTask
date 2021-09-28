package edu.epam.pretask.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparatedLine {
    ArrayList<String> elements;

    public SeparatedLine(ArrayList<String> elements) {
        this.elements = elements;
    }

    public SeparatedLine(String[] elements) {
        this.elements = new ArrayList<String>(List.of(elements));
    }

    public ArrayList<String> getElements() {
        return elements;
    }
}
