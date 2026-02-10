

public class Book {

    // TODO: make fields private
    private String title;
    private String author;
    private int year;
    private boolean isAvailable = true;


    // TODO: Implement parameterized constructor
    public Book(String title, String author, int year) {
        // implement
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // TODO: Implement copy constructor
    public Book(Book other) {
        // implement
        this.title = other.title;
        this.author = other.author;
        this.year = other.year;
    }

    // TODO: Implement getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // TODO: Implement borrow logic
    public void borrowBook() {
        // implement
        if (isAvailable) {
            isAvailable = false;
            System.out.println("book successfuly");


        } else {
            System.out.println("book was not borr");
        }

    }

    // TODO: Implement return logic
    public void returnBook() {
        // implement
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not borrowed.");
        }
    }



    // TODO: Override toString()
    @Override
    public String toString() {
        return "Titile: " + this.title +
                ", Author:" + author +
                ", Year:" + year +
                ",Available:" + isAvailable;
    }

    // TODO: Override equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Book other = (Book) obj;

        return title.equals(other.title) &&
                author.equals(other.author) &&
                year == other.year;

    }
}
