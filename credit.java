package com.pset1;

import java.util.Scanner;

public class credit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // sum even for 1st part of summation
        // sum odd for 2nd part of summation
        String check;
        char choice;
        do {
            long sumeven = 0, sumodd = 0;
            System.out.print("Your Credit Card No. Sir:");
            long cc = sc.nextLong();  //credit card no. cc=4003600000000014

            //Convert those long no. into String as ("4003600000000014")
            String noAsString = String.valueOf(cc);

            //Assigning length of string into a len.
            int len = noAsString.length();
            //Creating a New Array with the lenth of string
            int[] num = new int[len];
            //Another new Array with the length of string
            int[] arr = new int[len];
            int checksum;

            int rem, quo; // for storing reminder and quotient

            //Above is algorithm of checksum on checking validity of cc numbers
            for (int i = 0; i < len; i++) {
                num[i] = noAsString.charAt(i) - '0';  // converting from string to an individual array.
                if (i % 2 == 0) {                       //Dividing the number into 2 parts 1st part= even places  i=0,2,4,6,....
                    arr[i] = num[i] * 2;             // as algorithim says
                    // sumeven= sumeven+ (num[i]*2);
                    if ((arr[i] % 10) == 0) {           // for 1 digit numbers like 0,1,2
                        sumeven += arr[i];
                    } else {                         // for 2 digits numbers like 10,11,12,13
                        rem = arr[i] % 10;
                        quo = arr[i] / 10;
                        sumeven = sumeven + (rem + quo);
                    }
                } else {                            //2nd part odd places    i=1,3,5,7,.....
                    sumodd += num[i];
                }
            }
            checksum = (int) (sumeven + sumodd);
            if ((checksum) % 10 == 0) {
                if (len >= 13 && len <= 16) {
                    if (len == 15 && num[0] == 3 && (num[1] == 4 || num[1] == 7)) {
                        check = "valid";
                        System.out.println("American Express Card");
                    } else if (len == 16 && num[0] == 5 && (num[1] == 1 || num[1] == 2 || num[1] == 3 || num[1] == 4 || num[1] == 5)) {
                        check = "valid";
                        System.out.println("Master Card");
                    } else if ((len == 13 || len == 16) && num[0] == 4) {
                        check = "valid";
                        System.out.println("Visa Card");
                    } else
                        check = "invalid";
                } else
                    check = "invalid";
            } else
                check="invalid";
            if(check=="valid"){
                System.out.println("Valid");
            }
            else
                System.out.println("Invalid");
            System.out.println("Sum even:"+sumeven);
            System.out.println("Sum odd:"+sumodd);
            System.out.print("Want to check another(y/n):");
            choice=sc.next().charAt(0);
        }while (choice =='y'||choice=='Y');
    }
}
