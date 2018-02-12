package com.java.examples;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

    static int diagonalDifference(int[][] a) {
        int col_length=a.length;
        int primary_sum=0;
        int secondary_sum=0;
        int diag_counter=0;
        int result=0;
        for(int i=0;i<col_length;i++){
            primary_sum = primary_sum+a[i][i];
            secondary_sum = secondary_sum+(a[diag_counter++][col_length-(i+1)]);
        }
        result=primary_sum-secondary_sum;
        return Math.abs(result);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
