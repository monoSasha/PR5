package com.zheldubovskiy;

public class Drag extends Hobby{
    private int numberRaces;

    // конструкторы
    public Drag(String nameHobby, float price, int numberRaces) {
        super(nameHobby, price);
        this.numberRaces = numberRaces;
    }

    public int getNumberRaces() {
        return numberRaces;
    }

    public void setNumberRaces(int numberRaces) {
        this.numberRaces = numberRaces;
    }

    //переопределенный метод toString
    @Override
    public String toString() {
        return "Drag{" + super.toString() +
                "numberRaces=" + numberRaces +
                '}';
    }

    @Override
    public void tellAboutHobby() {
        System.out.println("Name hobby" + nameHobby + " Price" + price + " Number Races" + numberRaces);
    }


    //метод для вывода полей на экран
}
