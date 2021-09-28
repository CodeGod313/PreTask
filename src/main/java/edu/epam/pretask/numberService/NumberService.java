package edu.epam.pretask.numberService;

import edu.epam.pretask.entity.CustomNumber;
import edu.epam.pretask.entity.NumberContainer;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class NumberService {
    static Logger logger = LogManager.getLogger(NumberService.class);

    public CustomNumber add(CustomNumber firstNumber, CustomNumber secondNumber){
        Double answer = firstNumber.getNum() + secondNumber.getNum();
        return new CustomNumber(answer);
    }
    public CustomNumber divide(CustomNumber firstNumber, CustomNumber secondNumber){
        Double answer = firstNumber.getNum() / secondNumber.getNum();
        if (Math.abs(answer) == Double.POSITIVE_INFINITY || answer.isNaN())
            throw new ArithmeticException("Not finite");
        return new CustomNumber(answer);
    }
    public CustomNumber multiply(CustomNumber firstNumber, CustomNumber secondNumber){
        Double answer = firstNumber.getNum() * secondNumber.getNum();
        return new CustomNumber(answer);
    }
    public CustomNumber subtract(CustomNumber firstNumber, CustomNumber secondNumber){
        Double answer = firstNumber.getNum() - secondNumber.getNum();
        return new CustomNumber(answer);
    }
    public CustomNumber addAllNumbers(NumberContainer numberContainer){
        ArrayList<CustomNumber> customNumbers = numberContainer.getNumbers();
        CustomNumber identity = new CustomNumber(0);
        CustomNumber sum = customNumbers.stream()
                .reduce(identity, (acc,x)->add(acc,x));
        return sum;
    }
    public CustomNumber multiplyAllNumbers(NumberContainer numberContainer){
        ArrayList<CustomNumber> customNumbers = numberContainer.getNumbers();
        CustomNumber identity = new CustomNumber(1);
        CustomNumber result = customNumbers.stream()
                .reduce(identity, (acc,x)->multiply(acc,x));
        return result;
    }
}
