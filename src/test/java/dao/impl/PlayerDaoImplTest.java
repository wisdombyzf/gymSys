package dao.impl;

import Service.PlayerService;
import dao.PlayerDao;
import factory.DaoFactory;
import org.junit.Test;
import po.PlayerPo;

import java.util.List;

public class PlayerDaoImplTest
{

    @Test
    public void getPlayerList()
    {
        PlayerService service=new PlayerService();
        service.getGamelist("SG");

    }
}