package spring_jdbc.dao;

import java.util.List;

import spring_jdbc.entity.Book;

public interface BookDao {
	int insertBook(Book book);

	int updateBook(Book book);

	int deleteBook(int bookId);

	Book getBook(int bookId);

	List<Book> getAllBook();

}
