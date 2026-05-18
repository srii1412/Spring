package Bean;

import java.awt.print.Book;
import java.util.Map;

import com.sun.tools.javac.util.List;

public class Library {

    private List<String> books;
    private Map<String, String> authors;

    // Setter for books
    public void setBooks(List<String> books) {
        this.books = books;
    }

    // Setter for authors
    public void setAuthors(Map<String, String> authors) {
        this.authors = authors;
    }

    // Display method
    public void display() {

        System.out.println("Books List:");
        for (String books : Book) {
            System.out.println(books);
        }

        System.out.println("\nAuthors Map:");
        for (Map.Entry<String, String> entry : authors.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}


