package in.mala.cntroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import in.mala.bindings.BooksList_Table;

@Controller
public class BookListController{
 
	@GetMapping("/books")
	public  String getBookdata(Model model)
	{
		
		BooksList_Table booklist1 = new BooksList_Table(101,"Spring",450.0);
		BooksList_Table booklist2 = new BooksList_Table(102,"Hibernate",350.0);
		BooksList_Table booklist3 = new BooksList_Table(103,"DevOps",550.0);
		List<BooksList_Table> booklist=Arrays.asList(booklist1,booklist2,booklist3);
		model.addAttribute("books",booklist);
		return "booklist";
		
	}
	 
}
