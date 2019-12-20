package by.belhard.j19.hw.hw4.task2;

public class Main {
    public static void main(String[] args) {

        Player player = new Player();

        player.printInfo();
        player.move(1, 5);
        player.printInfo();
        player.move(-2, -4);
        player.printInfo();

        System.out.println(player.toString());
    }
}
