package com.java.examples;

import java.util.ArrayList;
import java.util.List;

public class FindOdds {
    public int[] getOdds(int l, int r){
        List<Integer> result= new ArrayList<>();
        int[] output;


        for(int i=l;i<=r;i++){
            if(i%2!=0){
                result.add(i);

            }
        }
        output= new int[result.size()];
        for(int i=0;i<result.size();i++){
            output[i]=result.get(i);
        }
        return output;
    }
}
