

import javax.xml.bind.JAXBException;
import java.io.FileWriter;
import java.io.IOException;


public class BookStoreImpl implements BookStore {
    private Formatter format;
    private String filename;

    public BookStoreImpl(Formatter format, String filename) {
        this.format = format;
        this.filename = filename;
    }

    @Override
    public void store(Book book) {

        try { 
            FileWriter fw = new FileWriter(filename, true);
            fw.write(format.format(book));
            fw.write("\n");
            fw.close();
        } catch (IOException | JAXBException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }


    }


}
