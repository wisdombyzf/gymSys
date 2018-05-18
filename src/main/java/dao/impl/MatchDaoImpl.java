package dao.impl;

import dao.MatchDao;
import po.MatchPo;

import java.util.List;

public class MatchDaoImpl extends BaseDaoImpl<MatchPo> implements MatchDao
{
    /**
     * 获取比赛表中的所有记录
     *
     * @return
     */
    public List<MatchPo> getAllMatchList()
    {
        return findByHQL("from MatchPo");
    }
}
