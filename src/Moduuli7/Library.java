package Moduuli7;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Book> borrowedBooks = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void displayBooks(){
        if(!books.isEmpty()) {
            System.out.println("All the books in the list:");
            for (Book book : books) {
                System.out.println("title: " + book.getTitle() + " author: " + book.getAuthor() + " year: " + book.getYear());
            }
        }
        else
            System.out.println("The list is empty!");
    }

    public void findBooksByAuthor(String author){
        boolean didFind = false;
        System.out.println("Books with author " + author + ":");
        for (Book book : books){
            if(book.getAuthor().equalsIgnoreCase(author)){
                System.out.println("title: " + book.getTitle() + " author: " + book.getAuthor() + " year: " + book.getYear());
                didFind = true;
            }
        }
        if(!didFind)
            System.out.println("No books with this author.");
    }

    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    public double getAverageBookRating() {
        if (books.isEmpty()) {
            return 0.0;
        }

        double totalRating = 0.0;
        for (Book book : books) {
            totalRating += book.getRating();
        }
        return totalRating / books.size();
    }

    public Book getMostReviewedBook() {
        if (books.isEmpty()) {
            return null;
        }

        Book mostReviewedBook = books.get(0);
        int maxReviews = mostReviewedBook.getReviews().size();

        for (Book book : books) {
            if (book.getReviews().size() > maxReviews) {
                mostReviewedBook = book;
                maxReviews = book.getReviews().size();
            }
        }
        return mostReviewedBook;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void borrowBook(User user, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                borrowedBooks.add(book);
                user.borrowBook(book);
                return;
            }
        }
        System.out.println("No books with this title.");
    }

    public void returnBook(User user, Book book) {
        if (user.getBorrowedBooks().contains(book)) {
            borrowedBooks.remove(book);
            books.add(book);
            user.returnBook(book);
        } else {
            System.out.println("This book isn't borrowed by the user.");
        }
    }

    public static void main(String[] args){
        Book book1 = new Book("The wolf of the wallstreet", "Jordan Belfort", 2007);
        Book book2 = new Book("Umut's Book", "Umut Uygur", 2024);
        Book book3 = new Book("Umut's second book", "Umut Uygur", 2020);
        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();
        library.findBooksByAuthor("Umut Uygur");
        library.findBooksByAuthor("aaaa");
    }
    }


