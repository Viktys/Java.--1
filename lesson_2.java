package com.company;

import java.util.Arrays;

public class Main {

    //задание 1

    public static void main(String[] args) {


        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};


        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 1) {

                array1[i] = 0;
            } else if (array1[i] == 0) {
                array1[i] = 1;
            }
            // System.out.println(array1[i]);
        }
        System.out.println(Arrays.toString(array1));



        //задание 2

        int [] array2 = new int[8];
        int temp = 0;
        for (int i = 0; i < array2.length; i++) {


            if (i == 0)
            {
                array2[i] = temp;
            }
            else
            {
                temp = temp + 3;
                array2[i] = temp;
            }

        }
        System.out.println(Arrays.toString(array2));


        //задание 3

        int[] array3 ={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {

                array3[i] *=2;
            }
           // System.out.println(array3[i]);
        }
        System.out.println(Arrays.toString(array3));

        //задание 4
        int[][] arry4 = new int[8][8];
        for (int i = 0; i < arry4.length; i++) {
            for (int j = 0; j < arry4[i].length; j++) {
                arry4[i][j] = j + 1;
            }
        }
        for (int[] anArr : arry4) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }

        //задание 5

        int[] array5 ={ 5, 3, 2, 90, 4, 5, 2, 4, 8, 9, -5,100};

        int tempMax = 0;
        int tempMin = 0;


        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5.length; j++) {
                if (array5[i] < array5[j]) {
                   if (array5[j]> array5[tempMax])
                   {  tempMax = j;

                   }

                }
            }
            }

        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5.length; j++) {
                if (array5[i] > array5[j]) {
                    if (array5[j]< array5[tempMin])
                    {  tempMin = j;

                    }

                }
            }
        }
            System.out.println("Max=" + array5[tempMax] + "Min=" + array5[tempMin] );

    }
}