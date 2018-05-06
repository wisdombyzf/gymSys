package dao.impl;

import Service.PlayerService;
import org.junit.Test;

public class PlayerDaoImplTest
{

    @Test
    public void getPlayerList()
    {
        PlayerService service=new PlayerService();
        service.getGamelist("SG");

    }
}