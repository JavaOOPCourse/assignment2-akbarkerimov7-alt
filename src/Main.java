import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library(10);

        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add book");
            System.out.println("2. Add e-book");
            System.out.println("3. Display all books");
            System.out.println("4. Search book by title");
            System.out.println("5. Borrow book");
            System.out.println("6. Return book");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    // TODO: Read input and add Book
                    System.out.print("Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Author: ");
                    String author = scanner.nextLine();

                    System.out.print("Year: ");
                    int year = scanner.nextInt();

                    library.addBook(new Book(title, author, year));
                    break;

                case 2:
                    // TODO: Read input and add EBook
                    System.out.print("Title: ");
                    String etitle = scanner.nextLine();

                    System.out.print("Author: ");
                    String eauthor = scanner.nextLine();

                    System.out.print("Year: ");
                    int eyear = scanner.nextInt();

                    System.out.print("File size (MB): ");
                    double size = scanner.nextDouble();

                    library.addBook(new EBook(etitle, eauthor, eyear, size));
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    // TODO: Search book
                    System.out.print("Enter title: ");
                    String search = scanner.nextLine();

                    Book found = library.searchByTitle(search);

                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    // TODO: Borrow book
                    System.out.print("Enter:");
                    library.borrowBook(scanner.nextLine());
                    break;

                case 6:
                    // TODO: Return book
                    System.out.print("Enter:");
                    library.returnBook(scanner.nextLine());
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 7);

        scanner.close();
    }
}
