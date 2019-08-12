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
        Cat newPet = new Cat(10, 10, 10, 10, newName);
        newPet.game();


    }


}
