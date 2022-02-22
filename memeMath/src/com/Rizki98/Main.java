package com.Rizki98;

public class Main {

    public static int add(int num1, int num2) {
        String p1;
        String p2;

        if (Integer.toString(num1).length() >= Integer.toString(num2).length()){
            p1 = Integer.toString(num1);
            p2 = Integer.toString(num2);
        }else {
            p1 = Integer.toString(num2);
            p2 = Integer.toString(num1);
        }

        int j = p2.length()-1;
        String temp = "";

        System.out.println(p1 + "  ||  " + p2);


        int[] hold = new int[p1.length()];

        for (int i = p1.length()-1; i >= 0; i--){
            if (j >= 0){
                hold[i] = Integer.parseInt(String.valueOf(p1.charAt(i))) + Integer.parseInt(String.valueOf(p2.charAt(j)));
                j--;
            }else{
                hold[i] = Integer.parseInt(String.valueOf(p1.charAt(i)));
            }

        }

        for (int i = 0; i < p1.length(); i++){
            temp += hold[i];
        }

        return Integer.parseInt(temp);
    }

    public static void main(String[] args) {
        System.out.println(add(36, 165));
    }
}
