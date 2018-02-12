package com.java.test;

import com.java.examples.FindOdds;

public class APITester {
    public static void main(String[] args) {
        FindOdds findOdds = new FindOdds();
        final int[] odds = findOdds.getOdds(2, 10);
        for (int odd:odds
             ) {
            System.out.println(odd);
        }
    }
}
