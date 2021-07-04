package com.company;

import java.util.Scanner;


public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первую строку");
        String a = sc.nextLine();
        System.out.println("Введите вторую строку");
        String b = sc.nextLine();

        char arrA[] = a.toCharArray();

        char arrB[] = b.toCharArray();

        int i = 0;
        int count = 0;

        while (i < arrA.length || i < arrB.length ) {

            if(arrA.length == arrB.length){
                if (arrA[i] != arrB[i]) {
                    count++;
                }
            }
            else {
                System.out.println("Hельзя сравнивать");
                return;
            }
            i++;
        }
        System.out.println(" Количество различий: " + count);
    }
}




