package Service;

import dao.*;
import factory.DaoFactory;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;
import po.*;
import vo.*;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService
{
    /**
     * 添加领队信息
     *
     * @param vo
     * @return
     */
    public boolean AddLeader(TeamleaderVo vo)
    {
        TeamLeaderDao dao = DaoFactory.getLeaderDao();
        TeamleaderPo po = new TeamleaderPo();
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
     * 添加教练信息
     *
     * @param vo
     * @return
     */
    public boolean AddCoach(TeamCoachVo vo)
    {
        TeamcoachDao dao = DaoFactory.getCoachDao();
        TeamcoachPo po = new TeamcoachPo();
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
     * 添加队医信息
     *
     * @param vo
     * @return
     */
    public boolean AddMdeic(TeamMdeicVo vo)
    {
        TeammdeicDao dao = DaoFactory.getDeicDao();
        TeammdeicPo po = new TeammdeicPo();
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
     * 添加运动员信息
     *
     * @param vo
     * @return
     */
    public boolean AddPlayer(PlayerVo vo)
    {
        PlayerDao dao = DaoFactory.getPlayerDao();
        PlayerPo po = new PlayerPo();
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
     * 添加裁判信息
     *
     * @param vo
     * @return
     */
    public boolean AddJudger(JudgerVo vo)
    {
        JudgerDao dao = DaoFactory.getJudgerDao();
        JudgerPo po = new JudgerPo();
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
     * 返回运动员列表
     * @return
     */
    public List<PlayerVo> getAllPlayerList()
    {
        PlayerDao dao = DaoFactory.getPlayerDao();
        List<PlayerPo> pos=dao.getAllPlayerList();
        List<PlayerVo> vos=new ArrayList<PlayerVo>();
        for (PlayerPo po:pos)
        {
            try
            {
                PlayerVo vo=new PlayerVo();
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

    /**
     * 获取裁判员表
     * @return
     */
    public List<JudgerVo> getJudgerList()
    {
        JudgerDao dao = DaoFactory.getJudgerDao();
        List<JudgerPo> pos=dao.getAllJudgeList();
        List<JudgerVo> vos=new ArrayList<JudgerVo>();
        for (JudgerPo po:pos)
        {
            try
            {
                JudgerVo vo=new JudgerVo();
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

    /**
     * 获取领队列表
     * @return
     */
    public List<TeamleaderVo> getTeamLeaderList()
    {
        TeamLeaderDao  dao = DaoFactory.getLeaderDao();
        List<TeamleaderPo> pos=dao.getAllLeaderList();
        List<TeamleaderVo> vos=new ArrayList<TeamleaderVo>();
        for (TeamleaderPo po:pos)
        {
            try
            {
                TeamleaderVo vo=new TeamleaderVo();
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

    /**
     * 获取教练列表
     * @return
     */
    public List<TeamCoachVo> getCoachList()
    {
        TeamcoachDao  dao = DaoFactory.getCoachDao();
        List<TeamcoachPo> pos=dao.getAllCoachList();
        List<TeamCoachVo> vos=new ArrayList<TeamCoachVo>();
        for (TeamcoachPo po:pos)
        {
            try
            {
                TeamCoachVo vo=new TeamCoachVo();
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

    /**
     * 获取所有队伍
     * @return
     */
    public List<TeamVo> getTeamList()
    {
        TeamDao  dao = DaoFactory.getTeamDao();
        List<TeamPo> pos=dao.getAllTeamList();
        List<TeamVo> vos=new ArrayList<TeamVo>();
        for (TeamPo po:pos)
        {
            try
            {
                TeamVo vo=new TeamVo();
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



    /**
     * 获取所有队医
     * @return
     */
    public List<TeamMdeicVo> getMdeicList()
    {
        TeammdeicDao  dao = DaoFactory.getDeicDao();
        List<TeammdeicPo> pos=dao.getAllMdeicList();
        List<TeamMdeicVo> vos=new ArrayList<TeamMdeicVo>();
        for (TeammdeicPo po:pos)
        {
            try
            {
                TeamMdeicVo vo=new TeamMdeicVo();
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


    /**
     * 取得某队的所有运动员
     * @param teamName
     * @return
     */
    public List<PlayerVo> getPlayerByTeam (String teamName)
    {
        PlayerDao dao=DaoFactory.getPlayerDao();
        List<PlayerPo> pos = dao.findByTeamName(teamName);
        List<PlayerVo> vos=new ArrayList<PlayerVo>();
        for (PlayerPo po:pos)
        {
            try
            {
                PlayerVo vo=new PlayerVo();
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



    /**
     * 计算团体总成绩
     * @return
     */
    public boolean getTeamScore(String teamName)
    {
        List<PlayerVo> vos = getPlayerByTeam(teamName);
        double result=0;
        for (PlayerVo vo:vos)
        {
            result+=vo.getScore();
        }
        System.out.println("总成绩是:"+result);

        //team中添加总成绩
        TeamDao teamDao=DaoFactory.getTeamDao();
        TeamPo teamPo=teamDao.findById(teamName);
        teamPo.setScore(result);
        teamDao.update(teamPo);
        return true;
    }


    /**
     * 能否登陆
     *
     * @param vo
     * @return
     */
    public boolean IsLogin(TeamVo vo)
    {
        TeamDao teamDao= DaoFactory.getTeamDao();
        TeamPo teamPo = teamDao.findById(vo.getTeamAccount());
        if (teamPo == null || !teamPo.getPassword().equals(vo.getPassword()))
        {
            return false;
        } else
        {
            return true;
        }
    }


}
