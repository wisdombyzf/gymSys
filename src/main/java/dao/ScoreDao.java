package dao;

import po.ScorePo;
import po.TeamcoachPo;

import java.util.List;

public interface ScoreDao extends BaseDao<ScorePo>
{
    /**
     * 获取分数表中的所有记录
     * @return
     */
    List<ScorePo> getAllScoreList();

    /**
     * 取得某运动员的所有分数记录
     * @param PlayerID
     * @return
     */
    public List<ScorePo> findByPlayerID(String PlayerID);

    /**
     * 取得某场比赛的所有分数记录
     * @param gameID
     * @return
     */
    public List<ScorePo> findByGameID(String gameID);

    /**
     * 取得某运动员某项比赛的所有分数记录
     * @param gameID
     * @param playerID
     * @return
     */
    public List<ScorePo> find(String gameID,String playerID);
}
