package dao.impl;

import dao.TeamcoachDao;
import org.springframework.stereotype.Repository;
import po.TeamcoachPo;

import java.util.List;

@Repository("TeamcoachDao")
public class TeamcoachDaoImpl extends BaseDaoImpl<TeamcoachPo> implements TeamcoachDao
{
    /**
     * 获取教练表中的所有记录
     *
     * @return
     */
    public List<TeamcoachPo> getAllCoachList()
    {
        return findByHQL("from TeamcoachPo");
    }
}
