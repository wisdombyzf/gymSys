package dao.impl;

import dao.GameDao;
import po.GamePo;

import java.util.List;

public class GameDaoImpl extends BaseDaoImpl<GamePo> implements GameDao
{

    /**
     * 获取对应比赛的比赛表
     *
     * @param gameID
     * @return
     */
    public List<GamePo> findByGameID(String gameID)
    {
        //TODO 待改进
        return findByHQL("from GamePo where gameId like '"+gameID+"'");
    }
}
