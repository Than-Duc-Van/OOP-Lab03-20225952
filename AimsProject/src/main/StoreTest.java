package main;

import main.DigitalVideoDisc;
import main.Store;

public class StoreTest {
    public static void main(String[] args) {
        // Create a new store
        Store store = new Store();

        // Create some DVD objects
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        // Test adding DVDs to the store
        System.out.println("Adding DVDs to the store:");
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Display the current store
        System.out.println("\nDisplaying store contents after adding DVDs :");
        store.displayStore();

        // Test removing a DVD from the store
        System.out.println("\nRemoving a DVD from the store :");
        store.removeDVD(dvd2);

        // Display the current store after removal
        System.out.println("\nDisplaying store contents after removing a DVD :");
        store.displayStore();

        // Test removing a DVD that does not exist in the store
        System.out.println("\nAttempting to remove a DVD not in the store :");
        store.removeDVD(dvd2);
    }
}