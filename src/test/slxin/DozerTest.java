package slxin;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    public void testNotSameAttributeMapping() {
        NotSameAttributeA src = new NotSameAttributeA();
        src.setId(152050085);// id  2个JavaBean一致
        src.setName("舒来新");// NotSameAttributeA:name(String)  <->  NotSameAttributeB:value(String)  类型一致,名称不一致
        src.setDate(new Date());//date  2个JavaBean一致

        NotSameAttributeB desc = mapper.map(src, NotSameAttributeB.class);
        //Assert.assertNotNull(desc);
        System.out.println(src);
        System.out.println(desc);
    }

}
