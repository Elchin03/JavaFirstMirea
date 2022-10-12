package ru.mirea.task1.Task3_6;

public class MassiveOfRands {
    public static void main(String[] args){

        int[] a = new int [1+(int)(Math.random()*10)];//Генерация чисел через метод random класса Math
        System.out.println("сгенерированный массив: ");
        for(int i = 0; i< a.length;i++)
        {
            a[i] = (int)(Math.random()*100);
            System.out.print(a[i]+" ");
        }
        for (int i=0;i<a.length;i++)
            for (int j=0;j<a.length-1;j++)
                if(a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

        System.out.println();
        System.out.println("отсортированный массив: ");
        for (int j : a) System.out.print(j + " ");
    }
}