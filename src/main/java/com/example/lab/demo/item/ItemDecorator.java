package com.example.lab.demo.item;

public class ItemDecorator {
    private Item item;
    public ItemDecorator(Item item){
        this.item = item;
    }

    public String getDescription(){
        return item.getDescription();
    }

    public double price(){
        return item.price();
    }
}
