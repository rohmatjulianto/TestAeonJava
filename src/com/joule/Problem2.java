package com.joule;

import java.util.ArrayList;

public class Problem2 {
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1,2,3,4,5};
        System.out.println(solution(arr));
    }

    public static ArrayList<Integer> solution (Integer[] arr){
        int sum = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i< arr.length; i++){
            sum = sum+ arr[i];
        }

        if (sum != 0){
            for (int j = 0; j < arr.length; j++){
                int res = sum / arr[j];
                result.add(res);
            }
        }

        return result;

    }
}
