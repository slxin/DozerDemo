package annotation;

import org.dozer.Mapping;

/**
 * Created by slx on 2017/6/14.
 */
public class SourceBean {
    @Mapping("pk")
    private Long id;

    private String name;

    private String data;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Mapping("binaryData")
    public String getData() {
        return this.data;
    }


    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "SourceBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
