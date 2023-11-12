package com.ibs;

import java.util.Scanner;

public class TaskEight {
    /**
     * Напишите программу, где пользователь вводит любое целое положительное число n.
     * А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
     */
    int n = new Scanner(System.in).nextInt();
    int result=0;

    /**
     * метод суммирует все нечетные числа от 1 до числа n
     */
    public void run() {
        while (n > 0) {
            if(n%2==0){
                result = result+n;
            }
            n--;
        }
        System.out.println(result);
    }
}
