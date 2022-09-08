package ru.mirea.task1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;






public class Number1 {
    //метод для 7
    public static int factorial(int c){
    for(int i=1;i<c.length;c++) {

    }
    }
    public static void main(String[] args){
        //3
        int sum = 0;
        int a = 0;
        int b =20;
        int[] w =new int[10];
        for (int j=0;j < 10;j++){
            w[j]= a +(int) (Math.random() * b);
        }
        String sw= Arrays.toString(w);
        System.out.println("Массив " + sw);
        for (int i=0;i<10;i++){
            sum=sum+w[i];
    }
        System.out.println("Сумма массива равна " + sum);
        //4
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент" + i + ": " + args[i]);
        }
        //5
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " число гармонического ряда " + 1./i);
        }
        //6
        int buf =0;
        int[] mas= new int[10];
        for (int k=0; k < 10;k++){
            mas[k] = new Random().nextInt(31);
        }
        String str= Arrays.toString(mas);
        System.out.println("Массив " + str);

        for (int k=0; k < 10;k++){
            for (int i=0;i<10;i++){
                if (mas[k] > mas[i]){
                    buf=mas[i];
                    mas[i]=mas[k];
                    mas[k]=buf;
                }
            }
        }
        str= Arrays.toString(mas);
        System.out.println("Отсортированный Массив " + str);
        //7


            }
        }
    }

}
