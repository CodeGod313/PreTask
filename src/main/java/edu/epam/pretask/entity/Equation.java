package edu.epam.pretask.entity;

import java.util.ArrayList;

public class Equation {
    ArrayList<Number> numbers;

    public Equation(ArrayList<Number> numbers) {
        this.numbers = numbers;
    }

    public ArrayList<Number> getNumbers() {
        return numbers;
    }
}
