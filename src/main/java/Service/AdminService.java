package Service;

import dao.AdminDao;
import dao.RulesDao;
import dao.TeamDao;
import factory.DaoFactory;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.AdminPo;
import po.RulesPo;
import po.TeamPo;
import vo.AdminVo;
import vo.RulesVo;
import vo.TeamVo;

import java.lang.reflect.InvocationTargetException;

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
        AdminDao adminDao= DaoFactory.getAdminDao();
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

        //TODO po转vo待定   暂时直接暴力
        teamPo.setTeamName(vo.getTeamName());
        teamPo.setTeamAccount(vo.getTeamAccount());
        teamPo.setPassword(vo.getPassword());
        teamPo.setFile(vo.getFile());

        teamDao.save(teamPo);
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



}
