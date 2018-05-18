package dao.impl;

import dao.TeamLeaderDao;
import org.springframework.stereotype.Repository;
import po.TeamleaderPo;

import java.util.List;

@Repository("TeamLeaderDao")
public class TeamLeaderDaoImpl extends BaseDaoImpl<TeamleaderPo> implements TeamLeaderDao
{
    /**
     * 获取领队表中的所有记录
     *
     * @return
     */
    public List<TeamleaderPo> getAllLeaderList()
    {
        return findByHQL("from TeamleaderPo");
    }
}
