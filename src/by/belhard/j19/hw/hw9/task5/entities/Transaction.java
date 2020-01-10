package by.belhard.j19.hw.hw9.task5.entities;

public class Transaction {

    private final String sender;

    private final String receiver;

    private final int amount;

    public Transaction(String sender, String receiver, int amount) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public int getAmount() {
        return amount;
    }
}
