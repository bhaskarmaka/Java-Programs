
package com.arrays;

public class PrimePosPrimes {

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[][] arr = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        int prime = 2;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (isPrime(i + j)) {
                    arr[i][j] = prime;

                    prime++;
                    while (!isPrime(prime)) {
                        prime++;
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
