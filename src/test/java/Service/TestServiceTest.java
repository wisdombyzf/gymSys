package Service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class TestServiceTest
{

    @Test
    public void test1()
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
        TestService testService=context.getBean(TestService.class);
        testService.test();
    }
}