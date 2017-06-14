package slxin;

import java.util.Date;

/**
 * Created by slx on 2017/6/14.
 */
public class NotSameAttributeB {
    private long id;
    private String value;
    private Date date;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "NotSameAttributeB{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", date=" + date +
                '}';
    }
}
