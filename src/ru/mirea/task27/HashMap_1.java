package ru.mirea.task27;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMap_1 {
    public static void main(String[] args) {
        HashMap<String, String> people = new HashMap<>();
        people.put("Саладанин", "Иван");
        people.put("Черняков", "Тимур");
        people.put("Чернышов", "Даниил");
        people.put("Леухин", "Илья");
        people.put("Ботоев", "Вячеслав");
        people.put("Гейдаров", "Эльчин");
        people.put("Иванов", "Иван");
        System.out.println("Список до коррекции:\n"+people);

        ArrayList<String> toDelete = new ArrayList<>();
        for (String surname:people.keySet()){
            String name = people.get(surname);
            for (String surname2:people.keySet()){
                String name2 = people.get(surname2);
                if (name2.equals(name) && !surname.equals(surname2)){
                    toDelete.add(surname);
                }
            }
        }
        for(String surname:toDelete){
            people.remove(surname);
        }
        System.out.println("Список после коррекции:\n"+people);
        people.clear();
    }
}