package ru.mirea.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int circle = 1;
        while (circle == 1){
            int sum = 0;
            Scanner input = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            int n = input.nextInt();
            for (int i = n; i != 0; i--) {
                sum = sum + i;
            }
            System.out.println("сумма:" + sum + "\nостаться?(1-да, другое число-нет):");
            circle = input.nextInt();
        }
    }
}