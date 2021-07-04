package com.company;

public class Two {
    public static void main(String[] args) {


         int [] arrOne = new int[7];
         int [] arrTwo = new int[10];

         int [] arrThree = new int[arrOne.length + arrTwo.length];

        int a=0;
        for (int i =0; i < arrOne.length; i++){
             arrOne[i] = a;
             a++;
         }

         int b = a;
         for (int i =0;  i < arrTwo.length; i++){

              arrTwo [i] = b;
              b++;

         }

    int count = 0;

    for (int i = 0; i < arrOne.length; i++){
        arrThree[i] = arrOne[i];
        count++;
    }

    for (int j =0; j < arrTwo.length; j++){
            arrThree[count++] = arrTwo[j];

    }

    for (int i =0 ; i < arrThree.length; i++){
        System.out.println(arrThree[i]);
    }


    }
}
