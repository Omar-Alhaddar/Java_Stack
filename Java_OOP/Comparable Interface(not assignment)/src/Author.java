import java.lang.*;

public class Author implements Comparable<Author> {
	
	String FirstName;
	String LastName;
	String BookName;
	
	public Author(String firstName, String lastName, String bookName) {
		
		this.FirstName = firstName;
		this.LastName = lastName;
		this.BookName = bookName;
	}

	@Override
	public int compareTo(Author o) {
		
		return this.FirstName.compareTo(o.FirstName);

	}

}
