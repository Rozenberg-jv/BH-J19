package by.belhard.j19.lessons.lesson13.annotations.model;

public class DataSimple implements Data {

    private final String title;
    private final String data;

    public DataSimple(String title, String data) {
        this.title = title;
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public String getData() {
        return data;
    }
}
