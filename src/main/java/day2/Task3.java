package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = s.nextInt();
        int b = s.nextInt();

        int x = a + 1;
        while (x < b) {
            if (x % 5 == 0 && x % 10 != 0)
            System.out.println(x);

            x++;
        }
    }
}