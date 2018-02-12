package com.java.examples;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        long sum = 0;
        long[] sum_arr = new long[5];
        long max=0;
        long min=0;

        for(int i=0;i<arr.length;i++){
            if(i==0){
                sum=arr[i+1]+arr[i+2]+arr[i+3]+arr[i+4];
                sum_arr[i]=sum;
            }
            if(i==1){
                sum=arr[i-1]+arr[i+2]+arr[i+3];
                sum_arr[i]=sum;
            }
            if(i==2){
                sum=arr[i-2]+arr[i-1]+arr[i+1]+arr[i+2];
                sum_arr[i]=sum;
            }
            if(i==3){
                sum=arr[i-3]+arr[i-2]+arr[i-1]+arr[i+1];
                sum_arr[i]=sum;
            }
            if(i==4){
                sum=arr[i-4]+arr[i-3]+arr[i-2]+arr[i-1];
                sum_arr[i] = sum;
            }
            sum = 0;

        }
        min=sum_arr[0];
        max=sum_arr[0];
        for(int j=0;j<sum_arr.length-1;j++){

            if(min>sum_arr[j+1]){
                min=sum_arr[j+1];
            }
            if(max<sum_arr[j+1]){
                max=sum_arr[j+1];
            }
        }
        System.out.println(min+" "+max);

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}

