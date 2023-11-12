package com.ibs;

import java.util.Scanner;

public class TaskTen {
    /**
     * Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
     * а после этого произведите вывод первой строки матрицы на экран,
     * где каждый элемент умножается на 3.
     * Размерность матрицы задается пользователем.
     */

    Scanner sc = new Scanner(System.in);
    int sizeOne = sc.nextInt();
    int sizeTwo = sc.nextInt();

    int[][] matrix = new int[sizeOne][sizeTwo];

    /**
     * Добавление элементов в матрицу
     */
    public void insertToMatrix(){

        for(int i=0;i<sizeOne;i++){
            for (int j = 0; j<sizeTwo; j++){
                int numb= sc.nextInt();
                matrix[i][j]= numb;
            }
        }
    }

    /**
     * Выводим первую строку матрицы, где каждый эл. умножен на 3.
     */
    public void printMatrix(){
        System.out.println("Вывод первой строки матрицы");
            for (int j = 0; j<sizeTwo; j++){
                System.out.println("Элемент с индексом "+j+" = "+matrix[0][j]+" умноженный на 3. Итог: "+matrix[0][j]*3);
            }
    }

    /**
     * Запуск.
     */
    public void run(){
        insertToMatrix();
        printMatrix();
    }
}
