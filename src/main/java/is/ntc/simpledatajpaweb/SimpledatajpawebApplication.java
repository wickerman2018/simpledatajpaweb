package is.ntc.simpledatajpaweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpledatajpawebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpledatajpawebApplication.class, args);
	}

	
/*	  @Bean
	  public CommandLineRunner demo(BookRepository repository) {
	    return (args) -> {
	      // save a few customers
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

	      // fetch all customers
	      log.info("Customers found with findAll():");
	      log.info("-------------------------------");
	      for (Book book : repository.findAll()) {
	        log.info(book.toString());
	      }
	      log.info("");

	      // fetch an individual book by ID
	      Book book = repository.findById(1L);
	      log.info("Book found with findById(1L):");
	      log.info("--------------------------------");
	      log.info(book.toString());
	      log.info("");


	      log.info("");
	    };
	  }*/
}
