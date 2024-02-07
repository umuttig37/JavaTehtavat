package Moduuli10.library.model;

public class Book {
    public String title;
    public String author;
    public String isbn;
    public boolean reserved = false;
    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getIsbn(){
        return this.author;
    }
    public boolean getreserved(){
        return this.reserved;
    }
}

