package edu.epam.pretask.entity;

import java.util.ArrayList;
import java.util.Objects;

public class NumberContainer {
    ArrayList<CustomNumber> numbers;

    public NumberContainer(ArrayList<CustomNumber> numbers) {
        this.numbers = numbers;
    }

    public ArrayList<CustomNumber> getNumbers() {
        return numbers;
    }
}
