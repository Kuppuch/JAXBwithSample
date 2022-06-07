import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;


@XmlRootElement(name = "Book")
public class Book {

    private final static QName _Order_QNAME =
            new QName("http://NamespaceTest.com/Book", "book");


    int id;
    String name;

    public int getId() {
        return id;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    @XmlElementDecl(namespace = "http://NamespaceTest.com/Book", name = "book")
    public JAXBElement<Book> createBook(Book value) {
        return new JAXBElement<Book>(_Order_QNAME,
                Book.class, null, value);
    }

}
