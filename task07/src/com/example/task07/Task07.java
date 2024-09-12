package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {
        // a hack to avoid overflow.
        // should be fine because the other method would be to use floats
        long divisibleN = findClosestMinimalDivisibleNumber(n, k);
        long divisibleM = findClosestMinimalDivisibleNumber(m, k);

        return (int)(divisibleN / k * divisibleM / k);
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(10, 20, 5);
        System.out.println(result);
        */
    }

    private static int findClosestMinimalDivisibleNumber(int number, int divisibleBy) {
        return number / divisibleBy * divisibleBy;
    }
}
