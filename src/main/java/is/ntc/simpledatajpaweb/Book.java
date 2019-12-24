package is.ntc.simpledatajpaweb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
	private @Id @GeneratedValue Long id;
	  private String name;
	  private String author;
	  private String publisher;
	  private short year;
	  
	  Book () {};
	  
	  public Book(String name, String author, String publisher, short year) {
		    this.name = name;
		    this.author = author;
		    this.publisher = publisher;
		    this.year = year;
	  }

	  @Override
	  public String toString() {
	    return String.format(
	        "Book[id=%d, name='%s', author='%s' , publisher='%s', year=%d]",
	        id, name, author, publisher, year);
	  }
	  
	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public short getYear() {
		return year;
	}

}
