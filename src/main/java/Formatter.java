import com.fasterxml.jackson.core.JsonProcessingException;

import javax.xml.bind.JAXBException;

//интерфейс для изменения формата
public interface Formatter {
    String format(Book book) throws JsonProcessingException,  JAXBException;
}