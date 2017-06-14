package annotation;

import junit.framework.TestCase;
import org.dozer.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

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
    public void testAnnotationMapping() {
        SourceBean src1 = new SourceBean();
        src1.setId(1L);//SourceBean:id(Long)  <->  TargetBean:pk(String)  类型不一致,名称不一致
        src1.setName("舒来新");// name  2个JavaBean一致
        src1.setData("00000111");//SourceBean:data(String)  <->  TargetBean:binaryBean(String)  类型一致,名称不一致

        TargetBean desc = mapper.map(src1, TargetBean.class);
        //Assert.assertNotNull(desc);
        System.out.println(src1);
        System.out.println(desc);
    }

}
