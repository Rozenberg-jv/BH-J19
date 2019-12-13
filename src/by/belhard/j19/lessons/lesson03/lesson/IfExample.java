package by.belhard.j19.lessons.lesson03.lesson;

public class IfExample {

    public static void main(String[] args) {

        int a = -15;
        int b = 7;

        /*if (a > b + b) {
            System.out.println(a + a + " more than " + (b + b));
            System.out.println("Yes");
            a = 110;
            int c = 1100;
        }*/

        String result;
        if (a < 10) {
            result = "Jacket";
        } else if (a < 18) {
            result = "Sweater";
        } else if (a < 25) {
            result = "Pants";
        } else {
            result = "nothing";
        }

        System.out.println(result);
        System.out.println(a);
    }
}
