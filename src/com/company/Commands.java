package com.company;

import java.util.HashMap;

public abstract class Commands {
    HashMap<String,Integer> colors = new HashMap<>();
    String getName();

    default String render(String color) {
        return "I'm "+getName()+"! I'm sometimes "+color;
    }

}

class Apple implements Commands{
    public Apple(){
        colors.put("Green",1);
        colors.put("Red",1);
    }

    @Override
    public String getName() {
        return "Apple";
    }
}

class SKY implements Commands{
    public SKY(){
        colors.put("Blue",1);
        colors.put("Black",1);
    }

    @Override
    public String getName() {
        return "SKY";
    }
}


class Blood implements Commands{
    public Blood(){
        colors.put("Red",1);
    }

    @Override
    public String getName() {
        return "Blood";
    }
}


class Banana implements Commands{
    public Banana(){
        colors.put("Green",1);
        colors.put("Yellow",1);
    }

    @Override
    public String getName() {
        return "Banana";
    }
}

class Ink implements Commands{
    public Ink(){
        colors.put("Red",1);
        colors.put("Black",1);
    }

    @Override
    public String getName() {
        return "Ink";
    }
}


class Salt implements Commands{
    public Salt(){
        colors.put("White",1);
    }

    @Override
    public String getName() {
        return "Salt";
    }
}

class Frog implements Commands{

    Frog(){
        colors.put("blue", 1);
        colors.put("yellow", 1);
    }

    @Override
    public String getName() {
        return "Frog";
    }

    public String render(String color) {
        return "I'm "+getName()+"! I am "+color+" today";
    }

}



