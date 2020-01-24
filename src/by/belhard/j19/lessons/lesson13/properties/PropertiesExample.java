package by.belhard.j19.lessons.lesson13.properties;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class PropertiesExample {

	private static final Properties properties = new Properties();

	public static void main(String[] args) throws IOException {

		properties.load(new FileReader("example.properties"));

		BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));

		String input = rdr.readLine();

		while (!"exit".equals(input)) {
			try {
				printProp(input);
			} catch (NoSuchPropertyException e) {
				System.err.println(e.getMessage());
			} finally {
				input = rdr.readLine();
			}
		}
	}

	private static void printProp(String propName) throws NoSuchPropertyException {

		if (!properties.containsKey(propName))
			throw new NoSuchPropertyException(propName);

		System.out.println(properties.getProperty(propName));
	}

}
