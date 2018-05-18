package dao;

import po.PlayerPo;
import po.RulesPo;

import java.util.List;

public interface RulesDao extends BaseDao<RulesPo>
{

    /**
     * 获取比赛规则
     * @return
     */
    List<RulesPo> getAllRule();
}
