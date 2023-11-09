package com.ibs;

import java.util.Scanner;

public class TaskFourOperators {
    /**
     * Написать программу, которая будет выполнять следующие действия:
     *
     * 1. Ввести три числа с клавиатуры x, y, z
     *
     * 2. Найти и вывести в консоль среднее арифметическое этих чисел
     *
     * 3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону
     *
     * 4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
     */

    Scanner scan = new Scanner(System.in);

    double x, y, z;

    public void average(){
        x= scan.nextDouble();
        y= scan.nextDouble();;
        z= scan.nextDouble();;
        double res = (x+y+z)/3;
        System.out.println("среднее арифметическое : "+res);

        if((int)Math.floor(res/2)>3){
            System.out.println("Программа выполнена корректно");
        }else{
            System.out.println("Программа выполнена некорректно");
        }
    }


}
