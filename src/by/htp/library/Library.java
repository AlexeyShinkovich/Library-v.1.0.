package by.htp.library;

import by.htp.bookentity.Book;

public class Library {

	private int i = 0;

	private final static int NUMB = 1;

	private Book[] libraryOne = new Book[NUMB];

	public void addBook(Book book) {

		if (i >= libraryOne.length) {
			Book[] libraryTwo = new Book[libraryOne.length + 1];
			System.arraycopy(libraryOne, 0, libraryTwo, 0, libraryOne.length);
			libraryOne = libraryTwo;
		}

		libraryOne[i] = book;
		i++;
	}

	public void delBook(String title) {
		int j = 0;
		while (j < libraryOne.length) {
			if (title.equals(libraryOne[j].getTitle())) {
				libraryOne[j] = libraryOne[libraryOne.length - 1];
				Book[] libraryTwo = new Book[libraryOne.length - 1];
				System.arraycopy(libraryOne, 0, libraryTwo, 0, libraryOne.length - 1);
				libraryOne = libraryTwo;
				i--;
			} else {
				j++;
			}

		}

	}

	public void sortByYear() {
		for (int i = 0; i < libraryOne.length; i++) {
			int minInd = i;
			for (int j = i + 1; j < libraryOne.length; j++) {
				if (libraryOne[j].getYear() < libraryOne[minInd].getYear()) {
					minInd = j;
				}
			}
			Book temp = libraryOne[i];
			libraryOne[i] = libraryOne[minInd];
			libraryOne[minInd] = temp;

		}
	}

	public void searchAuthor(String... authors) {
		for (String a : authors) {

			for (Book book : libraryOne) {

				if (a.equals(book.getAuthor())) {
					book.printBook();
				}
			}
		}
	}

	public void allLibray() {
		System.out.println("All books in Library: ");
		for (Book book : libraryOne) {

			book.printBook();
		}
	}

	public boolean isEmpty() {

		if (libraryOne.length > NUMB) {
			return false;
		}
		int count = 0;
		for (Book book : libraryOne) {

			if (book == null) {
				count++;
			}

		}
		return count == libraryOne.length;

	}
}