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

     /**
      * 取得该队的所有运动员列表
      *
      * @param teamName 队名
      * @return
      */
     public List<PlayerPo> findByTeamName(String teamName)
     {
          return findByHQL("from PlayerPo where teamName like '"+teamName+"'");
     }

     /**
      * 根据年龄组， 取得该年龄段的所有运动员列表
      *
      * @param group 年龄组
      * @return
      */
     public List<PlayerPo> findByGroup(String group,String sex)
     {
          return findByHQL("from PlayerPo where playerGroup like '"+group+"' and sex like '"+sex+"'");
     }


}
