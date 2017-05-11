package by.htp.main;

import java.util.Scanner;

import by.htp.bookentity.Book;
import by.htp.library.Library;

public class MainMenu {
	private int i;

	public void mainMenu() {
		Library lib = new Library();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println(
				"1 - AddBook, 2 - DelBook,  3 - View all library, 4- Sort by year, 5 - Search Author, 0 - Exit");
		do {

			System.out.println("Select method: ");

			int i = sc.nextInt();
			this.i = i;
			if (lib.isEmpty() && (i > 1 || i < 0)) {
				System.out.println("Add Book in library");
				continue;
			}
			if (i >= 0 || i <= 5) {
				switch (i) {

				case 1:

					System.out.println("Enter year:");
					int a = sc.nextInt();
					System.out.println("Enter title:");
					String b = sc1.nextLine();
					System.out.println("Enter author:");
					String c = sc1.nextLine();
					Book book = new Book(a, b, c);
					lib.addBook(book);
					break;

				case 2:
					System.out.println("Enter title book for delite: ");
					String d = sc1.nextLine();
					lib.delBook(d);
					break;
				case 3:

					lib.allLibray();
					break;
				case 4:
					lib.sortByYear();
					break;
				case 5:

					System.out.println("Enter author:");
					String e = sc1.nextLine();
					lib.searchAuthor(e.split(","));

					break;
				}
			}

		} while (i != 0);
		sc.close();
		sc1.close();
	}

}
