package dao.impl;

import dao.PlayerDao;
import po.PlayerPo;

import java.util.List;


public class PlayerDaoImpl extends BaseDaoImpl<PlayerPo> implements PlayerDao
{


     /**
      * 获取运动员表中的所有运动员记录
      *
      * @return
      */
     public List<PlayerPo> getAllPlayerList()
     {
          return findByHQL("from PlayerPo");
     }



}
