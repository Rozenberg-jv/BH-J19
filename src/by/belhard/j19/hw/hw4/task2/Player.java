package by.belhard.j19.hw.hw4.task2;

public class Player {

    private static final String DISTANCE_WORD = "distance";

    int x, y;

    double distance = 0;

    public Player() {
    }

    public Player(int x, int y, String helloMessage) {
        this.x = x;
        this.y = y;

        System.out.println(helloMessage);
    }

    void printInfo() {
//        System.out.println("[" + x + ":" + y + "] distance: " + distance);
        System.out.printf("[%d:%d] %s: %.2f\n", x, y, DISTANCE_WORD, distance);
        System.out.printf("[%.20s]\n", "qwertyuifdsdfghkhgfqwertyuifdsdfghkhgfqwertyuifdsdfghkhgfqwertyuifdsdfghkhgf");
    }

    void move(int newX, int newY) {

        distance += this.distance(newX, newY);

        this.x = newX;
        this.y = newY;
    }

    private double distance(int newX, int newY) {

        return Math.sqrt(Math.pow(this.x - newX, 2) + Math.pow(this.y - newY, 2));
    }


}
