package main;

import util.ConvertNumeric;

import java.text.ParseException;

public class Application {
    public static void main(String[] args) {
        try {
            addTwoValues();
            convertToMoneyFormat();
            convertToStringWithDot();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void convertToStringWithDot() {
        Double weight = 0.255;
        String result = ConvertNumeric.doubleToStringScale(weight);
        System.out.println("Scale: " + result);
    }

    private static void convertToMoneyFormat() {
        Double value = 2.50;
        String money = ConvertNumeric.doubleToStringMoney(value);
        System.out.println("valor R$ " + money);
    }

    private static void addTwoValues() throws ParseException {
        Double value1 = ConvertNumeric.stringToDouble("3,50");
        Double value2 = ConvertNumeric.stringToDouble("2,50");
        Double value3 = value1 + value2;
        System.out.println("resultado: " + value3);
    }
}
