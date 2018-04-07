package dao.impl;

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
        PlayerDao dao= DaoFactory.getPlayerDao();
        List<PlayerPo> pos=dao.getAllPlayerList();
        System.out.println(pos);
    }
}