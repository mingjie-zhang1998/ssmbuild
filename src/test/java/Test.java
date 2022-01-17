import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Books;
import service.BookService;

import java.util.List;

public class Test {

    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
        BookService bookServiceImpl = context.getBean("BookServiceImpl", BookService.class);
        List<Books> books = bookServiceImpl.queryAllBooks();
        for (Books book : books) {
            System.out.println(book);
        }

    }

}
