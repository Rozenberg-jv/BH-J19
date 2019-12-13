package by.belhard.j19.lessons.lesson03.lesson;

public class SwitchExample {

    public static void main(String[] args) {

        String inputData = "thu";

        switch (inputData) {
            case "mon":
                System.out.println("sad");
                break;
            case "tue":
                System.out.println("okay");
                break;
            case "wed":
                System.out.println("middle");
                break;
            case "thu":
                System.out.println("so close");
                break;
            case "fri":
                System.out.println("at last");
                break;
            case "sat":
            case "sun":
                System.out.println(" !YOOOHOOO! ");
                break;
            default:
                System.out.println("invalid input");
        }

    }
}
