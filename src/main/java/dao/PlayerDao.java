package dao;

import po.PlayerPo;

import java.util.List;


public interface PlayerDao extends BaseDao<PlayerPo>
{
    /**
     * 获取运动员表中的所有运动员记录
     * @return
     */
    List<PlayerPo> getAllPlayerList();

}
