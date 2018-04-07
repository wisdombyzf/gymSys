package factory;

import dao.PlayerDao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import po.PlayerPo;

public class DaoFactoryTest
{

    @Before
    public void setUp() throws Exception
    {
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void getPlayerDao()
    {
        PlayerDao playerDao= DaoFactory.getPlayerDao();
        PlayerPo playerPo=new PlayerPo();
        playerPo.setPlayerId("1331422");
        playerPo.setName("小明");
        playerPo.setAge(77);
        playerPo.setIdCard("44443242");
        playerDao.save(playerPo);
    }
}