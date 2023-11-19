package com.ibs.finalTasks;

import java.util.Scanner;

public class FinalTaskOne {
    /**
     * Напишите программу конвертер валют.
     * Программа должна переводить рубли в доллары по текущему курсу.
     * Пользователь вводит текущий курс и количество рублей.
     * Итоговое значение должно быть округлено до двух знаков после запятой.
     * Пример для теста работы программы:
     * - Курс доллара: 67,55
     * - Количество рублей: 1000
     * - Итого: 14,80 долларов
     */
   Scanner sc = new Scanner(System.in);

    public void run(){
        System.out.println("Введите курс: ");
        double exchangeRate= sc.nextDouble();
        System.out.println("Введите кол-во рублей: ");
        double rub = sc.nextDouble();
        System.out.println("Курс доллара: "+String.format("%.2f",exchangeRate));
        System.out.println("Количество рублей: "+String.format("%.2f",rub));
        System.out.println("Итого: "+String.format("%.2f",rub/exchangeRate));
    }

}
