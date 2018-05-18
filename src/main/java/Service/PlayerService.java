package Service;

import dao.GameDao;
import dao.MatchDao;
import dao.PlayerDao;
import dao.PlayerMatchDao;
import factory.DaoFactory;
import org.springframework.stereotype.Service;
import po.GamePo;
import po.MatchPo;
import po.PlayerMatchPo;
import po.PlayerPo;

import java.io.Serializable;
import java.util.*;


/**
 * 运动员服务类
 */
@Service

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
        setMatchByGroup("11-12岁组","男");
        setMatchByGroup("11-12岁组","女");

        setMatchByGroup("7-8岁组","男");
        setMatchByGroup("7-8岁组","女");

        setMatchByGroup("9-10岁组","男");
        setMatchByGroup("9-10岁组","女");

        return true;
    }

    /**
     * 给某一年龄组的某一性别的运动员设置比赛表
     *
     * @param group
     */
    public void setMatchByGroup(String group,String sex)
    {
        List<PlayerPo> list = playerDao.findByGroup(group,sex);

        Map<String,List<String>> event2id= new TreeMap<String, List<String>>();

        //将运动员表分解,存入map
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
                    List<String> listTemp = event2id.get(s1);
                    if(listTemp==null)
                    {
                        listTemp=new LinkedList<String>();
                    }
                    listTemp.add(id);
                    event2id.put(s1, listTemp);
                }
            }
        }



        Set<String> eventTemp = event2id.keySet();
        for (String event:eventTemp)
        {
            List<String> playerIds = event2id.get(event);

            //比赛id（年龄组+比赛类型event+第几组）
            String MatchId=group+event+"0";
            for (int i=0;i<playerIds.size();i++)
            {
                //TODO 此处5应为读取的teamPlayerPerGroup的值
                //当人数凑够一组时，新建一组,存入match表
                if (i%5==0)
                {
                    MatchDao matchDao=DaoFactory.getMatchDao();
                    MatchPo matchPo=new MatchPo();
                    MatchId=group+event+String.valueOf(i/5);
                    matchPo.setMatchId(MatchId);
                    matchPo.setPlayerGroup(group);
                    matchPo.setEvent(event);
                    matchPo.setSatrtTime("看天气");
                    matchPo.setEndTime("看天气");
                    matchDao.save(matchPo);
                }

                //存入playerMatch表
                PlayerMatchDao playerMatchDao=DaoFactory.getPlayerMatchDao();
                PlayerMatchPo po=new PlayerMatchPo();
                po.setPlayerGroup(group);
                po.setPlayerId(playerIds.get(i));
                po.setMatchId(MatchId);
                playerMatchDao.save(po);
            }
        }

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
