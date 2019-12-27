package by.belhard.j19.lessons.lesson07.interfaces;

public class WorkingPlace {

    private Workable place;

    public WorkingPlace(Workable place) {
        this.place = place;
    }

    public void doWork() {
        place.work();
        if (place instanceof Restable) {
            ((Restable) place).rest();
        } else {
            System.out.println("This workable doesn't need to rest");
        }
    }

    public Workable getPlace() {
        return place;
    }

    public void setPlace(Workable place) {
        this.place = place;
    }

}
