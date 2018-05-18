package dao.impl;

import dao.MatchJudgerDao;
import org.springframework.stereotype.Repository;
import po.MatchjudgePo;

@Repository("MatchJudgerDao")
public class MatchJudgerDaoImpl extends BaseDaoImpl<MatchjudgePo> implements MatchJudgerDao
{
}
