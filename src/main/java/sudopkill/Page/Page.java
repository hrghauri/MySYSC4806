package sudopkill.Page;
import javax.persistence.*;


@Entity
public class Page {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;

    protected Page(){}

    public Page(String title, String content){
        this.title = title;
        this.content = content;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String toString(){
        return "ID " +id+ "Title " + title + "Content: " + content;
    }









}
