package com.pset1.Encryption;

import java.util.Scanner;
import java.lang.String;

public class Caesar {
   static int check(int k){
        if(k>=26){
            k= k%26;
            return k;
        }
        else if(k<0){
            System.out.println("Error: Enter positive integer");
            System.exit(0);
            return -1;
        }
        else
            return k;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter key:");
        int key=sc.nextInt();
        sc.nextLine();
        key=check(key);
        String plain;
        int len;
        char[] cipher;
        int[] num;
        System.out.print("Enter plain text:");
        plain = sc.nextLine();
        len = plain.length();
        cipher= new char[len];
        num= new int[len];
        System.out.print("Cipher Text: ");
        for (int i = 0; i < len; i++) {
            num[i] = (int)plain.charAt(i); //plain text conversion into int array
            num[i] = num[i] + key;   //adding key to plain text
            cipher[i] = (char) num[i]; //This is simple type casting.
            System.out.print(cipher[i]);
        }
    }
}