package com.ibs;

public class TaskFourteen {
    /**
     * Напишите программу, заполняющую массив из 15 элементов рандомными значениями
     * в диапазоне от -20 до 20. Далее:
     * 1. Выведите максимальный и минимальный элемент массива.
     * 2. Из максимального и минимального значения выведите наибольшее по модулю.
     */

    int[] arr = new int[15];
    final int min = -20; // Минимальное число для диапазона
    final int max = 20; // Максимальное число для диапазона

    public void run() {
        insertArr(min, max);
        System.out.println("Максимальный элемент: "+getMaxArr());
        System.out.println("Минимальный элемент: "+getMinArr());
        System.out.println("Наибольшее по модулю: "+getMaxAbs());
    }

    public int getMaxAbs(){
        return Math.max(Math.abs(getMaxArr()),Math.abs(getMinArr()));
    }

    /**
     * Метод получения псевдослучайного целого числа от min до max (включая max);
     */
    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    /**
     * вставляем значения в массив
     * @param min - минимальное зн диапозона
     * @param max - максимальное зн диапозона
     * @return массив с элементами
     */
    public int[] insertArr(int min, int max){
        System.out.println("Элементы массива: ");
        for (int i = 0; i < arr.length; i++){
            arr[i]=rnd(min, max);
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        return arr;
    }

    /**
     * Метод ищет максимальный элемент в массиве
     * @return - найденный максимальный элемент
     */
    public int getMaxArr(){
        int max=0;
        for (int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }

    /**
     * Метод ищет минимальный эл в массиве
     * @return найденный минимум
     */
    public int getMinArr(){
        int min=0;
        for (int i=0;i<arr.length;i++){
            min = Math.min(min,arr[i]);
        }
        return min;
    }
}
