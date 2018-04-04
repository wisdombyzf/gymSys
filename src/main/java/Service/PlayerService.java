package Service;

import dao.PlayerDao;
import factory.DaoFactory;
import po.PlayerPo;

import java.io.Serializable;


/**
 * 运动员服务类
 */
public class PlayerService
{
    private PlayerDao playerDao;

    public PlayerService()
    {
        playerDao = DaoFactory.getPlayerDao();
    }

    public boolean IsLogin(Serializable id, String password)
    {
        PlayerPo po = playerDao.findById(id);
        if (po == null)
        {
            return false;
        } else
        {

        }
        return false;
    }

}
