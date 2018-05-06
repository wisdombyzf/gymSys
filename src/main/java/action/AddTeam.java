package action;

import Service.AdminService;
import vo.TeamVo;

public class AddTeam
{
    private String TeamName;
    private String TeamAccount;
    private String Password;

    public String addTeam()
    {
        AdminService service=new AdminService();
        TeamVo vo=new TeamVo();
        vo.setTeamName(TeamName);
        vo.setTeamAccount(TeamAccount);
        vo.setPassword(Password);
        service.AddTeam(vo);
        System.out.println("队伍添加成功");
        return "success";
    }

    public void setTeamName(String teamName)
    {
        TeamName = teamName;
    }

    public void setPassword(String password)
    {
        Password = password;
    }

    public void setTeamAccount(String teamAccount)
    {
        TeamAccount = teamAccount;
    }
}
