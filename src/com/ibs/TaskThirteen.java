package com.ibs;

import java.util.Scanner;

public class TaskThirteen {
    /**
     * Напишите программу, где пользователь должен ввести строку из слов,
     * разделенных пробелами. Например: “I love java 8 Я люблю java 14 core1”.
     * Выполните следующие действия:
     * 1. Выведите слова, состоящие только из латиницы.  [a-zA-Z]||[a-zA-Z]+$||^[a-zA-Z]+$
     * 2. Выведите количество этих слов.
     */

     String s = new Scanner(System.in).nextLine();
   // String t = "I love java 8 Я люблю java 14 core1";
    public void run(){
        String[] strings= s.split(" ");
        int count =0;
        for(int i=0; i< strings.length;i++){
            if (strings[i].matches("^[a-zA-Z0-10]+$")){
                    System.out.println("Состоит из латиницы: "+strings[i]);
                    count++;
            }
        }
        System.out.println("Количество слов: "+count);
    }
}
