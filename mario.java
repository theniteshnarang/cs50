package com.pset1;

import java.util.Scanner;

public class mario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h;
        do{
            System.out.print("Height:");
            h = sc.nextInt();
        } while (h > 7 || h < 1 );
        sc.nextLine();
        int t=10;
        for(int i=0; i < h;i++){
            for (int j = 0; j < t; j++) {
                if (j >= 6) {
                    if (j == 7 || j == 8) {
                        System.out.print(" ");
                    } else
                        System.out.print("#");
                } else {
                    if ((i + j) >= 6) {
                        System.out.print("#");
                    } else
                        System.out.print(" ");
                }
            }
            t += 1;
            System.out.println();
        }
    }
}
