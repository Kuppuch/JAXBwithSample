import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlRootElement(name = "property")
public class Property {
    String Parameter;
    int Value;

    public String getParameter() {
        return Parameter;
    }

    @XmlElement
    public void setParameter(String parameter) {
        Parameter = parameter;
    }

    public int getValue() {
        return Value;
    }

    @XmlElement
    public void setValue(int value) {
        Value = value;
    }
}