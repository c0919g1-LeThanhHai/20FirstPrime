package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int count = 0;
        int num = 1;
        while (count < 20) {
            boolean check = true;
            if (num > 2) {
                for (int i = 2; i < Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        check = false;
                    }
                }
                if(check == true) {
                    System.out.print(num + " - ");
                    count++;
                }
            }
            num++;
        }
    }
}
