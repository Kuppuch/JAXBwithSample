import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderType", propOrder = {
        "customer",
        "lineItems"
})
@XmlRootElement(name = "order")
public class OrderType {

    @XmlElement(required = true)
    protected CustomerType customer;
    @XmlElement(required = true)
    protected LineItemsType lineItems;

    public CustomerType getCustomer() { return customer; }

    public void setCustomer(CustomerType value) { this.customer = value; }

    public LineItemsType getLineItems() { return lineItems; }

    public void setLineItems(LineItemsType value) { this.lineItems = value; }
}
