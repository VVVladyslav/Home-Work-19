package org.example;

public class SumCalculator {

    public int sum(int n){
        int summa = 0;

        for (int i = 0; i <= n; i++) {
            summa = summa + i;
        }
        System.out.println(summa);

        if (summa == 0){
            throw new IllegalArgumentException("Exception!!! IllegalArgumentException");
        }
        return summa;
    }
}
