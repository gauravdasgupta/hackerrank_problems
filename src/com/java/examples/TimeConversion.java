package com.java.examples;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    static String timeConversion(String s) {
        String militaryFormat="";
        if(s.contains("AM")){
            if(Integer.parseInt(s.substring(0,2))==12){
                militaryFormat="00"+s.substring(2,8);
            }
            else
                militaryFormat=s.substring(0,8);
        }
        if(s.contains("PM")){
            if(Integer.parseInt(s.substring(0,2))==12){
                militaryFormat=s.substring(0,8);
            }
            else{
                int hours = Integer.parseInt(s.substring(0,2));
                hours = hours + 12;
                militaryFormat=Integer.toString(hours)+s.substring(2,8);
            }

        }
        return militaryFormat;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
