package com.ibs;

import java.util.Scanner;

public class TaskEleven {
    /**
     * Напишите программу:
     * 1. Ввести первое число с клавиатуры и записать его в строковую переменную.
     * 2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
     * 3. Сравнить 2 числа и вывести большее на экран
     * 4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
     */

    Scanner sc = new Scanner(System.in);
    String numbOne;
    int numbTwo;
    public void run(){
        numbOne = Integer.toString(sc.nextInt());
        numbTwo = sc.nextInt();
        System.out.println("Большее значение: "+Math.max(numbTwo,Integer.parseInt(numbOne)));
        System.out.println("Меньшее значение: "+(double) Math.min(numbTwo,Integer.parseInt(numbOne)));
    }
}
