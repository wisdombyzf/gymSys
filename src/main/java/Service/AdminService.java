package Service;

import dao.*;
import factory.DaoFactory;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.*;
import vo.*;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * 管理员服务类
 */

@Service
public class AdminService
{

    @Autowired
    TeamDao teamDao;
    @Autowired
    AdminDao adminDao;
    @Autowired
    RulesDao rulesDao;

    public AdminService()
    {
    }


    /**
     * 能否以管理员权限登陆
     *
     * @param vo
     * @return
     */
    public boolean IsLogin(AdminVo vo)
    {
        AdminPo adminPo = adminDao.findById(vo.getId());
        if (adminPo == null || !adminPo.getPassword().equals(vo.getPassword()))
        {
            return false;
        } else
        {
            return true;
        }
    }

    /**
     * 管理员添加队伍信息
     *
     * @param vo
     * @return
     */
    public boolean AddTeam(TeamVo vo)
    {

        TeamDao teamDao=DaoFactory.getTeamDao();
        TeamPo teamPo = new TeamPo();

        teamPo.setTeamName(vo.getTeamName());
        teamPo.setTeamAccount(vo.getTeamAccount());
        teamPo.setPassword(vo.getPassword());
        teamPo.setFile(vo.getFile());

        teamDao.save(teamPo);
        return true;
    }


    /**
     * 管理员删除队伍信息
     *
     * @param vo
     * @return
     */
    public boolean DeleteTeam(TeamVo vo)
    {

        TeamDao teamDao=DaoFactory.getTeamDao();
        teamDao.delete(vo.getTeamName());
        return true;
    }


    /**
     * 管理员设定比赛规则
     * @return
     */
    public boolean setRules(RulesVo vo)
    {
        RulesDao dao=DaoFactory.getRulesDao();
        RulesPo po=new RulesPo();
        try
        {
            BeanUtils.copyProperties(po, vo);
        } catch (IllegalAccessException e)
        {
            e.printStackTrace();
        } catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }
        dao.save(po);
        return true;
    }


    /**
     * 管理员获取比赛规则
     * @return
     */
    public RulesVo getRules()
    {
        RulesDao dao=DaoFactory.getRulesDao();
        List<RulesPo> pos = dao.getAllRule();
        RulesPo po = pos.get(0);
        RulesVo vo=new RulesVo();
        try
        {
            BeanUtils.copyProperties(vo, po);
        } catch (IllegalAccessException e)
        {
            e.printStackTrace();
        } catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }
        return vo;
    }



    /**
     * 获取所有比赛
     * @return
     */
    public List<MatchVo> getAllMatchList()
    {
        MatchDao dao = DaoFactory.getMatchDao();
        List<MatchPo> pos=dao.getAllMatchList();
        List<MatchVo> vos=new ArrayList<MatchVo>();
        for (MatchPo po:pos)
        {
            try
            {
                MatchVo vo=new MatchVo();
                BeanUtils.copyProperties(vo,po);
                vos.add(vo);
            } catch (IllegalAccessException e)
            {
                e.printStackTrace();
            } catch (InvocationTargetException e)
            {
                e.printStackTrace();
            }
        }
        return vos;
    }



}
