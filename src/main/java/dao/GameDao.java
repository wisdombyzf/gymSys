package dao;

import po.GamePo;

import java.util.List;

public interface GameDao extends BaseDao<GamePo>
{
    /**
     * 获取对应比赛的比赛表
     * @param gameID
     * @return
     */
    List<GamePo> findByGameID(String gameID);
}
