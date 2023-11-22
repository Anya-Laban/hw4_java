/*
V = 17
C11 = Визначити клас косметика, який складається як мінімум з 5-и полів.

Створити клас із виконавчим методом, в якому створити масив з об’єктів класу
визначеному варіантом - Визначити клас косметика, який складається як мінімум з 5-и полів.
Відсортувати масив, за одним з полів, за зростанням, а за іншим,
за спаданням використавши при цьому стандартні засоби сортування.
Всі змінні повинні бути описані та значення їх задані у виконавчому методі.
Код повинен відповідати стандартам JCC та бути детально задокументований.
 */
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Створення масиву об'єктів класу Cosmetic
        Cosmetic[] cosmetics = {
                new Cosmetic("Lipstick", 12.99, "Maybelline", 20, "Makeup"),
                new Cosmetic("Moisturizer", 29.99, "Neutrogena", 15, "Skincare"),
                new Cosmetic("Mascara", 8.49, "L'Oréal", 10, "Makeup"),
                new Cosmetic("Cleanser", 17.5, "Cetaphil", 30, "Skincare"),
                new Cosmetic("Foundation", 21.75, "MAC", 25, "Makeup")
        };

        // Сортування за зростанням ціни косметики
        Arrays.sort(cosmetics, Comparator.comparingDouble(Cosmetic::getPrice));


        System.out.println("Сортування за зростанням ціни:");
        for (Cosmetic cosmetic : cosmetics) {
            System.out.println(cosmetic);
        }

        // Сортування за спаданням кількості одиниць косметики
        Arrays.sort(cosmetics, Comparator.comparingInt(Cosmetic::getQuantity).reversed());

        System.out.println("\nСортування за спаданням кількості:");
        for (Cosmetic cosmetic : cosmetics) {
            System.out.println(cosmetic);
        }
    }
}
