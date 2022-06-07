import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _Order_QNAME =
            new QName("http://isim.vlsu.ru/schema/order", "order");

    public ObjectFactory() { }

    public LineItemsType createLineItemsType() {return new LineItemsType();}

    public OrderType createOrderType() {return new OrderType();}

    public CustomerType createCustomerType() {return new CustomerType();}

    public LineItemsType createLineItemType() {return new LineItemsType();}

    @XmlElementDecl(namespace = "http://isim.vlsu.ru/schema/order",
            name = "order")
    public JAXBElement<OrderType> createOrder(OrderType value) {
        return new JAXBElement<OrderType>(_Order_QNAME,
                OrderType.class, null, value);
    }
}
