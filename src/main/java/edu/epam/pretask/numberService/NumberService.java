package edu.epam.pretask.numberService;

import edu.epam.pretask.entity.Number;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class NumberService {
    static Logger logger = LogManager.getLogger(NumberService.class);

    public Number add(Number firstNumber, Number secondNumber){
        return new Number(firstNumber.getNum() + secondNumber.getNum());
    }
    public Number divide(Number firstNumber, Number secondNumber){
        return new Number(firstNumber.getNum() / secondNumber.getNum());
    }
    public Number multiply(Number firstNumber, Number secondNumber){
        return new Number(firstNumber.getNum() * secondNumber.getNum());
    }
    public Number subtract(Number firstNumber, Number secondNumber){
        return new Number(firstNumber.getNum() - secondNumber.getNum());
    }

}
