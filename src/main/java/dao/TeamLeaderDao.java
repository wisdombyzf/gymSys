package dao;

import po.TeamleaderPo;

import java.util.List;

public interface TeamLeaderDao extends BaseDao<TeamleaderPo>
{
    /**
     * 获取领队表中的所有记录
     * @return
     */
    List<TeamleaderPo> getAllLeaderList();
}
