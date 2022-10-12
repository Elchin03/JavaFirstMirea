package ru.mirea.task1.Task3_6;

import java.util.Scanner;

public class Garmon {
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("длина ряда: ");
        int n = input.nextInt();
        System.out.print("число: ");
        int k = input.nextInt();
        System.out.print("ряд: ");
        for (int i=1;i<=n;i++)
        {
            double c=k/(double)i;
            System.out.print(String.format("%.3f",c)+" ");
        }
    }
}