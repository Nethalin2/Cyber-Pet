package com.markwilliams;

import java.util.Scanner;

public class Animal {
    private int hunger;
    private int thirst;
    private int mood;
    private int energy;


    public Animal(int hunger, int thirst, int mood, int energy) {
        this.hunger = hunger;
        this.thirst = thirst;
        this.mood = mood;
        this.energy = energy;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void play() {

        this.hunger--;
        this.thirst--;
        this.mood++;
        this.energy--;
        System.out.println(String.format("Your pet had fun playing is now %s, hunger is %s thirst is %s, energy is %s", this.mood, this.hunger, this.thirst, this.energy));
        this.checkPet();
    }

    public void eat() {
        System.out.println(String.format("Your pet is less hungry, hunger is %s thirst is %s, energy is%s and mood is %s", this.hunger, this.thirst, this.energy, this.mood));
        this.hunger++;
        this.thirst--;
        this.energy++;
        this.checkPet();
    }

    public void drink() {

        this.thirst++;
        this.energy++;
        System.out.println(String.format("Your pet is less thirsty, thirst is %s, hunger is %s, mood is %s and energy is to %s", this.thirst, this.hunger, this.mood, this.energy));
        this.checkPet();
    }

    public void pet() {
        this.mood++;
        System.out.println(String.format("is happy, mood is %s, hunger is %s, thirst is %s energy is %s", this.mood, this.hunger, this.thirst, this.energy));
        this.checkPet();

    }

    public void guard() {

        this.hunger--;
        this.thirst--;
        this.mood--;
        this.energy--;
        System.out.println(String.format("Your pet is bored hunger is %s, thirst is %s mood is %s, energy is %s", this.hunger, this.thirst, this.mood, this.energy));
        this.checkPet();
    }

    public void game() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What would you like to do with your pet? You can press 1 to play, 2 to eat, 3 to drink, 4 to pet or 5 for guard");
        int newAction = myScanner.nextInt();
        switch (newAction) {
            case 1:
                this.play();
                break;
            case 2:
                this.eat();
                break;
            case 3:
                this.drink();
                break;
            case 4:
                this.pet();
                break;
            default:
                this.guard();

        }



    }
    public void checkPet() {

        if (this.hunger == 0 || this.thirst == 0) {
            System.out.println("Your pet has died");
        } else if (this.energy == 0) {
            System.out.println("Your pet is too tired, feed or give them a drink");
        } else if (this.mood == 0) {
            System.out.println("Your pet is unhappy and needs you to pet them");
        } else {
            game();
        }

    }

}

