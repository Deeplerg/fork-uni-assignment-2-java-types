package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        // TODO think of something better

        // may throw an exception and that's fine here
        Long parsedNumber = Long.parseLong(input);

        // LET'S GO GAMBLING!!!! https://www.youtube.com/watch?v=IPFiKEm-oNI
        if(isWithinBounds(parsedNumber, Byte.MIN_VALUE, Byte.MAX_VALUE)) {
            return "byte";
        }
        // aww dang it!
        else if(isWithinBounds(parsedNumber, Short.MIN_VALUE, Short.MAX_VALUE)) {
            return "short";
        }
        // aww dang it!
        else if(isWithinBounds(parsedNumber, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            return "int";
        }

        return "long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
    }

    private static boolean isWithinBounds(long number, long lower, long upper) {
        return number >= lower && number <= upper;
    }
}
