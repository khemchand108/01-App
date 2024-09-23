package in.mala.cntroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.mala.bindings.Book;

@Controller
public class BookController {
    @GetMapping("/book")
	public String getBookData(Model model)
	{
		Book bookObj = new Book(101,"Spring",450.0);
		model.addAttribute("book",bookObj);
		return "book";
		
	}
}
