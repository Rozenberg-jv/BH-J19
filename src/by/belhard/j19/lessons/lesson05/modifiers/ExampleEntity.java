package by.belhard.j19.lessons.lesson05.modifiers;

public class ExampleEntity {

    private String priv = "priv";
    String def = "def";
    protected String prot = "prot";
    public String pub = "pub";

    public String getPriv() {
        return priv;
    }

    public void setPriv(String priv) {
        if (priv.length() < 8)
            return;

        this.priv = priv;
    }

}
