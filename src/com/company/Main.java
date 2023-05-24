package com.company;
import java.util.Scanner;



public class Main {
    // main

    public static int Power(int a, int b) {
        int res = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                res *= a;
            }
            b /= 2;
            a *= a;
        }
        return res;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(Power(a, b));
    }
}
