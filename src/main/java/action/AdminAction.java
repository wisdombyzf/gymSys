package action;

import Service.AdminService;
import Service.PlayerService;
import org.springframework.stereotype.Controller;
import util.SpringBeanFactory;
import vo.AdminVo;
import vo.RulesVo;
import vo.TeamVo;

@Controller
public class AdminAction extends BaseAction
{
    private String username;
    private String password;
    private String teamName;
    private String teamAccount;
    private String teampassword;
    private String file;

    private int teamPlayerPerGroup;
    private Integer playerPerMatch;
    private Integer playerCountInGroupScore;


    /**
     * 添加比赛队伍信息
     * @return
     */
    public String AddTeam()
    {
        AdminService service= new AdminService();
        TeamVo vo=new TeamVo();
        vo.setTeamAccount(teamAccount);
        vo.setPassword(teampassword);
        vo.setTeamName(teamName);
        if (service.AddTeam(vo))
        {
            return "success";
        }else
        {
            return "fail";
        }
    }



    /**
     * 删除比赛队伍信息
     * @return
     */
    public String DeleteTeam()
    {
        AdminService service= new AdminService();
        TeamVo vo=new TeamVo();
        vo.setTeamAccount(teamAccount);
        service.DeleteTeam(vo);
        return "success";
    }


    /**
     * 确认报名阶段已结束，开始生成运动员编号，编排赛事
     *
     * @return
     */
    public String endEnroll()
    {
        PlayerService playerService=new PlayerService();
        //生成运动员编号
        playerService.setPlayerNum();
        //编排赛赛
        playerService.setGame();
        return "success";
    }


    /**
     * 比赛规则设置
     * @return
     */
    public String setRules()
    {
        AdminService service=new AdminService();
        RulesVo vo=new RulesVo();
        vo.setTeamPlayerPerGroup(teamPlayerPerGroup);
        vo.setPlayerPerMatch(playerPerMatch);
        vo.setPlayerCountInGroupScore(playerCountInGroupScore);
        service.setRules(vo);
        return "success";
    }



    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setTeamName(String teamName)
    {
        this.teamName = teamName;
    }

    public void setTeamAccount(String teamAccount)
    {
        this.teamAccount = teamAccount;
    }

    public void setTeampassword(String teampassword)
    {
        this.teampassword = teampassword;
    }

    public void setFile(String file)
    {
        this.file = file;
    }

    public void setTeamPlayerPerGroup(int teamPlayerPerGroup)
    {
        this.teamPlayerPerGroup = teamPlayerPerGroup;
    }

    public void setPlayerPerMatch(Integer playerPerMatch)
    {
        this.playerPerMatch = playerPerMatch;
    }

    public void setPlayerCountInGroupScore(Integer playerCountInGroupScore)
    {
        this.playerCountInGroupScore = playerCountInGroupScore;
    }
}
