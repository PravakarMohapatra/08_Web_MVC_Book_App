package in.pravakar.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.pravakar.entity.Book;
import in.pravakar.repository.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository repo;
	
	
	//Type-1
	/*@GetMapping("/book")
	public ModelAndView getBookById(@RequestParam("id") Integer id) {
		
		System.out.println("Id :: " + id);
		ModelAndView mav = new ModelAndView();
		
		Optional<Book>  findById = repo.findById(id);
		
		if(findById.isPresent()) {
			Book bookObj = findById.get();
			System.out.println(bookObj);
			//sending data to view
			mav.addObject("book", bookObj);
		}
		//setting view page name
		mav.setViewName("index");
		return mav;
		
	}*/
	
	//Type-2 (Recommended Approach)
	@GetMapping("/book")
    public String  getBookById(@RequestParam("id") Integer id, Model model) {
		
		  Optional<Book>  findById = repo.findById(id);
		  if(findById.isPresent()) {
			 Book bookObj = findById.get();
			 model.addAttribute("book", bookObj); //String AttributeName can anyname ,like=book here
			
    	   }
		  return "index" ;		
     }
	

}
