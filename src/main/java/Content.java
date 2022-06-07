import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlRootElement(name = "content")
public class Content {
    String Value;
    Property Property;

    public String getValue() {
        return Value;
    }

    @XmlElement
    public void setValue(String value) {
        Value = value;
    }

    public Property getProperty() {
        return Property;
    }

    @XmlElement
    public void setProperty(Property property) {
        Property = property;
    }
}