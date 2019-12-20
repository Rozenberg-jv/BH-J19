package by.belhard.j19.hw.hw5.wardrobe;

import java.util.Arrays;

public class Wardrobe {

    private Clothes[] shelves;

    public Wardrobe(int shelvesNumber) {
        if (shelvesNumber < 1)
            return;

        this.shelves = new Clothes[shelvesNumber];
    }

    public void putOnShelf(Clothes clothes, int shelf) {

        if (shelf < 0 || shelf >= shelves.length) {
            System.out.println("BAD INPUT");
            return;
        }

        if (shelves[shelf] == null) {
            shelves[shelf] = clothes;
            System.out.println(clothes.getTitle()
                    + " is thrown into " + shelf + " shelf");
        } else
            System.out.println("BUSY");
    }

    public void throwInto(Clothes clothes) {
        for (int i = 0; i < shelves.length; i++) {
            if (shelves[i] == null) {
                shelves[i] = clothes;
                System.out.println(clothes.getTitle()
                        + " is thrown into " + i + " shelf");
                return;
            }
        }

        System.out.println("NO FREE SHELF");
    }

    public Clothes getFromShelf(int shelf) {

        Clothes result = null;

        if (shelf < 0 || shelf >= shelves.length) {
            System.out.println("BAD INPUT");
        } else if (shelves[shelf] == null) {
            System.out.println("EMPTY SHELF");
        } else {
            result = shelves[shelf];
            System.out.println("Get " + result.getTitle());
            shelves[shelf] = null;
        }

        return result;
    }

    public void lookIntoWardrobe() {

        System.out.println("\n--- WARDROBE ---");
        for (int i = 0; i < shelves.length; i++) {
            System.out.printf("%d) %20s\n", i,
                    shelves[i] == null ? "*nothing*" : shelves[i].getTitle());
        }
        System.out.println("--- -------- ---\n");
    }


}
