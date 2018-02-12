package com.java.examples;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Plusminus {

    static void plusMinus(int[] arr) {
        double num_zeroes=0;
        double num_positives=0;
        double num_negatives=0;
        double n=arr.length;


        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                num_zeroes+=1;
            }
            if(arr[i]<0){
                num_negatives+=1;
            }
            if(arr[i]>0){
                num_positives+=1;
            }
        }

        double fraction_positive=num_positives/n;
        double fraction_negative=num_negatives/n;
        double fraction_zero=num_zeroes/n;
        System.out.printf("%.6f\n",fraction_positive);
        System.out.printf("%.6f\n",fraction_negative);
        System.out.printf("%.6f\n",fraction_zero);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
