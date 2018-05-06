package action;

import Service.TeamService;
import vo.PlayerVo;
import vo.TeamVo;
import vo.TeamleaderVo;

import javax.servlet.http.HttpServletRequest;

//TODO 前端通过表单传回数据。。。待改进
public class TeamAction extends BaseAction
{


    public String AddPlayer()
    {
        TeamService service= new TeamService();
        PlayerVo vo=new PlayerVo();
        HttpServletRequest request=getRequest();
        vo.setPlayerId(request.getParameter("PlayerID"));
        vo.setIdCard(request.getParameter("ID"));
        vo.setAge(Integer.valueOf(request.getParameter("Name")));
        vo.setName(request.getParameter("Age"));
        vo.setTeamName(request.getParameter("TeamName"));
        if (service.AddPlayer(vo))
        {
            return "success";
        }else
        {
            return "fail";
        }
    }

    /**
     * 添加领队
     * @return
     */
    public String AddTeamLeader()
    {
        TeamService service= new TeamService();
        TeamleaderVo vo=new TeamleaderVo();
        HttpServletRequest request=getRequest();
        vo.setPhoneNum(request.getParameter("PlayerID"));
        vo.setName(request.getParameter("Age"));
        vo.setTeamName(request.getParameter("TeamName"));
        if (service.AddLeader(vo))
        {
            return "success";
        }else
        {
            return "fail";
        }
    }


}
