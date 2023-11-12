package com.ibs;

public class TaskTwelve {
    /**
     * Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:
     * 1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).
     * 2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
     * 3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
     * 4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
     * 5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).
     */

    public void run(String s){
            System.out.println("Строка содержит Java: "+s.contains("Java"));
            System.out.println("Строка начинается с I like: "+s.startsWith("I like"));
            System.out.println("Сткорка заканчивается с подставки !!!: "+s.endsWith("!!!"));
        if (s.contains("Java")&& s.startsWith("I like")&&s.endsWith("!!!")) {
            System.out.println("Все условия True, выводим строку в верхнем регистре: "+s.toUpperCase());
            s=s.replace("a","o");
            System.out.println(s.substring(7,11));

        }

    }
}
