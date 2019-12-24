package by.belhard.j19.hw.hw6.task2sub2;

public class Book {

	private static final String DEFAULT_TITLE = "DEFAULT TITLE";
	private static final int DEFAULT_PAGE_COUNT = 10;

	private String title;

	private int pageCount;

	private Author[] authors;

	private BookFormat format;

	public Book(String title, int pageCount, BookFormat format, Author... authors) {

		if (title == null || title.length() == 0)
			title = DEFAULT_TITLE;

		if (pageCount < 2)
			pageCount = DEFAULT_PAGE_COUNT;

		if (authors == null || authors.length == 0)
			authors = new Author[] {new Author("Ivan", "Ivanov")};

		this.title = title;
		this.pageCount = pageCount;
		this.authors = authors;
		this.format = format;
	}

	public String getTitle() {

		return title;
	}

	public int getPageCount() {

		return pageCount;
	}

	public Author[] getAuthors() {

		return authors;
	}

	public BookFormat getFormat() {

		return format;
	}

	@Override
	public String toString() {

		String authorsList = "";

		for (Author author : authors)
			authorsList += author + "\n";

		return String.format("Book: \"%s\", %d pages, format: %s. Authors list:\n%s",
				title, pageCount, format, authorsList);
	}
}
