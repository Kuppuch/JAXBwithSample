import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Date;

public class App {
    private static final String BOOKSTORE_XML = "src/main/resources/bookstore.xml";
    private static final String ISSUE_XML = "src/main/resources/example.xml";

    public static void main(String[] args) {
        try {
            Issue issue = new Issue();
            issue.setName("Задача");
            issue.setDescription("Описание");

            JAXBContext context = JAXBContext.newInstance(Issue.class);
            javax.xml.bind.Marshaller m = context.createMarshaller();
            javax.xml.bind.Unmarshaller u = context.createUnmarshaller();

            Issue ii = (Issue) u.unmarshal(new File(ISSUE_XML));

            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(issue, System.out);
            m.marshal(issue, new File(BOOKSTORE_XML));
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
