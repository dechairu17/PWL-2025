package week10.jobsheet;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Numbers08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber [][] =new int[3][];
        myNumber [0] = new int[5];
        myNumber [1] = new int[3];
        myNumber [2] = new int[1];

        for (int i = 0; i < myNumber.length; i++) {
            System.out.println("Panjang baris ke- " + (i+1) + ": " + myNumber[i].length);
        }
    }
}
