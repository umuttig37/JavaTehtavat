package Moduuli10.library.model;
import Moduuli10.library.model.Book;
import java.util.*;
public class LibraryMember {
    public String name;
    public int memberId;
    public HashMap<Book, LibraryMember> reservedBooks = new HashMap<>();
    public ArrayList<Book> borrowedBooks = new ArrayList<>();


    public LibraryMember(String name, int memberId){
        this.name = name;
        this.memberId = memberId;
    }
    public String getName(){
        return this.name;
    }
    public int getMemberId(){
        return this.memberId;
    }
    public void AddReservedBook(LibraryMember member, Book book){
        if(!book.getreserved()){
            book.reserved = true;
            reservedBooks.put(book, member);
            System.out.println("Book reserved succesfully.");
        }
        else
            System.out.println("this book is already reserved.");
    }
    public void RemoveReservedBook(LibraryMember member, Book book){
        if(reservedBooks.containsKey(book)){
            reservedBooks.remove(book, member);
            System.out.println("Book removed succesfully.");
        }
        else{
            System.out.println("The book " + book.getTitle() + ", is not reserved.");
        }
    }
    public void getReservedBooks(){
        for (Book book : reservedBooks.keySet()){
            System.out.println(book.getTitle());
        }
    }
    public void hasReservedBook(Book book){
        for (Book checkingBook : reservedBooks.keySet()){
            if(book.getTitle().equalsIgnoreCase(checkingBook.getTitle())){
                System.out.println(checkingBook.getTitle());
            }
        }
    }

}
