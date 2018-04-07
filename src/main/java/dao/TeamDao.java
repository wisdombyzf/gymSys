package dao;

import po.PlayerPo;
import po.TeamPo;

import java.util.List;

public interface TeamDao extends BaseDao<TeamPo>
{
    /**
     * 获取队伍表中的所有记录
     * @return
     */
    List<TeamPo> getAllTeamList();
}
