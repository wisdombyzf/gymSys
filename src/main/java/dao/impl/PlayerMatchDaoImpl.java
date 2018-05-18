package dao.impl;

import dao.PlayerMatchDao;
import org.springframework.stereotype.Repository;
import po.PlayerMatchPo;

@Repository("PlayerMatchDao")
public class PlayerMatchDaoImpl extends BaseDaoImpl<PlayerMatchPo> implements PlayerMatchDao
{

}
