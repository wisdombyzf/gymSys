package dao;

import po.JudgerPo;

import java.util.List;

public interface JudgerDao extends BaseDao <JudgerPo>
{
    /**
     * 获取裁判表中的所有记录
     * @return
     */
    List<JudgerPo> getAllJudgeList();
}
