import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;

public class AppTest {

    private static final String BOOKSTORE_XML = "src/main/resources/bookstore.xml";
    private static final String ISSUE_XML = "src/main/resources/example.xml";


    public static void main(String[] args) {
        try {
            Book book = new Book();

            book.setId(1);
            book.setName("ИМЯЯЯЯ");

            JAXBContext context = JAXBContext.newInstance(Book.class);
            javax.xml.bind.Marshaller m = context.createMarshaller();
            javax.xml.bind.Unmarshaller u = context.createUnmarshaller();

            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);


            Schema schema = sf.newSchema(new File(".\\src\\main\\resources\\book.xsd"));
            u.setSchema(schema);


            Book bookk = (Book) u.unmarshal(new File(BOOKSTORE_XML));

            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(book, System.out);
            m.marshal(book, new File(BOOKSTORE_XML));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
