package com.markwilliams;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        name();

    }
    public static void name() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Choose a name for your pet");
        String newName = myScanner.nextLine();
        System.out.println(String.format("Your new pet is called %s", newName));
        System.out.println("What type of pet would you like? (Cat or Dog?)");
        String newType2 = myScanner.nextLine();
        System.out.println(String.format("You've chosen a %s who's name is %s", newType2, newName));
        Cat newPet = new Cat(10, 10, 10, 10, newName);
        Dog newPet2 = new Dog(10, 10, 10, 10, newName);

        newPet.game();


    }


}
