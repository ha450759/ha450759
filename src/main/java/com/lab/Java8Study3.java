package com.lab;

import java.util.stream.IntStream;

public class Java8Study3 {
    public static void main(String[] args) {
        int[] scores = {80, 50, 70, 90, 40};
        // 算出總分與平均 ?
        // Java 7
        int sum1 = 0;
        for(int s : scores) {
            sum1 += s;
        }
        double avgl = (double)sum1 / scores.length;
        System.out.println(sum1);
        System.out.println(avgl);
        // Java8
        int sum2 =IntStream.of(scores).sum();
        double avg2 = IntStream.of(scores).average().getAsDouble();
        //double avg3 = (double)sum2 / scores.length;
        System.out.println(sum2);
        System.out.println(avg2);
    }
}
