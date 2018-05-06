package dao;

import po.TeamcoachPo;

import java.util.List;

public interface TeamcoachDao extends BaseDao<TeamcoachPo>
{
    /**
     * 获取教练表中的所有记录
     * @return
     */
    List<TeamcoachPo> getAllCoachList();
}

