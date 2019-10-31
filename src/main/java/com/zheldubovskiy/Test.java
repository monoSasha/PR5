package com.zheldubovskiy;

public class Test {

    public static void main( String[] args ) {

//        Scanner in = new Scanner(System.in);
//        System.out.print("Часов в день: ");
//        short dayYear = in.nextShort();
//        in.close();

//        Hobby hobby = new Hobby("fish") {
//
//        };
//        hobby.tellAboutHobby();
//
//        Hobby[] arrayHobby = new Hobby [9];
//        arrayHobby[0] = hobby.setNameHobby();
//        for (int i = 0; i<9; i++){
//            hobby.tellAboutHobby();
//        }

        Hobby hobby = new Drag("gonka", 35.5f, 5);
        Hobby hobby1 = new Fish("fish", 20.5f, 7);


//        System.out.println(hobby);
        Hobby [] hobbys = {hobby, hobby1};
        for (Hobby temp: hobbys){
            temp.tellAboutHobby();
        }

   }
}

