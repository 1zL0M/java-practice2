package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        System.out.println("Угадай число от 1 до 100");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randNum = random.nextInt(1,101);
        int count = 0;

        while (count < 10){
            System.out.println("Введите число от 1 до 100");
            int userNum = scanner.nextInt();
            if (userNum < 1 || userNum > 100) {
                System.out.println("Ошибка: число должно быть в диапазоне от 1 до 100");
                continue;
            }
            else if (userNum < randNum) {
                System.out.println("Загаданное число больше");
                count ++;
                continue;
            } else if (userNum > randNum) {
                System.out.println("Загаданное число меньше");
                count++;
                continue;
            }
            else {
                System.out.println("Поздравляю! Вы угадали!");
                count++;
                System.out.println("Вы угадали за "+count+" попыток");
                System.exit(0);
            }

        }
        System.out.println("Вы потраитили все попытки. Загаданное число было "+randNum);

    }
}
