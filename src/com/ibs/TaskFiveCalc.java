package com.ibs;

import java.util.Scanner;
public class TaskFiveCalc {
    /**
     * Напишите простой калькулятор:
     *
     * 1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’
     *
     * 2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
     */
    public void calc(){
        int a= new Scanner(System.in).nextInt();
        int b= new Scanner(System.in).nextInt();
        String operator=new Scanner(System.in).nextLine();

        switch(operator){
            case "+" :
                System.out.println(a + b);
                break;
            case "-" :
                System.out.println(a - b);
                break;
            case "*" :
                System.out.println(a * b);
                break;
            case "/" :
                System.out.println(a / b);
                break;
            default:
                System.out.println("Некорректный оператор");
        }
    }
}
