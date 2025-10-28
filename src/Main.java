//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // задача 1
        for (short i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        // задача 2
        for (short i = 10; i > 0; i--) {
            System.out.println(i);
        }
        // задача 3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        // задача 4
        for (short i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        // задача 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        // задача 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        // задача 7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        // задача 8
        int savings = 0;
        for (short i = 1; i <= 12; i++) {
            savings += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings);
        }
        // задача 9
        int moreSavings = 0;
        for (short i = 1; i <= 12; i++) {
            moreSavings += moreSavings/100;
            moreSavings += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + moreSavings);
        }
        // задача 10
        for (short i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + 2 * i);
        }

        }
    }
