import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {
    @XmlElement
    private String title;
    @XmlElement
    private String author;
    @XmlElement
    private Short year;

    public Book() {

    }

    public Book(String title, String author, Short year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Short getYear() {
        return year;
    }

}
