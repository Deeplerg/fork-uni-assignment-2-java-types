package com.example.task12;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task12 {

    public static BigDecimal benefit(BigDecimal sum, BigDecimal percent) {
        BigDecimal fullPercent = percent.add(BigDecimal.ONE);
        BigDecimal yearlyInterestRate = fullPercent.pow(12);

        BigDecimal totalBenefit = scale(sum.multiply(yearlyInterestRate));
        return totalBenefit;
    }

    public static void main(String[] args) {

        BigDecimal sum = new BigDecimal(500).setScale(9, BigDecimal.ROUND_HALF_UP); // 500 руб. на счете
        BigDecimal percent = new BigDecimal(0.00000001f).setScale(9, BigDecimal.ROUND_HALF_UP); // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

    private static BigDecimal scale(BigDecimal bigDecimal) {
        return bigDecimal.setScale(9, RoundingMode.HALF_UP);
    }
}
