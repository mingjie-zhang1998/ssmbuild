package dao;

import org.apache.ibatis.annotations.Param;
import pojo.Books;

import java.util.List;

public interface BookMapper {
    int addBook(Books books);

    int deleteBookById(@Param("BookID") int id);

    int updateBook(Books books);

    Books queryBookById(@Param("BookID") int id);

    List<Books> queryAllBooks();
}
