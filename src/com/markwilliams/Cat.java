package com.markwilliams;

public class Cat extends Animal {
    private String name;

    public Cat(int  hunger, int thirst, int mood, int energy, String name) {
        super(hunger, thirst, mood, energy);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
