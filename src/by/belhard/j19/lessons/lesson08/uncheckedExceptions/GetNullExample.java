package by.belhard.j19.lessons.lesson08.uncheckedExceptions;

public class GetNullExample {

    private String object;

    public GetNullExample(String object) {
        this.object = object;
    }

    public String getLowercase() {

        String result;

        try {
            result = object.toLowerCase();
        } catch (NullPointerException e) {
            result = "";
        }

        return result;
    }
}
