package by.belhard.j19.lessons.lesson06.try1;

public class Worker extends Employee {

    private String instrument;

    public Worker(String name, int age, String instrument) {
        super(name, age);
        this.instrument = instrument;
    }

    public void smoke() {
        System.out.println(super.getName() + " is smoking");
    }

    @Override
    public void doWork() {
        System.out.println(getName() + " works hard");
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "instrument='" + instrument + '\'' +
                '}' + super.toString();
    }
}
