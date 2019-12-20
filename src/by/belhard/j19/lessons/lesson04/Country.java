package by.belhard.j19.lessons.lesson04;

public class Country {

    String title;
    int zipCode;

    public Country(String title, int zipCode) {
        this.title = title;
        this.zipCode = zipCode;
    }

    public Country() {
    }

    @Override
    public String toString() {
        return "Country{" +
                "title='" + title + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
