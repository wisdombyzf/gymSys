package Service;

import dao.GameDao;
import dao.PlayerDao;
import factory.DaoFactory;
import po.GamePo;
import po.PlayerPo;

import java.io.Serializable;
import java.util.*;


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

    /**
     * 设定所有运动员编号
     * 规则：从000到999，女运动员为双号，男运动员为单号
     * 东道主排在最后（东道主是谁？？）
     */
    public boolean setPlayerNum()
    {

        List<PlayerPo> list = playerDao.getAllPlayerList();
        int manNum = 1;
        int womanNum = 0;

        for (PlayerPo po : list)
        {
            if (po.getSex().equals("男"))
            {
                po.setPlayerId(String.format("%03d", manNum));
                manNum += 2;
            } else
            {
                po.setPlayerId(String.format("%03d", womanNum));
                womanNum += 2;
            }
            //更新
            playerDao.update(po);
        }
        return true;
    }


    /**
     * 设置比赛表
     *
     * @return
     */
    public boolean setGame()
    {
        List<PlayerPo> list = playerDao.getAllPlayerList();

        Map<String,Integer> map= new HashMap<String, Integer>();
        GameDao gameDao=DaoFactory.getGameDao();
        for (PlayerPo po : list)
        {
            String id = po.getPlayerId();
            String temp = po.getEvent();
            if (temp == null)
            {
                temp = "";
            }
            String[] s = temp.split(",");
            for (String s1 : s)
            {
                if (s1 != "")
                {
                    //TODO 以后再改
                    GamePo gamePo=new GamePo();
                    gamePo.setPlayerId(id);
                    gamePo.setGameId(s1);

                    int value=0;
                    if (map.containsKey(s1))
                    {
                        value=map.get(s1)+1;
                    }
                    //TODO 此处3应为读取的设置常量
                    gamePo.setGroups(String.valueOf(value%3));
                    map.put(s1,value);
                    gameDao.save(gamePo);
                }
            }
        }
        return true;
    }





    /**
     * 获取。。。。我去。。。忘了
     * @param gameID
     * @return
     */
    public List<GamePo> getGamelist(String gameID)
    {
        GameDao gameDao=DaoFactory.getGameDao();
        List<GamePo> result = gameDao.findByGameID(gameID);
        //System.out.println(result);
        return result;
    }

}
