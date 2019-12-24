package by.belhard.j19.hw.hw5.wardrobe;

public class Clothes {

    private String title;

    public Clothes(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("Clothes[%s]", title);
    }
}
