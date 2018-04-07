package dao.impl;

import dao.JudgerDao;
import po.JudgerPo;

import java.util.List;

public class JudgerDaoImpl extends BaseDaoImpl<JudgerPo> implements JudgerDao
{

    /**
     * 获取裁判表中的所有记录
     *
     * @return
     */
    public List<JudgerPo> getAllJudgeList()
    {
        return findByHQL("from JudgerPo");
    }
}
