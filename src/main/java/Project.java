import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Project")
public class Project {
    IssueList issueList;

    public IssueList getIssueList() {
        return issueList;
    }

    @XmlElement
    public void setIssueList(IssueList issueList) {
        this.issueList = issueList;
    }
}
