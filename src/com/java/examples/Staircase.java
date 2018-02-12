package com.java.examples;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    static void staircase(int n) {
        StringBuffer sb = new StringBuffer();
        for(int i=1; i<=n;i++){
            for(int j=0;j<(n-i);j++){

                System.out.print(" ");


            }
            for(int k=1;k<=i;k++){

                System.out.print("#");


            }
            System.out.println();



        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
