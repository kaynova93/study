package com.ibs.taskSix;

public class Weight {
    public static final double GR_IN_KG = 1000;
    public static final double POUNDS_IN_KG = 2.2046223302272;
    public static final double GR_IN_POUNDS = 453.59243;
    public static final double CARAT_IN_KG = 5000;
    public static final double CARAT_IN_POUNDS = 2267.96215;
    public static final double CARAT_IN_GR = 5;

    /**
     * перевод килограммы в граммы
     * @param kg - кол-во кг
     * @return - граммы
     */
    public static String kgToGr(double kg) {
        return String.format("%.3f", kg * GR_IN_KG);
    }

    /**
     * Перевод граммы в килограммы
     * @param gr - кол-во грамм
     * @return - килограммы
     */
    public static String grToKg(double gr) {
        return String.format("%.3f", gr / GR_IN_KG);
    }

    /**
     * Перевод килограммы в фунты
     * @param kg - кол-во кг
     * @return фунты
     */
    public static String kgToPounds(double kg) {
        return String.format("%.3f", kg * POUNDS_IN_KG);
    }

    /**
     * Перевод фунты в кг
     * @param pounds - кол-во фунтов
     * @return - кг
     */
    public static String poundsToKG(double pounds) {
        return String.format("%.3f", pounds / POUNDS_IN_KG);
    }

    /**
     * Перевод кг в караты
     * @param kg - кол-во кг
     * @return караты
     */
    public static String kgToCarat(double kg) {
        return String.format("%.3f", kg * CARAT_IN_KG);
    }

    /**
     * Перевод караты в КГ
     * @param carat - кол-во караты
     * @return - КГ
     */
    public static String caratToKG(double carat) {
        return String.format("%.3f", carat / CARAT_IN_KG);
    }

    /**
     * Перевод гр в футы
     * @param gr - кол-во ГР
     * @return - футы
     */
    public static String grToPounds(double gr) {
        return String.format("%.3f", gr / GR_IN_POUNDS);
    }

    /**
     * Перевод футы в ГР
     * @param pounds- кол-во футов
     * @return - ГР
     */
    public static String poundsToGr(double pounds) {
        return String.format("%.3f", pounds * GR_IN_POUNDS);
    }

    /**
     * Перевод ГР в Караты
     * @param gr - кол-во ГР
     * @return - караты
     */
    public static String grToCarat(double gr) {
        return String.format("%.3f", gr * CARAT_IN_GR);
    }

    /**
     * Перевод караты в ГР
     * @param carat - кол-во карат
     * @return - ГР
     */
    public static String caratToGr(double carat) {
        return String.format("%.3f", carat / CARAT_IN_GR);
    }

    /**
     * Перевод фунты в караты
     * @param pounds - колво фунтов
     * @return - караты
     */
    public static String poundsToCarat(double pounds) {
        return String.format("%.3f", pounds * CARAT_IN_POUNDS);
    }

    /**
     * Перевод караты в фунты
     * @param carat - кол-во карат
     * @return - фунты
     */
    public static String caratToPound(double carat) {
        return String.format("%.3f", carat / CARAT_IN_POUNDS);
    }


    public static void convertKg(double kg) {
        System.out.println("Килограммы: " + kg + "\n" +
                "Граммы: " + kgToGr(kg) + "\n" +
                "Карат: " + kgToCarat(kg) + "\n" +
                "Фунты: " + kgToPounds(kg));

    }

    public static void convertGr(double gr) {
        System.out.println("Граммы: " + gr + "\n" +
                "Килограммы: " + grToKg(gr) + "\n" +
                "Карат: " + grToCarat(gr) + "\n" +
                "Фунты: " + grToPounds(gr));
    }

    public static void convertCarat(double carat) {
        System.out.println("Карат: " + carat + "\n" +
                "Килограммы: " + caratToKG(carat) + "\n" +
                "Грамм: " + caratToGr(carat) + "\n" +
                "Фунты: " + caratToPound(carat));
    }

    public static void convertPound(double pounds) {
        System.out.println("Фунты: " + pounds + "\n" +
                "Килограммы: " + poundsToKG(pounds) + "\n" +
                "Грамм: " + poundsToGr(pounds) + "\n" +
                "Карат: " + poundsToCarat(pounds));
    }
}
