package org.example;

import java.util.InputMismatchException;
import java.util.Arrays;
import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args)  {
        int[] numbers = {3, 5, 10, 12, 4};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Список чисел: "+Arrays.toString(numbers));
        System.out.println("Выберете действие: \n1-добавить элемент \n2-удалить элемент");
        int userChoose = scanner.nextInt();

        switch (userChoose) {
            case 1:
                System.out.println("Напишите число для добавления его в список");
                try {
                    int userNumber = scanner.nextInt();
                    int[] newNumbers = Arrays.copyOf(numbers, numbers.length+1);
                    newNumbers[5] = userNumber;
                    System.out.println(Arrays.toString(newNumbers));
                    break;
                } catch (InputMismatchException ex) {
                    System.out.println("Нужно ввести целове число");
                    System.exit(1);
                }

            case 2:
                System.out.println("Укажите индекс числа который хотите удалить");
                try {
                    int userIndex = scanner.nextInt();
                    if (userIndex < 0 || userIndex > 4) {
                        System.out.println("Индекс выходит за граници массива");
                        System.exit(1);
                    }
                    int[] newNumbers = new int[numbers.length - 1];
                    System.arraycopy(numbers, 0, newNumbers, 0, userIndex);
                    System.arraycopy(numbers, userIndex + 1,newNumbers, userIndex, numbers.length - userIndex - 1);
                    System.out.println(Arrays.toString(newNumbers));
                    break;
                } catch (InputMismatchException ex) {
                    System.out.println("Нужно ввести целове число");
                    System.exit(1);
                }

            default:
                System.out.println("Неверный выбор, Введите 1 или 2");
                System.exit(1);
        }
    }
}