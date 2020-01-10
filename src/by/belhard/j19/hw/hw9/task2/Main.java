package by.belhard.j19.hw.hw9.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

	private static final String DIR_PATH = "src/by/belhard/j19/hw/hw9/task2/";
	private static final String INPUT_PATH = "digits.in";
	private static final String OUTPUT_PATH = "digits.out";

	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<>();

		// read
		try (BufferedReader rdr = new BufferedReader(new FileReader(DIR_PATH + INPUT_PATH))) {

			String[] stringArray = rdr.readLine().split(" ");

			integers = new ArrayList<>();

			for (String s : stringArray) {
				integers.add(tripplePow(mapToInt(s)));
			}

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

		// write
		try (BufferedWriter wrt = new BufferedWriter(new FileWriter(DIR_PATH + OUTPUT_PATH))) {

			StringBuilder builder = new StringBuilder();

			for (Integer i : integers) {
				builder.append(i).append(" ");
			}

			wrt.write(builder.toString().trim());

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	private static Integer mapToInt(String str) {

		return Integer.parseInt(str);
	}

	private static Integer tripplePow(int i) {

		return (int) Math.pow(i, 3);
	}

}
