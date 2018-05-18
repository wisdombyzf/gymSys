package dao.impl;

import dao.RulesDao;
import org.springframework.stereotype.Repository;
import po.PlayerPo;
import po.RulesPo;

import java.util.List;

@Repository("RulesDao")
public class RulesDaoIpml extends BaseDaoImpl<RulesPo> implements RulesDao
{


    /**
     * 获取比赛规则
     *
     * @return
     */
    public List<RulesPo> getAllRule()
    {
        return findByHQL("from RulesPo");
    }
}
