package dao;

import po.JudgerPo;
import po.MatchPo;

import java.util.List;

/**
 * 比赛表dao
 */
public interface MatchDao extends BaseDao<MatchPo>
{
    /**
     * 获取裁判表中的所有记录
     * @return
     */
    List<MatchPo> getAllMatchList();
}
