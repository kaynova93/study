package com.ibs.finalTasks;

import java.util.Scanner;

public class FinalTaskThree {
    /**
     * Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
     * Среди данных строк найти строку с максимальным количеством различных символов.
     * Если таких строк будет много, то вывести первую.
     * Пример для теста работы программы:
     * Количество строк: 3
     * Строка 1: привет
     * Строка 2: анализ
     * Строка 3: 111111111111
     * Ответ: привет
     */
    int sizeArr = new Scanner(System.in).nextInt();
    String[] inputArr = new String[sizeArr];
    int max = 0;
    String result = "";

    public void run() {
        //наполняем массив строками
        insertArr(inputArr);
        // проходим по всем строкам в массиве
        for (int i = 0; i < sizeArr; i++) {
            // массив где храним флаг-обнуляется при каждой итерации
            boolean flag[]= new boolean[43];
            // счетчик уникального символа-обнуляется при каждой итерации
             int count = 0;

            for (int j = 0; j < inputArr[i].length(); j++) {
                int x=0;
                //Если символ цифра
                if(Character.isDigit(inputArr[i].charAt(j))){
                    x = inputArr[i].charAt(j) - '0';
                    //если символ кириллица
                } else if (Character.UnicodeBlock.of(inputArr[i].charAt(j)).equals(Character.UnicodeBlock.CYRILLIC)) {
                    x = inputArr[i].charAt(j) - 'а';
                }
                //проверяем пробел и флаг. увеличиваем счетчик+указываем флаг
                if ((inputArr[i].charAt(j) != ' ') && (flag[x] == false)) {
                    count++;
                    flag[x] = true;
                }
            }
            //сверяем счетчик тек. строки. Если тру переписываем данные
            if (count > max) {
                result = inputArr[i];
                max = count;
            }
        }
        System.out.println("Ответ: "+result);
    }

    //Заполняем массив
    public void insertArr( String[] arr){
        for (int i = 0; i< arr.length;i++){
            String s = new Scanner(System.in).nextLine();
            arr[i]=s;
        }
    }
}