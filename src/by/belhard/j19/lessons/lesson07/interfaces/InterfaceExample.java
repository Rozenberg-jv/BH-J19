package by.belhard.j19.lessons.lesson07.interfaces;

public class InterfaceExample {

    public static void main(String[] args) {

        Workable worker = new Worker("Vasily");

        Workable machine = new Machine("T1000");

        WorkingPlace workingPlace = new WorkingPlace(worker);

        workingPlace.doWork();

        workingPlace.setPlace(machine);

        workingPlace.doWork();


//        ((Worker) worker).rest();
    }
}
