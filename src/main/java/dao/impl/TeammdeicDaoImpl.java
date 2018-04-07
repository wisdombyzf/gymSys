package dao.impl;

import dao.TeammdeicDao;
import po.TeammdeicPo;

import java.util.List;

public class TeammdeicDaoImpl extends BaseDaoImpl<TeammdeicPo> implements TeammdeicDao
{
    /**
     * 获取队医表中的所有记录
     *
     * @return
     */
    public List<TeammdeicPo> getAllMdeicList()
    {
        return findByHQL("from TeammdeicPo");
    }
}
