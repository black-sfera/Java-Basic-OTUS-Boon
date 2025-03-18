package ru.otus.java.basic.oop1;

public class Box {
    private int size;
    private String colour;
    private boolean open;
    private Item item;


    public int getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Box(int size, String colour, boolean open) {
        this.size = size;
        this.colour = colour;
        this.open = open;
    }

    public void info() {
        System.out.println("размер коробки: " + size);
        System.out.println("цвет коробки: " + colour);
        if (open) {
            System.out.println("коробка: открыта");
        } else {
            System.out.println("коробка: закрыта");
        }
    }

    public void putItem(Item item) {  // положить предмет
        if (open) {
            if (this.item == null) {
                System.out.println("вы положили предмет " + item.getName());
                this.item = item;
            } else if (this.item != null) {
                System.out.println("в коробке есть предмет, вытащите его");
            }
        } else {
            System.out.println("предмет нельзя положить коробка закрыта");
        }
    }

    public void pullItem() {   // вытащить предмет
        if (open && item == null) {
            System.out.println("коробка открыта, нет предмета, нечего вытаскивать");
        } else if (!open) {
            System.out.println("коробка закрыта нельзя вытащить предмет");
        } else if (open && item != null) {
            System.out.println("вы вытащили предмет " + item.getName());
            this.item = null;
        }
    }

}