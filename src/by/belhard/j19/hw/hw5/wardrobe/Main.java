package by.belhard.j19.hw.hw5.wardrobe;

public class Main {

    public static void main(String[] args) {

        Wardrobe wardrobe = new Wardrobe(4);

        Clothes pants = new Clothes("pants");
        Clothes socks = new Clothes("socks");
        Clothes hat = new Clothes("hat");

        wardrobe.lookIntoWardrobe();
        wardrobe.putOnShelf(pants, 0);
        wardrobe.lookIntoWardrobe();
        wardrobe.putOnShelf(socks, 1);
        wardrobe.lookIntoWardrobe();
        wardrobe.putOnShelf(hat, 1);
        wardrobe.lookIntoWardrobe();
        wardrobe.throwInto(hat);
        wardrobe.lookIntoWardrobe();
        wardrobe.getFromShelf(5);
        Clothes get = wardrobe.getFromShelf(0);
        System.out.println(get.getTitle());
        wardrobe.lookIntoWardrobe();
    }
}
