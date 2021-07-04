package com.company;

import java.lang.reflect.Array;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random r = new Random();

      int a=1;
      int b=8;

      a = a+b;
      b = a-b;
      a = a-b;
        System.out.println(a);
        System.out.println(b);



        String [] strings = new String[1000];
        for (int i =0 ; i < strings.length; i++){
            strings[i] = "a";
            System.out.println(strings[i]);
        }
    }
}
