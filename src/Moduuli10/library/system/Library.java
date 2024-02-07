package Moduuli10.library.system;
import Moduuli10.library.model.Book;
import Moduuli10.library.model.LibraryMember;
import java.util.*;
public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<LibraryMember> members = new ArrayList<>();

    public void reserveBook(Book book, LibraryMember libraryMember){
        libraryMember.AddReservedBook(libraryMember, book);
    }
    public void RemoveReservedBook(Book book, LibraryMember libraryMember){
        libraryMember.RemoveReservedBook(libraryMember, book);
    }

    public void GetReservedBooks(){

    }


    public void addBook(Book book){
        books.add(book);
        System.out.println(book.getTitle() + " added to the library.");
    }
    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println(member.getName() + " added to the system.");
    }
    public void borrowBook(LibraryMember member, Book book) {
        member.borrowedBooks.add(book);
        System.out.println(member.getName() + " borrowed book " + book.getTitle() + ".");
    }
    public void returnBook(LibraryMember member, Book book) {
        if(member.borrowedBooks.contains(book)){
            member.borrowedBooks.remove(book);
            System.out.println(member.getName() + " returned book " + book.getTitle() + ".");
        }
        else
            System.out.println("Could not find this user, or the book on the list.");

    }
}
