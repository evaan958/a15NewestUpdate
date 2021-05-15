package a15;
import java.io.*;

public class Book implements Serializable {
  
  String bookName;
  String bookAuthor;
  String ISBN;

    public Book() {
     this.bookName = "Cows in the Meadow";
     this.bookAuthor = "Cyrus the Great";
     this.ISBN = "0118312365";
    }

    public Book (String bookName, String bookAuthor, String ISBN){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.ISBN = ISBN;
    }

    public String getBookName(){
        return bookName;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public String getBookAuthor(){
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor){
        this.bookAuthor = bookAuthor;
    }

    public String getISBN(){
        return ISBN;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
}
