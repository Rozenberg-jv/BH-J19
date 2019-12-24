package by.belhard.j19.hw.hw6.task2;

@SuppressWarnings("Duplicates")
public class Main {

	public static void main(String[] args) {

		Author author1 = new Author("Vasily", "Vasiliev", 26);
		Author author2 = new Author("Mihail", "Mihailov", 47);
		Author author3 = new Author("Olga", "Vasilieva", 30);
		Author author4invalid = new Author("Grigory", "", 16);

		Book book1 = new Book("Skazki", 40, author1, BookFormat.A4);
		Book book2 = new Book("Encyclopedia", 360, author2, BookFormat.A3);
		Book book3 = new Book("Conspiracy theories", 115, author3, BookFormat.A5);
		Book book4invalid = new Book("Reklamka", 1, null, BookFormat.A4);
		Book book5invalid = new Book("", 50, author4invalid, BookFormat.A3);

		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		System.out.println(book4invalid);
		System.out.println(book5invalid);
	}

}
