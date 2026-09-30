package com.numbersloops;

import java.util.Scanner;

public class PrimesInNum {

    static void primes(int n) {

        int temp = n;
        int length = 0;

        // Find number of digits
        while (temp > 0) {
            length++;
            temp = temp / 10;
        }

        // Generate 1 digit, 2 digit, 3 digit ... numbers
        for (int len = 1; len <= length; len++) {

            int divisor = 1;

            // Calculate 10^(len-1)
            for (int i = 1; i < len; i++) {
                divisor = divisor * 10;
            }

            int t = n;

            // Generate numbers of current length
            while (t >= divisor) {

                int num = t % (divisor * 10);

                if (num >= divisor && isPrime(num)) {
                    System.out.print(num + " ");
                }

                t = t / 10;
            }
        }
    }

    static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Num:");
        int n = sc.nextInt();

        primes(n);
    }
}