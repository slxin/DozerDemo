package slxdozer;

/**
 * Created by slx on 2017/6/14.
 */
public class BookVo {
    private Integer id;

    private String nameVo;

    private String authorVo;

    private Integer capacity;

    private String day;

    private BookType bookType;//复杂类型

    private String source;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameVo() {
        return nameVo;
    }

    public void setNameVo(String nameVo) {
        this.nameVo = nameVo;
    }

    public String getAuthorVo() {
        return authorVo;
    }

    public void setAuthorVo(String authorVo) {
        this.authorVo = authorVo;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "BookVo{" +
                "id=" + id +
                ", nameVo='" + nameVo + '\'' +
                ", authorVo='" + authorVo + '\'' +
                ", capacity=" + capacity +
                ", day='" + day + '\'' +
                ", bookType=" + bookType +
                ", source='" + source + '\'' +
                '}';
    }
}
