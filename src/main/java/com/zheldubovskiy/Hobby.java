package com.zheldubovskiy;

// Класс Hobby
public class Hobby {
    // 8 полей всех примитивных типов + одно поле String
    public String nameHobby;
    public byte hoursDay;
    public short dayYear;
    public char idHobby;
    public int idUsers;
    public long numberOfVisits;
    public float price;
    public double allPrice;
    public boolean likeHobby;

    // конструкторы


    public Hobby(String nameHobby, byte hoursDay, float price) {
        this.nameHobby = nameHobby;
        this.hoursDay = hoursDay;
        this.price = price;
    }

    public Hobby(){

    }





    // Get and Set для всех полей

    public String getNameHobby() {
        return nameHobby;
    }

    public void setNameHobby(String nameHobby) {
        this.nameHobby = nameHobby;
    }

    public byte getHoursDay() {
        return hoursDay;
    }

    public void setHoursDay(byte hoursDay) {
        this.hoursDay = hoursDay;
    }

    public short getDayYear() {
        return dayYear;
    }

    public void setDayYear(short dayYear) {
        this.dayYear = dayYear;
    }

    public char getIdHobby() {
        return idHobby;
    }

    public void setIdHobby(char idHobby) {
        this.idHobby = idHobby;
    }

    public int getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(int idUsers) {
        this.idUsers = idUsers;
    }

    public long getNumberOfVisits() {
        return numberOfVisits;
    }

    public void setNumberOfVisits(long numberOfVisits) {
        this.numberOfVisits = numberOfVisits;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public double getAllPrice() {
        return allPrice;
    }

    public void setAllPrice(double allPrice) {
        this.allPrice = allPrice;
    }

    public boolean isLikeHobby() {
        return likeHobby;
    }

    public void setLikeHobby(boolean likeHobby) {
        this.likeHobby = likeHobby;
    }


    //переопределенный метод toString
    @Override
    public String toString() {
        return "Hobby{" +
                "nameHobby='" + nameHobby + '\'' +
                ", hoursDay=" + hoursDay +
                ", dayYear=" + dayYear +
                ", idHobby=" + idHobby +
                ", idUsers=" + idUsers +
                ", numberOfVisits=" + numberOfVisits +
                ", price=" + price +
                ", allPrice=" + allPrice +
                ", likeHobby=" + likeHobby +
                '}';
    }
    //метод для вывода полей на экран
    public void tellAboutHobby(){

        System.out.println( "Название хобби " +  nameHobby );
        System.out.println( "Часов в день " + hoursDay );
        System.out.println( "Дней в году " + dayYear );
        System.out.println( "ID Хобби " + idHobby );
        System.out.println( "ID пользователя " + idUsers );
        System.out.println( "Количество посещений - " + numberOfVisits );
        System.out.println( "Цена: " + price );
        System.out.println( "Цена за весь период : " + allPrice );
        System.out.println( "Понравилось или нет? " + likeHobby );
    }



}