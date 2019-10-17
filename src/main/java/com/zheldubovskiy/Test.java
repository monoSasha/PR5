package com.zheldubovskiy;
import java.util.Scanner;
public class Test {

    public static void main( String[] args ) {

        Scanner in = new Scanner(System.in);
        System.out.print("Часов в день: ");
        short dayYear = in.nextShort();
        in.close();

        Hobby hobby = new Hobby("fish", (byte) dayYear,  12.5f);

        hobby.tellAboutHobby();

        Hobby[] arrayHobby = new Hobby [9];
        for (int i = 0; i<9; i++){
            hobby.tellAboutHobby();
        }
    }
}

