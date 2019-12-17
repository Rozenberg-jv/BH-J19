package by.belhard.j19.hw.hw3;

public class Task8 {

    public static void main(String[] args) {

        int value = 1;

        int size = 4;

        int[][] array = new int[size][];

        for (int i = 0; i < size; i++) {
            array[i] = new int[i + 1];

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = value;
                value *= 2;
            }
        }

        for (int[] ints : array) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
