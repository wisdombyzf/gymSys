package Service;

import dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;


@Service
public class TestService
{
    @Autowired
    TestDao testDao;

    public void test()
    {
        testDao.setName("123");
    }
}
