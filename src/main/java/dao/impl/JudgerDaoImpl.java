package dao.impl;

import dao.JudgerDao;
import org.springframework.stereotype.Repository;
import po.JudgerPo;

import java.util.List;


@Repository("JudgerDao")
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
