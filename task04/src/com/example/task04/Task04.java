package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) throws UnsupportedOperationException {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return (float)a / b;
            default:
                // maybe IllegalArgumentException would be more appropriate?
                throw new UnsupportedOperationException(operation + " is not a valid operation.");
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        float result = calculate(-25, 5, "/");
        System.out.println(result);
        */
    }

}
