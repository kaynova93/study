package com.ibs.finalTasks;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class FinalTaskTwo {
    /**
     * Напишите программу, которая позволит решить простое уравнение относительно x.
     * Программа принимает на вход строку длиной 5 символов.
     * Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
     * Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’
     * (обозначает неизвестное) в любом порядке.
     * Нужно найти неизвестное.
     * Пример для теста работы программы:
     * - Ввод: x+5=7
     * - Вывод: 2
     * - Ввод: 3-x=9
     * - Вывод: -6
     * - Ввод: 3-3=x
     * - Вывод: 0
     */

    String[] arrInput =new String[5];
    public void run(){
        System.out.println("Ввод: ");
        arrInput = new Scanner(System.in).nextLine().split("");
        searchX();
    }
    public void searchX(){
        int x=0;
        if (arrInput[1].equals("+")) {
            if (searchIndexX() == 0) {
                x = parseInt(arrInput[4])-parseInt(arrInput[2]);
            }else if (searchIndexX() == 2){
                x = parseInt(arrInput[4])-parseInt(arrInput[0]);
            }else if (searchIndexX() == 4){
                x = parseInt(arrInput[0])+parseInt(arrInput[2]);
            }
        }if (arrInput[1].equals("-")){
            if (searchIndexX() == 0) {
                x = parseInt(arrInput[4])+parseInt(arrInput[2]);
            }else if (searchIndexX() == 2){
                x = parseInt(arrInput[0])-parseInt(arrInput[4]);
            }else if (searchIndexX() == 4){
                x = parseInt(arrInput[0])-parseInt(arrInput[2]);
            }
        }
        System.out.println("Вывод: "+x);
    }

    public int searchIndexX(){
        int xIndex=0;
        for (int i=0; i<arrInput.length;i++) {
            if(arrInput[i].equals("x")||arrInput[i].equals("х")){
                xIndex= i;
            }
        }
        return xIndex;
    }
}
