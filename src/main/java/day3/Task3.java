package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите делимое и делитель");

        for (int i = 0; i <= 5; i++) {
            if (i == 5) {
                break;
            }
            Double a = scanner.nextDouble();
            Double b = scanner.nextDouble();

            if (b == 0) {
                System.out.println("Деление на ноль");
                continue;
            }
            System.out.println(a / b);
        }
    }
}
