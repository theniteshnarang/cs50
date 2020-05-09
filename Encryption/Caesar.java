package com.pset1.Encryption;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.String;

public class Caesar {

    static StringBuffer encrypt(String p, int key) {
        StringBuffer result= new StringBuffer();
        for (int i = 0; i < p.length(); i++) {
            if(Character.isUpperCase(p.charAt(i))) {
                char ch = (char)(((int) p.charAt(i) + key - 65) %26 + 65); //This is simple type casting.
                result.append(ch);
            }
            else {
                char ch = (char) (((int) p.charAt(i) + key - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int key=0;
        Scanner sc= new Scanner(System.in);
        do{
        try {
                System.out.print("Enter key:");
                key = sc.nextInt();
        }catch(InputMismatchException e){
                System.out.println("Please Enter Integer Value");
                System.exit(0);
        }}while (key<0);
        sc.nextLine();  //To clear the buffer
        System.out.print("Enter plain text:");
        String plain = sc.nextLine();
        System.out.print("Cipher Text: "+ encrypt(plain,key));
    }
}