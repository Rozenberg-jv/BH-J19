package by.belhard.j19.hw.hw9.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("all")
public class Main {

    private static Function<Integer, Integer> tripplePow = i -> (int) Math.pow(i, 3);

    private static final String DIR_PATH = "src/by/belhard/j19/hw/hw9/task2/";
    private static final String INPUT_PATH = "digits.in";
    private static final String OUTPUT_PATH = "digits.out";

    public static void main(String[] args) {

//        List<Integer> integers = new ArrayList<>();
        List<Double> collect = null;

        // read
        try (BufferedReader rdr = new BufferedReader(new FileReader(DIR_PATH + INPUT_PATH))) {

            String[] stringArray = rdr.readLine().split(" ");

//            integers = new ArrayList<>();

			/*for (String s : stringArray) {
				integers.add(tripplePow(mapToInt(s)));
			}*/

            /*for (String s : stringArray) {

                integers.add(tripplePow.apply(mapToInt(s)));
            }*/

            collect = Arrays.stream(stringArray)
                    .map(new Function<String, Double>() {
                        public Double apply(String s) {
                            return Double.parseDouble(s);
                        }
                    })
                    .map(d -> Math.pow(d, 3))
                    .filter(d -> d > 0)
                    .sorted()
                    .collect(Collectors.toList());

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        // write
        try (BufferedWriter wrt = new BufferedWriter(new FileWriter(DIR_PATH + OUTPUT_PATH))) {

            StringBuilder builder = new StringBuilder();

            /*for (Integer i : integers) {
                builder.append(i).append(" ");
            }*/
            for (Double i : collect) {
                builder.append(i).append(" ");
            }

            wrt.write(builder.toString().trim());

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    /*private static Integer mapToInt(String str) {

        return Integer.parseInt(str);
    }

    private static Integer tripplePow(int i) {

        return (int) Math.pow(i, 3);
    }*/

}
