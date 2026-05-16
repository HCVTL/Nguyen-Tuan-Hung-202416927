package Media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private ArrayList<String> authors = new ArrayList<String>();

    public Book() {
        super();
    }

    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) return;

        authors.add(authorName);
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        }
    }
}
