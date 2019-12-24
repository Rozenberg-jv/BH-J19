package by.belhard.j19.hw.hw6.task2sub1;

@SuppressWarnings("Duplicates")
public class Main {

	public static void main(String[] args) {

		Author author1 = new Author("Vasily", "Vasiliev", 26);
		Author author2 = new Author("Mihail", "Mihailov", 47);
		Author author3 = new Author("Olga", "Vasilieva", 30);
		Author author4invalid = new Author("Grigory", "", 16);

		Book book1 = new Book("Skazki", 40, BookFormat.A4, author1);
		Book book2 = new Book("Encyclopedia", 360, BookFormat.A3, author1, author2);
		Book book3 = new Book("Conspiracy theories", 115, BookFormat.A5, author3);
		Book book4invalid = new Book("Reklamka", 1, BookFormat.A4, null);
		Book book5invalid = new Book("", 50, BookFormat.A3, author4invalid);

		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		System.out.println(book4invalid);
		System.out.println(book5invalid);
	}

}
