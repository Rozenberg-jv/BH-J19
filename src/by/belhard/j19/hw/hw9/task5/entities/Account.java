package by.belhard.j19.hw.hw9.task5.entities;

public class Account {

    private final String name;
    private int amount;

    public Account(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void updateMoney(int amount) {
        this.amount += amount;
    }

    @Override
    public String toString() {
        return name + " " + amount;
    }
}
