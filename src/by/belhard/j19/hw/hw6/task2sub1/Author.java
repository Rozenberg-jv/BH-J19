package by.belhard.j19.hw.hw6.task2sub1;

public class Author {

	private static final int DEFAULT_AUTHORS_AGE = 40;
	private static final int AGE_LOWER_BOUND = 18;

	private String firstname;
	private String lastname;
	private int age;

	public Author(String firstname, String lastname, int age) {

		this.firstname = firstname;
		this.lastname = lastname;

		if (age < AGE_LOWER_BOUND)
			age = AGE_LOWER_BOUND;

		this.age = age;
	}

	public Author(String firstname, String lastname) {

		this.firstname = firstname;
		this.lastname = lastname;
		this.age = DEFAULT_AUTHORS_AGE;
	}

	public boolean isValid() {

		return lastname != null && firstname != null && lastname.length() != 0 && firstname.length() != 0;
	}

	public String getFirstname() {

		return firstname;
	}

	public String getLastname() {

		return lastname;
	}

	public int getAge() {

		return age;
	}

	@Override
	public String toString() {

		return String.format("%s %s, %d years old", firstname, lastname, age);
	}
}
