package dao.impl;

import dao.ScoreDao;
import po.GamePo;
import po.ScorePo;
import po.TeamcoachPo;

import java.util.List;

public class ScoreDaoImpl extends BaseDaoImpl<ScorePo> implements ScoreDao
{
    /**
     * 获取分数表中的所有记录
     *
     * @return
     */
    public List<ScorePo> getAllScoreList()
    {
        return findByHQL("from ScorePo");
    }

    /**
     *取得某运动员的所有分数记录
     * @param gameID
     * @return
     */
    public List<ScorePo> findByGameID(String gameID)
    {
        //TODO 待改进
        return findByHQL("from GamePo where gameId like '"+gameID+"'");
    }

    /**
     * 取得某运动员某项比赛的所有分数记录
     *
     * @param gameID
     * @param playerID
     * @return
     */
    public List<ScorePo> find(String gameID, String playerID)
    {
        return findByHQL("from GamePo where gameId like '"+gameID+"'"
        +" AND playerId like '"+playerID+"'");
    }
}
