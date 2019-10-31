package com.zheldubovskiy;

public class Fish extends Hobby {
    private int weightFish;

    public Fish(String nameHobby, float price) {
        super(nameHobby, price);
    }

    public Fish(String nameHobby, float price, int weightFish) {
        super(nameHobby, price);
        this.weightFish = weightFish;
    }

    public int getWeightFish() {
        return weightFish;
    }

    public void setWeightFish(int weightFish) {
        this.weightFish = weightFish;
    }

    @Override
    public String toString() {
        return "Fish{" + super.toString() +
                "weightFish=" + weightFish +
                '}';
    }

    @Override
    public void tellAboutHobby() {
        System.out.println("Name hobby" + nameHobby + " Price" + price + " The weight fish" + weightFish);
    }
}
