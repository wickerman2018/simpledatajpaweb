package is.ntc.simpledatajpaweb;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>{

	  Book findById(long id);
}
