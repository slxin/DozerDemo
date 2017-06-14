package slxdozer;

import junit.framework.TestCase;
import org.dozer.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import slxin.NotSameAttributeA;
import slxin.NotSameAttributeB;

import java.util.Date;

/**
 * Created by slx on 2017/6/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:Spring/spring-dozer.xml"})
@TransactionConfiguration(defaultRollback = false)
public class DozerTest extends TestCase {
    @Autowired
    Mapper mapper;

    @Test
    public void testMapping() {
        Book book = new Book();
        book.setId(100); // id  2个JavaBean一致
        book.setName("明天"); // Book:name(String)  <->  BookVo:nameVo(String)  类型一致,名称不一致
        book.setAuthor("James"); // Book:author(String)  <->  BookVo:authorVo(String) 类型一致,名称不一致
        book.setCapacity("123"); // Book:capacity(String)  <->  BookVo:capacity(Integer)  类型不一致,名称一致
        book.setBirthday(new Date()); // Book:birthday(Date)  <->  BookVo:day(String) 类型名称都不一致,且Date<->String互转
        book.setBookTypeName("科教类"); // Book:bookTypeName(String)  <->  BookVo:BookType:name(String)  源类的字段映射为目标类的复杂对象的字段。
        book.setSource(1900); // Book:source(Integer)  <->  BookVo:source(String) 自定义的转换,需要实现dozer的CustomConverter接口

        BookVo vo = new BookVo();
        mapper.map(book, vo);

        System.out.println(book);
        System.out.println(vo);
    }

}
