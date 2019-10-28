package ru.pavlenty;

import java.util.Scanner;

public class Main {

    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int[] bb = new int[5];
        int z = bb.length;

        searchMax(enterArray(s.nextInt()));
        searchMax(enterArray(6));

    }

    public static int[] enterArray(int nn) {
        int[] x = new int[nn];
        for(int i=0;i<nn;i++) {
            x[i] = s.nextInt();
        }
        return x;
    }

    public static void searchMax(int[] z) {
        int max = z[0];
        for(int i=0;i<z.length;i++) {
            if(max < z[i]) {
                max = z[i];
            }
        }
        System.out.println(max);
    }
}
