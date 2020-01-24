package by.belhard.j19.lessons.lesson13.annotations.model;


import by.belhard.j19.lessons.lesson13.annotations.ExtendedInformation;

@ExtendedInformation(count = 10)
public class Tatata implements Data{

    private final String title;
    private final String data;

    public Tatata(String title, String data) {
        this.title = title;
        this.data = data;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getData() {
        return data;
    }
}
