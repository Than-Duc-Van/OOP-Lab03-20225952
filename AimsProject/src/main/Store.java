package main;

import java.util.ArrayList;

import main.DigitalVideoDisc;

public class Store {
    // Attribute: ArrayList to store DVDs available in the store
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    // Method to add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
        System.out.println("The DVD \"" + dvd.getTitle() + "\" has been added to the store.");
    }

    // Method to remove a DVD from the store
    public void removeDVD(DigitalVideoDisc dvd) {
        if (itemsInStore.remove(dvd)) {
            System.out.println("The DVD \"" + dvd.getTitle() + "\" has been removed from the store.");
        } else {
            System.out.println("The DVD \"" + dvd.getTitle() + "\" is not found in the store.");
        }
    }

    // Method to display the list of DVDs in the store
    public void displayStore() {
        System.out.println("***********************STORE***********************");
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is currently empty.");
        } else {
            System.out.println("Available DVDs in the store:");
            for (int i = 0; i < itemsInStore.size(); i++) {
                DigitalVideoDisc dvd = itemsInStore.get(i);
                System.out.printf("%d. Title: %s - Category: %s - Director: %s - Length: %d - Price: %.2f $\n",
                                  i + 1,
                                  dvd.getTitle(),
                                  dvd.getCategory(),
                                  dvd.getDirector(),
                                  dvd.getLength(),
                                  dvd.getCost());
            }
        }
        System.out.println("**************************************************");
    }
}