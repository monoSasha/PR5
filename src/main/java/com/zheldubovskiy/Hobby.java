package com.zheldubovskiy;

// Класс Hobby
public abstract class Hobby {
    // 8 полей всех примитивных типов + одно поле String
    String nameHobby;
    float price;


    // конструкторы

    public Hobby(String nameHobby, float price) {
        this.nameHobby = nameHobby;
        this.price = price;
    }


// Get and Set для всех полей

    public String getNameHobby() {
        return nameHobby;
    }

    public void setNameHobby(String nameHobby) {
        this.nameHobby = nameHobby;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //переопределенный метод toString


    @Override
    public String toString() {
        return "Hobby{" + super.toString() +
                "nameHobby='" + nameHobby + '\'' +
                ", price=" + price +
                '}';
    }

    //метод для вывода полей на экран
    public abstract void tellAboutHobby();
}