package com.ibs.finalTasks;

import java.util.Scanner;

public class FinalTaskFour {
    /**
     * Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”.
     * Ответ: “Заархивированный вирус”.
     * 1. У пользователя есть 3 попытки, чтобы отгадать загадку.
     * 2. Если пользователь ввел верный ответ, вывести: “Правильно!” и завершить работу.
     * 3. Если пользователь ввел неверный ответ на 1 или 2 попытке, вывести “Подумай еще!”
     * и еще раз запросить ответ у пользователя.
     * 4. Если пользователь сделал 3 неправильных попытки, вывести “Обидно, приходи в другой раз”
     * и завершить работу.
     * 5. Также пользователь имеет право на подсказку при первой попытке,
     * при этом 2 и 3 попытки уже недоступны.
     * Если на первой попытке он введет строку “Подсказка”, вывести любую подсказку.
     * Если на 2 и 3, вывести “Подсказка уже недоступна”.
     * 6. Если пользователь, использовавший подсказку,ош ибется,
     * вывести “Обидно, приходи в другой раз” и завершить работу.
     */
    private final String question ="Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";
    private final String hint = "Подсказка";
    private final String rightAnswer = "Заархивированный вирус";
    private int countAttempt = 0;

    public void run(){
        System.out.println(question);
        if(countAttempt<3) {
            checkingAnswer();
        }
    }

    public void checkingAnswer(){
        for(int i=0;i<3;i++){
            String answer =new Scanner(System.in).nextLine();
            if (answer.equals(hint)){
                if(useHint()){
                    break;
                }
            }else if (!answer.equals(rightAnswer) && countAttempt ==2) {
                System.out.println("Обидно, приходи в другой раз");
            } else if (answer.equals(rightAnswer) && countAttempt <3) {
            System.out.println("Правильно!");
                break;
            }
            else if (countAttempt<2) {
                System.out.println("Подумай еще!");
                countAttempt++;
            }
        }
    }
    public boolean useHint(){
        if(countAttempt==0){
            System.out.println("Это не лук!");
            if (rightAnswer.equals(new Scanner(System.in).nextLine())){
                System.out.println("Правильно!");
                return true;
            }
            System.out.println("Обидно, приходи в другой раз");
            return true;
        }else{
            System.out.println("Подсказка не доступна");
            countAttempt++;
            return false;
        }
    }
}