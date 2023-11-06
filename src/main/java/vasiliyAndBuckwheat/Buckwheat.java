package vasiliyAndBuckwheat;

public class Buckwheat {

    public static int timeToEatBuckwheat = 12; // Колличество месяцев, которое Василий будет есть гречку.
    public static int priceOneKgOfBuckwheat = 100; // Цена 1 киллограма гречки.
    public static int buckwheatConsumptionPerMonth = 6; // Колличество кг, которое Василий израcходует в месяц
    public static int totalStockOfBuckwheat = timeToEatBuckwheat * buckwheatConsumptionPerMonth; // Запас кг гречки.

    public static void main(String[] args) {
        int number = 0;
        for (int i = 1; i <= 1; i++) {
            for (int j = totalStockOfBuckwheat; j >= 0; j = j - 6) {
                number += j * priceOneKgOfBuckwheat;
            }
            System.out.println(number);
        }
    }
}