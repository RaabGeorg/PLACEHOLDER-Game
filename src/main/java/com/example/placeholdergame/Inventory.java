package com.example.placeholdergame;

public class Inventory {private Item[] inventory; //array to story items
    private int invSize; //max size of inventory
    private int currentInv; //number of items in inventory

    public Inventory(int size){
        this.inventory = new Item[size];
        this.invSize = size;
        this.currentInv = 0;
    }

    public void addItem(Item item){
        if(currentInv < invSize){
            inventory[currentInv] = item;
            currentInv++;
        }
        else{
            System.out.println("Inventory is full");
        }
    }

    public void printInventory(){
        System.out.println("Items in inventory:");
        for (int i = 0; i < currentInv; i++) {
            Item item = inventory[i];
            System.out.println(item.getName() + "(" + item.getNumber() + ")");
        }
    }
    public void removeItem(Item item){
        int itemToRemove = -1;
        for (int i = 0; i < currentInv; i++){
            if(inventory[i].getName().equals(item.getName())){
                itemToRemove = i;
                break;
            }
        }
    }
}
