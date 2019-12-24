package by.belhard.j19.hw.hw6.task2sub2;

public class FileCabinet {

	public void getBooksByAuthor(String firstname, String lastname, Book[] books) {

		Book[] results = new Book[16];
		int index = 0;

		for (Book book : books) {
			for (Author author : book.getAuthors())
				if (author.getFirstname().equals(firstname) && author.getLastname().equals(lastname)) {
					results[index++] = book;
					break;
				}
		}

		System.out.printf("%s %s is an author of following books list:\n", firstname, lastname);
		for (Book book : results)
			if (book != null)
				System.out.println(book.getTitle());
	}

}
