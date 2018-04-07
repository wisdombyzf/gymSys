package dao.impl;

import dao.TeamDao;
import po.TeamPo;

import java.util.List;

public class TeamDaoImpl extends BaseDaoImpl<TeamPo> implements TeamDao
{

    /**
     * 获取队伍表中的所有记录
     *
     * @return
     */
    public List<TeamPo> getAllTeamList()
    {
        return findByHQL("from TeamPo");
    }
}
