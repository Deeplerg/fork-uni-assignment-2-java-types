package com.example.task08;

public class Task08 {

    public static boolean solution() {
        // also valid
        // float x = Float.POSITIVE_INFINITY

        // but this is the intended solution
        float x = 1e8f;

        return x == x + 1;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение
        /*
        System.out.println(solution());
        */
    }

}
