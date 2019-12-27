package by.belhard.j19.lessons.lesson06.try1;

public class Manager extends Employee {

    private String phone;

    public Manager(String name, int age, String phone) {
        super(name, age);
        this.phone = phone;
    }

    public void drinkCoffee() {
        System.out.println(getName() + " is drinking coffee");
    }

    @Override
    public void doWork() {
        System.out.println(getName() + " is working not very hard");
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "phone='" + phone + '\'' +
                '}' + super.toString();
    }
}
