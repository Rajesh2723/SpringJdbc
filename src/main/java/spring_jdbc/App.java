package spring_jdbc;
import spring_jdbc.dao.BookDao;
import spring_jdbc.dao.BookDaoImpl;
import spring_jdbc.entity.Book;

import java.time.LocalDate;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext  ctx=new ClassPathXmlApplicationContext("config.xml");
        BookDao bookDao=(BookDao)ctx.getBean("bookDao");
//        Book book=new Book("Coding ",
//        		200,10,true,LocalDate.of(2021, 10, 10));
//        int result=bookDao.insertBook(book);
//        if(result==1) {
//        	System.out.println("Book added successfully");
//        }else {
//        	System.out.println("Book cant be added");
//        }
//        Book bookToUpdate=new Book(1,"Java",250,5,true,
//        		LocalDate.of(2023, 10, 10));
//        int updateResult=bookDao.updateBook(bookToUpdate);
//        if(updateResult==1) {
//        	System.out.println("update successfully");
//        }else {
//        	System.out.println("not updated");
//        }
//        int bookIdToDelete=2;
//        int deleteResult=bookDao.deleteBook(bookIdToDelete);
//        if(deleteResult==1) {
//        	System.out.println("Book Deleted successfully");
//        }else {
//        	System.out.println("Book cant be deleted");
//        }
        int bookToFetch=3;
        Book fetchedBook=bookDao.getBook(bookToFetch);
        System.out.println(fetchedBook);
        List<Book>books=bookDao.getAllBook();
        System.out.println(books);
        
    }
}
