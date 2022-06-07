import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlRootElement(name = "srsBlock")
public class SrsBlock {
    Title Title;
    Content Content;

    public Title getTitle() {
        return Title;
    }

    @XmlElement
    public void setTitle(Title title) {
        Title = title;
    }

    public Content getContent() {
        return Content;
    }

    @XmlElement
    public void setContent(Content content) {
        Content = content;
    }
}