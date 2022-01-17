package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Books;
import service.BookService;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> l = bookService.queryAllBooks();
        model.addAttribute("list", l);
        return "allBook";
    }
}
