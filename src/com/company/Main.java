package com.company;
import java.util.Scanner;



public class Main {

    public static int Power(int a, int b) {
        int res = 1;
        for (int i = 0; i < b; ++i) {
            res *= a;
        }
        return res;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(Power(a, b));
    }
}
