package by.belhard.j19.lessons.lesson06.try1;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Worker("Vasyan", 18, "pick-axe");
        employee.doWork();

        employee.hashCode();

        System.out.println(employee.toString());
        ((Worker) employee).smoke();

        employee = new Manager("Igoryan", 26, "+37525000001");
        employee.doWork();
        System.out.println(employee.toString());
        ((Manager) employee).drinkCoffee();

        doWork(new Worker("wo1", 122, "instr1"));
        doWork(new Manager("mn1", 12, "123456"));
        doWork(new Janitor("jn1", 10));
    }

    public static void doWork(Employee employee) {
        employee.doWork();
    }
}
