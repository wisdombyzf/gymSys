package dao;

import po.TeammdeicPo;

import java.util.List;

public interface TeammdeicDao extends BaseDao<TeammdeicPo>
{
    /**
     * 获取队医表中的所有记录
     * @return
     */
    List<TeammdeicPo> getAllMdeicList();
}
