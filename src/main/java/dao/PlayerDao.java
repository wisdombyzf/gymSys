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

    /**
     * 根据队名， 取得该队的所有运动员列表
     * @param teamName 队名
     * @return
     */
    List<PlayerPo> findByTeamName(String teamName);

    /**
     * 根据年龄组， 取得该年龄段的所有运动员列表
     * @param group 年龄组
     * @return
     */
    List<PlayerPo> findByGroup(String group,String sex);

}
