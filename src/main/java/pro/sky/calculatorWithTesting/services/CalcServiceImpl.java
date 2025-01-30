package pro.sky.calculatorWithTesting.services;

import org.springframework.stereotype.Service;
import pro.sky.calculatorWithTesting.exceptions.NullParameterException;

@Service
public class CalcServiceImpl implements CalcService {

    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String minus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException();
        }
        return num1 + " / " + num2 + " = " + ((double)num1 / num2);
    }
}

