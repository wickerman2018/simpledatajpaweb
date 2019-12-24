package is.ntc.simpledatajpaweb;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	  private final BookRepository repository;

	  BookController(BookRepository repository) {
	    this.repository = repository;
	    
	    repository.save(new Book("Бьярне Страуструп", "Программирование: принципы и практика использования C++", 
	    		"Издательский дом Вильямс", (short) 2011));
	    repository.save(new Book("Николай Прохоренок", "Основы Java", 
	    		"БХВ-Петербург", (short) 2017));
	    repository.save(new Book("Герберт Шилдт", "Java. Полное руководство", 
	    		"Диалектика", (short) 2018));
	    repository.save(new Book("Ричардсон Крис", "Микросервисы. Паттерны разработки и рефакторинга.", 
	    		"Питер", (short) 2019));
	    repository.save(new Book("Гриффитс Дэвид, Гриффитс Дон", "Head First. Программирование для Android", 
	    		"Питер", (short) 2018));
	  }

	 @RequestMapping("/book")
	  public List<Book> allbook() {
	    return repository.findAll();
	  }
	 
	 @PostMapping("/book")
	  Book newEmployee(@RequestBody Book newBook) {
	    return repository.save(newBook);
	 }
	 
	@RequestMapping(value="/book/{id}")
	  public Optional<Book> book(@PathVariable long id) {
	    return repository.findById(id);
	  }
	

	
}
