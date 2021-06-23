package com.joule;

import java.util.ArrayList;
import java.util.HashSet;

public class Problem3 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,3,5};
        System.out.println(solution(arr));
    }

    public static int solution(Integer[] arr){
        int solution = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0 ){
                set.add(arr[i]);
            }else{
                solution = 1;
            }
        }

        if (solution != 1){
            for (int i = 0; i < arr.length+1; i++){
                if (!set.contains(i)){
                    solution = i;
                }
            }
        }
        return solution;
    }
}
