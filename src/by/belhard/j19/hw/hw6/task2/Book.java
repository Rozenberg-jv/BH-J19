package by.belhard.j19.hw.hw6.task2;

public class Book {

	private static final String DEFAULT_TITLE = "DEFAULT TITLE";
	private static final int DEFAULT_PAGE_COUNT = 10;

	private String title;

	private int pageCount;

	private Author author;

	private BookFormat format;

	public Book(String title, int pageCount, Author author, BookFormat format) {

		if (title == null || title.length() == 0)
			title = DEFAULT_TITLE;

		if (pageCount < 2)
			pageCount = DEFAULT_PAGE_COUNT;

		if (author == null || !author.isValid())
			author = new Author("Ivan", "Ivanov");

		this.title = title;
		this.pageCount = pageCount;
		this.author = author;
		this.format = format;
	}

	public String getTitle() {

		return title;
	}

	public int getPageCount() {

		return pageCount;
	}

	public Author getAuthor() {

		return author;
	}

	public BookFormat getFormat() {

		return format;
	}

	@Override
	public String toString() {

		return String.format("Book: \"%s\", %d pages, format: %s. Author: %s", title, pageCount, format, author);
	}
}
