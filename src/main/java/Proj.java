import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;

public class Proj {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(OrderType.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = sf.newSchema(new File("src/main/resources/order.xsd"));
            unmarshaller.setSchema(schema);


            OrderType order = (OrderType) unmarshaller.unmarshal(new File("src/main/resources/orderSample.xml"));

            // прикладной анализ
            CustomerType customer = order.getCustomer();
            System.out.println("<html><head><title>Заказ</title></head>");
            System.out.println("<body><h2>Заказ</h2>");
            System.out.println("<body><h3>" + customer.getFirstName()
                    + " " + customer.getLastName() + "</h3>");
            System.out.println("<table><thead><tr>"
                    + "<th>Товар</th><th>Количество</th></tr></thead><tbody>");

            for (LineItemsType lineItem : order.getLineItems().getLineItem())
                System.out.println("<tr><td>" + lineItem.getSku()
                        + "</td><td>" + lineItem.getQuantity() + "</td></tr>");

            System.out.println("</tbody></table></body></html>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
