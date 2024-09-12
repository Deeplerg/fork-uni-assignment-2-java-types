package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        int length = 0;
        for (int factor = 1; factor <= value; factor *= 10) {
            length++;
        }

        int reversedValue = 0;
        for (int position = 0; position < length; position++) {
            int initialValueFactor = (int)Math.pow(10, position);
            int reversedValueFactor = (int)Math.pow(10, length - position - 1);

            int digit = value / initialValueFactor % 10;
            reversedValue += digit * reversedValueFactor;
        }

        return reversedValue;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = reverse(345);
        System.out.println(result);
        */
    }


}
