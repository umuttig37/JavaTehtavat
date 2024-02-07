package Moduuli10.library;
import Moduuli10.library.model.*;
import Moduuli10.library.system.Library;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Wolf of the wallstreet", "Jordan Belfort", "1234567890");
        Book book2 = new Book("Umut's Book", "Umut Uygur", "0987654321");
        LibraryMember libraryMember1 = new LibraryMember("Umut Uygur", 111);
        LibraryMember libraryMember2 = new LibraryMember("Uygur Umut", 222);
        Library library = new Library();

        library.addBook(book1);
        library.addMember(libraryMember1);
        library.borrowBook(libraryMember1, book1);
        library.returnBook(libraryMember1, book1);
        //Checking does it return again
        library.returnBook(libraryMember1, book1);

        library.reserveBook(book1, libraryMember1);
        library.reserveBook(book2, libraryMember1);
        libraryMember1.getReservedBooks();
        libraryMember2.getReservedBooks(); //returns null as it should
        libraryMember1.hasReservedBook(book1);


    }
}
