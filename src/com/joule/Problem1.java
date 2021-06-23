package com.joule;

public class Problem1 {
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{10, 15, 3, 7};
        int k = 17;

        boolean result = soultion(arr, k);
        System.out.println(result);

    }


    public static boolean soultion(Integer[] arr, int k){
        boolean result = false;
        for (int i= 0; i< arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (j != 1){
                    int sum = arr[i] + arr[j];
                    if (sum == k){
                        result = true;
                    }
                }
            }
        }
        return result;

    }
}
