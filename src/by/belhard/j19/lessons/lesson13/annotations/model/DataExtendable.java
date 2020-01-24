package by.belhard.j19.lessons.lesson13.annotations.model;


import by.belhard.j19.lessons.lesson13.annotations.ExtendedInformation;

@ExtendedInformation
public class DataExtendable implements Data{

    private final String title;
    private final String data;

    public DataExtendable(String title, String data) {
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
