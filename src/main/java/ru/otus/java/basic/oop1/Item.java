package ru.otus.java.basic.oop1;

public class Item {
    private String name;

    public String getName() {
        return name;
    }

    public Item(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println("название предмета: " + name);
    }
}