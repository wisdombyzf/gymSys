package action;

import Service.AdminService;
import Service.PlayerService;
import vo.AdminVo;
import vo.TeamVo;

public class AdminAction extends BaseAction
{
    private String username;
    private String password;
    private String teamName;
    private String teamAccount;
    private String teampassword;
    private String file;


    /**
     * 登陆
     * @return
     */
    public String login()
    {
        AdminService service= new AdminService();
        AdminVo vo=new AdminVo();
        vo.setId(username);
        vo.setPassword(password);
        if (service.IsLogin(vo))
        {
            return "success";
        }else
        {
            return "fail";
        }
    }

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
}
