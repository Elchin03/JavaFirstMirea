package ru.mirea.task3;

public class Human {
    private String name;
    private Leg legs=new Leg();
    private Head head=new Head();
    private Hand hands=new Hand();
    public Human(String name) {
        this.name = name;
        head.setHealth((int) (Math.random()*100));
        legs.setHealth((int) (Math.random()*100));
        hands.setHealth((int) (Math.random()*100));
    }
    public String getName(){return name;}
    public String getStatistic()
    {
        return "Человек по имени: "+getName()+"\n"+"Здоровье:"+"\n"+"Руки: "+hands.getHealth()+"%"+"\n"+"Ноги: "+legs.getHealth()
                +"%"+"\n"+"Голова: "+head.getHealth()+"%"+"\n"+"Тело: ";
    }
}