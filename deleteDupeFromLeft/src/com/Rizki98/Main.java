package com.Rizki98;

import java.util.Arrays;

public class Main {

    public static int[] solve(int [] arr){
        int[] temp = new int[arr.length];
        int len = 0;
        int po = 0;

        for(int i = arr.length-1;i >= 0;i--){
            for(int j = 0;j < temp.length;j++){
                if(arr[i] == temp[j]){//if there dupe it will be delete, it start from left/last index to the first index
                    arr[i] = 0;
                    len += 1;
                    break;
                }else if(arr[i] != temp[j] && temp[j] == 0){//if there are no dupe it will be store in temp
                    temp[j] = arr[i];
                    break;
                }
            }
        }

        int[] ur = new int[arr.length-len];

        for(int q = 0;q < arr.length;q++){
            if (arr[q] != 0){
                ur[po++] = arr[q];
            }
        }

        return ur;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{3, 4, 4, 3, 6, 3, 9, 7, 9})));
    }
}
