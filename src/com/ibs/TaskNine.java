package com.ibs;

import java.util.Scanner;

public class TaskNine {
    /**
     * 1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double
     * 2. Посчитайте среднее арифметическое элементов массива.
     * 3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
     */
    int size = new Scanner(System.in).nextInt();
    double[] arr = new double[size];
    Scanner sc = new Scanner(System.in);

    /**
     * Запуск.
     */
    public void run(){
        insertArray();
        printArr();
    }

    /**
     * Вставка элементов в массив.
     */
    public void insertArray(){
        for (int i=0;i<size; i++){
            arr[i]=sc.nextDouble();
        }
    }

    /**
     * метод вычесляет среднее арифметическое.
     * @return - среднее арифметическое элементов массива.
     */
    public double arithmeticMean(){
        double total=0;
        for (int i=0;i<size; i++){
            total = total+ arr[i];
        }
        return total/size;
    }

    /**
     * Вывод элементов массива умноженных на 3.
     */
    public void printArr(){
        double average = arithmeticMean();
        for (int i=0;i<size; i++){
            System.out.println(String.format("%.2f",arr[i]*average));
        }
    }
}
