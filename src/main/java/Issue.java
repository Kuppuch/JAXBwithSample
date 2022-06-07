import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlRootElement(name = "Issue")
public class Issue {
    String name;
    String description;
    Date created_at;
    Date start_at;
    Date due_date;
    AssignedTo assigned_to;
    Author author;
    Status status;
    SrsBlock SrsBlock;
    int priority;
    int parent;
    int id;
    String text;

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    @XmlElement
    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated_at() {
        return created_at;
    }

    @XmlElement
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getStart_at() {
        return start_at;
    }

    @XmlElement
    public void setStart_at(Date start_at) {
        this.start_at = start_at;
    }

    public Date getDue_date() {
        return due_date;
    }

    @XmlElement
    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public AssignedTo getAssigned_to() {
        return assigned_to;
    }

    @XmlElement
    public void setAssigned_to(AssignedTo assigned_to) {
        this.assigned_to = assigned_to;
    }

    public Author getAuthor() {
        return author;
    }

    @XmlElement
    public void setAuthor(Author author) {
        this.author = author;
    }

    public Status getStatus() {
        return status;
    }

    @XmlElement
    public void setStatus(Status status) {
        this.status = status;
    }

    public SrsBlock getSrsBlock() {
        return SrsBlock;
    }

    @XmlElement
    public void setSrsBlock(SrsBlock srsBlock) {
        SrsBlock = srsBlock;
    }

    public int getPriority() {
        return priority;
    }

    @XmlElement
    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getParent() {
        return parent;
    }

    @XmlElement
    public void setParent(int parent) {
        this.parent = parent;
    }

    public int getId() {
        return id;
    }

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    @XmlElement
    public void setText(String text) {
        this.text = text;
    }
}


