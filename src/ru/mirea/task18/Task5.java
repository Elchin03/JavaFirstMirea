package ru.mirea.task18;

public class Task5 {
    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
    }
}