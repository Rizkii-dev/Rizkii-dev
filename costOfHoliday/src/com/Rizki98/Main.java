package com.Rizki98;

public class Main {

    public static String broken(final String x) {
        String[] i = x.split("");
        StringBuilder sb = new StringBuilder();

        for(int e = 0;e < i.length;e++){
            i[e] = i[e].equals("0") ? "1" : "0";
            sb.append(i[e]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(broken("01010111"));
    }
}
