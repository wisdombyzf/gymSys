package Service;

import dao.*;
import factory.DaoFactory;
import org.apache.commons.beanutils.BeanUtils;
import po.*;
import vo.*;

import java.lang.reflect.InvocationTargetException;

public class TeamService
{
    /**
     * 添加领队信息
     * @param vo
     * @return
     */
    public boolean AddLeader(TeamleaderVo vo)
    {
        TeamLeaderDao dao = DaoFactory.getLeaderDao();
        TeamleaderPo po = new TeamleaderPo();
        try
        {
            BeanUtils.copyProperties(po,vo);
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
     * 添加教练信息
     * @param vo
     * @return
     */
    public boolean AddCoach(TeamCoachVo vo)
    {
        TeamcoachDao dao=DaoFactory.getCoachDao();
        TeamcoachPo po=new TeamcoachPo();
        try
        {
            BeanUtils.copyProperties(po,vo);
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
     * 添加队医信息
     * @param vo
     * @return
     */
    public boolean AddMdeic(TeamMdeicVo vo)
    {
        TeammdeicDao dao=DaoFactory.getDeicDao();
        TeammdeicPo po=new TeammdeicPo();
        try
        {
            BeanUtils.copyProperties(po,vo);
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
     * 添加运动员信息
     * @param vo
     * @return
     */
    public boolean AddPlayer(PlayerVo vo)
    {
        PlayerDao dao=DaoFactory.getPlayerDao();
        PlayerPo po=new PlayerPo();
        try
        {
            BeanUtils.copyProperties(po,vo);
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
     * 添加裁判信息
     * @param vo
     * @return
     */
    public boolean AddJudger(JudgerVo vo)
    {
        JudgerDao dao=DaoFactory.getJudgerDao();
        JudgerPo po=new JudgerPo();
        try
        {
            BeanUtils.copyProperties(po,vo);
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
