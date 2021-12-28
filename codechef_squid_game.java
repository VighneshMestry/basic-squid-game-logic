package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class codechef_squid_game {
    public static Scanner sc = new Scanner(System.in);

    public static int[] insert(int size, int[] arr){
        if (size == arr.length) return arr;
        int element = sc.nextInt();
        arr[size] = element;
        insert(size+1, arr);
        return arr;
    }

    public static void sum(int[] arr){
        int sum =0;
        Arrays.sort(arr);
        for (int i =1; i< arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
        int q = sc.nextInt();
        for (int i= 0; i< q; i++){
            int size = sc.nextInt();
            int[] arr = new int[size];
            insert(0, arr);
            sum(arr);
        }
    }
}
