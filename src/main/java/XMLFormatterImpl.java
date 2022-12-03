import javax.xml.bind.*;
import java.io.StringWriter;

public class XMLFormatterImpl implements Formatter {

    @Override
    public String format(Book book) throws JAXBException {

        JAXBContext context = JAXBContext.newInstance(Book.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        StringWriter sw = new StringWriter();
        marshaller.marshal(book, sw);

        return sw.toString();

    }
//        return "<book>\n" +
//                "   <title>" + book.getTitle() + "</title>\n" +
//                "   <author>" + book.getAuthor() + "</author>\n" +
//                "   <year>" + book.getYear() + "</year>\n" +
//                "</book>";
//    }
}

