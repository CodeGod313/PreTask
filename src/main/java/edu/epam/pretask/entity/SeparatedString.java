package edu.epam.pretask.entity;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparatedString {
    ArrayList<String> elements;

    public SeparatedString(ArrayList<String> elements) {
        this.elements = elements;
    }

    public SeparatedString(String[] elements) {
        this.elements = (ArrayList<String>) Arrays.stream(elements).toList();
    }

    public ArrayList<String> getElements() {
        return elements;
    }
}
