package com.company;

import java.util.Random;

public class Mass {
    public static void main(String[] args) {

        Random random = new Random();

        int mass[] = new int[15];

        int i,a,b,temp;
        int min,max;


        for (i = 0; i< mass.length;i++) {
            mass[i] = random.nextInt(56);
        }

        for (i=0; i< mass.length; i++){
            System.out.println("Элемент " + i + " содержит: " + mass[i] );
        }

        min = max = mass [0];
        for (i = 0; i < mass.length; i++){
            if(mass[i] < min) min = mass[i];
            if(mass[i] > max) max = mass[i];
        }

        System.out.println("================================");
        System.out.println("Минимум массива: " + min );
        System.out.println("Максимум массива: " + max);
        System.out.println("================================");

        /*пузырек*/
        for (a = 1;a < mass.length;a++){
            for (b = mass.length-1; b >= a; b--){
                if (mass[b-1] > mass [b]) {
                    temp = mass[b - 1];
                    mass[b - 1] =mass[b];
                    mass [b] = temp;
                }

            }
        }

        for (i = 0; i < mass.length; i++){
            System.out.println("Массив Bubble, элемент "+ i +" : " + mass[i] );

        }
        System.out.println("================================");
    }
}
