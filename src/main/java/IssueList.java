import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "IssueList")
public class IssueList {
    List<Issue> issues;

    public List<Issue> getIssues() {
        return issues;
    }

    @XmlElement
    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }
}
