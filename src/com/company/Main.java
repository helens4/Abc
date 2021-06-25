package com.company;

import java.lang.reflect.Field;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {


    public static void main(String[] args) throws InterruptedException {

        int[] arr = {4, 6, 7, 9, 12};

        for (int i = 0; i < arr.length; i++) {

            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }


        int start = 0;
        int end = arr.length - 1;

        int findNumber = 6;

        while(start <= end) {
            int tryPosition = start + (end - start) / 2;
            if(findNumber < arr[tryPosition])
                end = tryPosition - 1;
            else if(findNumber > arr[tryPosition])
                start = tryPosition + 1;
            else {
                System.out.println("number " + arr[tryPosition] + " is at " + tryPosition);
                start = end + 1;
            }
        }


    }


}
