package com.ibs.taskSix;

import java.util.Scanner;

public class Converter {
    static String[][] measurement = {{"масса","расстояние"},{"килограмм","грамм","фунт","карат"},{"метр","миля","ярд","фут"}};

    public static void converterNumb(){
        System.out.println("Выберите что переводить: 1 - "+ measurement[0][0]+", 2 - "+ measurement[0][1]);
        int x = new Scanner(System.in).nextInt();
        System.out.println("Выберите единицу измерения: 1 - "+measurement[x][0]+", 2 - "+measurement[x][1]+", 3 - "+measurement[x][2]+", 4 - "+measurement[x][3]);
            //System.out.println(" ");
        int y = new Scanner(System.in).nextInt();
        System.out.println("Введите число:");
        double numb =  new Scanner(System.in).nextDouble();
        System.out.println("Результат:");
        if(x == 1){
            if(y==1){
                Weight.convertKg(numb);
            } else if (y==2) {
                Weight.convertGr(numb);
            } else if (y==3) {
                Weight.convertPound(numb);
            } else if (y==4) {
                Weight.convertCarat(numb);
            }else{
                System.out.println("Введенно некорректное значение");
            }
        } else if (x == 2){
            if(y==1){
                Distance.convertMeters(numb);
            } else if (y==2) {
                Distance.convertMiles(numb);
            } else if (y==3) {
                Distance.convertYards(numb);
            } else if (y==4) {
                Distance.convertYards(numb);
            }else{
                System.out.println("Введенно некорректное значение");
            }
        }else {
            System.out.println("Введенно некорректное значение");
        }
    }

}
