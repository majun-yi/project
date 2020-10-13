package com.demo;

import java.math.BigDecimal;

/**
 * @Description TODO
 * @Date 2020/10/1 14:44
 */
public class TestX {
    public static void main(String[] args) {
        BigDecimal bigDecimal = null;
        BigDecimal bigDecimalSum = getBigDecimalSum(bigDecimal, BigDecimal.valueOf(300));
        System.out.println("Q:" + bigDecimalSum);
    }

    public static BigDecimal getBigDecimalSum(BigDecimal i, BigDecimal... arg) {
        BigDecimal sum = BigDecimal.valueOf(0);
        for (BigDecimal b : arg) {
            if (b != null)
                sum = sum.add(b);
        }
        return sum;
    }
}
