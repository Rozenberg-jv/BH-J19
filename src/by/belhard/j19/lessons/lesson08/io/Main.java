package by.belhard.j19.lessons.lesson08.io;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        File inputFile = new File("exampleInput.ttt");
        BufferedWriter wrt;
        InputStream inputStream;

        try {
            wrt = new BufferedWriter(new FileWriter(inputFile, true));

            wrt.write("654321");
            wrt.newLine();
            wrt.write("cba");
            wrt.flush();
            wrt.close();

            inputStream = new FileInputStream(inputFile);

            while (inputStream.available() > 0) {
                System.out.println((char) inputStream.read());
            }
            inputStream.close();
        } catch (IOException e) {
            System.err.println("ERROR");
        }
        System.out.println("END");
    }
}
