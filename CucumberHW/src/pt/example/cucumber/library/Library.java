package pt.example.cucumber.library;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

	private final List<Book> store = new ArrayList<>();

	public void addBook(final Book book) {
		this.store.add(book);
	}

	public List<Book> findBooks(final Date from, final Date to) {
		Calendar end = Calendar.getInstance();
		end.setTime(to);
		end.roll(Calendar.YEAR, 1);

		return this.store.stream().filter(book -> isDateBetween(book.getPublished(), from, end))
				.sorted(Comparator.comparing(Book::getPublished).reversed()).collect(Collectors.toList());
	}

	private boolean isDateBetween(Date d, Date from, Calendar to) {
		return from.before(d) && to.getTime().after(d);
	}
}
