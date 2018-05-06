package dao.impl;

import dao.TeamDao;
import org.springframework.stereotype.Repository;
import po.TeamPo;

import java.util.List;

@Repository("TeamDao")
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
