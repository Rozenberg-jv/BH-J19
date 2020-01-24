package by.belhard.j19.lessons.lesson13.properties;

public class NoSuchPropertyException extends Exception {

	public NoSuchPropertyException(String propName) {

		System.err.printf("There is no such property [%s]\n", propName);
	}
}
