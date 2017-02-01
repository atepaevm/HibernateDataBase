package main.java.general;

import main.java.business.*;
import main.java.dao.BookDao;
import main.java.dao.impl.BookDaoImpl;
import main.java.table.Book;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by 12 on 29.01.2017.
 */
public class Project {
    private static BasicAdd basicAdd;
    private static BasicDelete basicDelete;
    private static BasicGetBook basicGetBook;
    private static BasicGetBooks basicGetBooks;

    public static void main(String[] args)throws SQLException{
        Factory factory=Factory.getInstance();
        Book bookx=new Book();
        bookx.setDescription("321");
        bookx.setTitle("Ayz");
        bookx.setIsbn(1917);
        ApplicationContext context=new FileSystemXmlApplicationContext("C:\\Users\\12\\IdeaProjects\\HibernateDataBase\\src\\main\\java\\general\\general.xml");
        BeanFactory factory1 =(BeanFactory)context;
        Project project=(Project)factory1.getBean("generalProject");
        if(project.basicGetBook.getBook(5)==null){
            System.out.println("null!");
        }
        else{
            System.out.println("not null");
        }
        System.out.println();
        BookDaoImpl bookDao=new BookDaoImpl();
        List<Book> books=project.basicGetBooks.getBooks();
        for(Book book:books){
            System.out.println(book.getId()+"   "+book.getIsbn()+"  "+
            book.getTitle()+"   "+
            book.getDescription());
        }
    }

    public void setBasicAdd(BasicAdd basicAdd) {
        this.basicAdd = basicAdd;
    }

    public BasicAdd getBasicAdd() {
        return basicAdd;
    }

    public void setBasicDelete(BasicDelete basicDelete) {
        this.basicDelete = basicDelete;
    }

    public BasicDelete getBasicDelete() {
        return basicDelete;
    }

    public void setBasicGetBook(BasicGetBook basicGetBook) {
        this.basicGetBook = basicGetBook;
    }

    public BasicGetBook getBasicGetBook() {
        return basicGetBook;
    }

    public void setBasicGetBooks(BasicGetBooks basicGetBooks) {
        this.basicGetBooks = basicGetBooks;
    }

    public BasicGetBooks getBasicGetBooks() {
        return basicGetBooks;
    }
}
