package main.java.general;

import main.java.dao.BookDao;
import main.java.table.Book;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by 12 on 29.01.2017.
 */
public class Project {
    public static void main(String[] args)throws SQLException{
        Factory factory=Factory.getInstance();
        BookDao bookDao=factory.getBookDao();

        //сюда пишем addBook,getBook,etc
        Book bookx=new Book();
        //bookx.setId(2);
        bookx.setDescription("321");
        bookx.setTitle("xyz");
        bookx.setIsbn(1917);
        System.out.println(bookx.getId());
        bookDao.addBook(bookx);
        List<Book> books=bookDao.getBooks();
        for(Book book:books){
            System.out.println(book.getId()+"   "+book.getIsbn()+"  "+
            book.getTitle()+"   "+
            book.getDescription());
        }
    }
}
