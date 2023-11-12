package com.ibs;

import java.util.Scanner;

public class TaskSeven {
    /**
     * Напишите программу:
     * 1. Пользователь вводит размер массива и данные с клавиатуры в массив
     * 2. Сравнить элементы массива с заранее заданными константами x, y, z.
     * 3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
     */

    private final int x = 0;
    private final int y = 1;
    private final int z = 2;
    Scanner sc = new Scanner(System.in);
    int sizeArr = sc.nextInt();

    int[] numbers = new int[sizeArr];

    /**
     * вставка элементов в массив.
     */
    public void insertArrayElements() {
        for (int i = 0; i < sizeArr; i++) {
            numbers[i] = sc.nextInt();
        }
    }

    /**
     * поиск констант и вывод уведомления, если в массиве имеется константа.
     */
    public void searchConstants() {
        for (int i = 0; i < sizeArr; i++) {
            if (numbers[i] == x || numbers[i] == y || numbers[i] == z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }

    /**
     * метод для запуска.
     */
    public void run(){
        insertArrayElements();
        searchConstants();
    }
}
