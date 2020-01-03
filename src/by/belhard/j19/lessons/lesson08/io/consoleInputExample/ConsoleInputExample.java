package by.belhard.j19.lessons.lesson08.io.consoleInputExample;

import java.io.*;

public class ConsoleInputExample {

    public static void main(String[] args) {

        BufferedReader rdr =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("exampleInput.ttt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String line = "";

        while (!line.equals("exit")) {
            try {
                line = rdr.readLine();
                String[] splitted = line.split(" ");

                StringBuilder sb = new StringBuilder();
                for (String s : splitted) {
                    int i;
                    try {
                        i = Integer.parseInt(s);
                        sb.append(i * 2).append(" ");
                    } catch (NumberFormatException e) {
                        sb.append(s).append(" ");
                    }
                }

                writer.write(sb.toString().trim());
                writer.newLine();
            } catch (IOException e) {
                System.err.println("ERROR");
            }
        }

        try {
            writer.flush();
            writer.close();
            rdr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("END");
    }
}
