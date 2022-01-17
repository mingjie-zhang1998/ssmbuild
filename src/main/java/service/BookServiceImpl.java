package service;

import dao.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pojo.Books;

import java.util.List;


@Service
public class BookServiceImpl implements BookService{
    @Autowired
    @Qualifier("bookMapper")
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks() ;
    }
}
