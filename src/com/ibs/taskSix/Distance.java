package com.ibs.taskSix;

public class Distance {

    public static final double METERS_IN_MILE = 1609.344;
    public static final double YARDS_IN_METERS = 1.0936132983377;
    public static final double FEET_IN_METERS = 3.2808398950131;
    public static final double YARDS_IN_MILE = 1760;
    public static final double FEET_IN_MILE = 5280;
    public static final double FEET_IN_YARD = 3;

    /**
     * Перевод футы в ярды
     * @param feet - кол-во футов
     * @return - ярды
     */
    public static String feetToYards(double feet) {
        return String.format("%.3f", feet / FEET_IN_YARD);
    }

    /**
     * Перевод ярды в футы
     * @param yards - кол-во ярдов
     * @return - футы
     */
    public static String yardsToFeet(double yards) {
        return String.format("%.3f", yards * FEET_IN_YARD);
    }

    /**
     * Переводим футы в мили
     * @param feet - кол-во фут
     * @return - мили
     */
    public static String feetToMiles(double feet) {
        return String.format("%.3f", feet / FEET_IN_MILE);
    }

    /**
     * Переводим мили в футы
     * @param miles - кол-во миль
     * @return - футы
     */
    public static String milesToFeet(double miles) {
        return String.format("%.3f", miles * FEET_IN_MILE);
    }

    /**
     * переводим ярды в мили
     * @param yards- кол-во ярд
     * @return - мили
     */
    public static String yardsToMiles(double yards) {
        return String.format("%.3f", yards / YARDS_IN_MILE);
    }

    /**
     * переводим мили в ярды
     * @param miles - кол-во миль
     * @return - ярды
     */
    public static String milesToYard(double miles) {
        return String.format("%.3f", miles * YARDS_IN_MILE);
    }

    /**
     * Переводим метры в футы
     * @param meters -кол-во метров
     * @return- футы
     */
    public static String metersToFeet(double meters) {
        return String.format("%.3f", meters * FEET_IN_METERS);
    }

    /**
     * Переводим футы в метры
     * @param feet - кол-во футов
     * @return- метры
     */
    public static String feetToMeters(double feet) {
        return String.format("%.3f", feet / FEET_IN_METERS);
    }

    /**
     * Переводим метры в ярды
     * @param meters - кол-во метров
     * @return - ярды
     */
    public static String metersToYards(double meters) {
        return String.format("%.3f", meters * YARDS_IN_METERS);
    }

    /**
     * Переводим ярды в мили
     * @param yards - кол-во ярдов
     * @return- мили
     */
    public static String yardsToMeters(double yards) {
        return String.format("%.3f", yards / YARDS_IN_METERS);
    }

    /**
     * Переводим метры в мили
     * @param meters - кол-во метров
     * @return - мили
     */
    public static String metersToMiles(double meters) {
        return String.format("%.3f", meters / METERS_IN_MILE);
    }

    /**
     * Переводим мили в метры
     * @param miles -кол-во миль
     * @return - ярды
     */
    public static String milesToMeters(double miles) {
        return String.format("%.3f", miles * METERS_IN_MILE);
    }

    /**
     * Вывод результата перевода метры
     * @param meters -кол-во метров
     */
    public static void convertMeters(double meters) {
        System.out.println("Метры: " + meters + "\n" +
                "Мили: " + metersToMiles(meters) + "\n" +
                "Ярды: " + metersToYards(meters) + "\n" +
                "Футы: " + metersToFeet(meters));
    }

    /**
     * Вывод результата перевода мили
     * @param miles - кол-во миль
     */
    public static void convertMiles(double miles) {
        System.out.println("Мили: " + miles + "\n" +
                "Метры: " + milesToMeters(miles) + "\n" +
                "Ярды: " + milesToYard(miles) + "\n" +
                "Футы: " + milesToFeet(miles));
    }

    /**
     * Вывод результата перевода ярды
     * @param yards - кол-во ярд
     */
    public static void convertYards(double yards) {
        System.out.println("Ярды: " + yards + "\n" +
                "Метры: " + yardsToMeters(yards) + "\n" +
                "Мили: " + yardsToMiles(yards) + "\n" +
                "Футы: " + yardsToFeet(yards));
    }

    /**
     * Вывод результата перевода футы
     * @param feet - кол-во футов
     */
    public static void convertFeet(double feet) {
        System.out.println("Футы: " + feet + "\n" +
                "Метры: " + feetToMeters(feet) + "\n" +
                "Мили: " + feetToMiles(feet) + "\n" +
                "Ярды: " + feetToYards(feet));
    }
}
