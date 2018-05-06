package dao.impl;

import dao.PlayerDao;
import factory.DaoFactory;
import org.junit.Test;

public class PlayerDaoImplTest
{

    @Test
    public void getPlayerList()
    {
        PlayerDao dao= DaoFactory.getPlayerDao();
        //List<PlayerPo> temp = dao.findByGroup("11-12岁组");
    }
}