package Service;

import org.junit.Test;
import vo.TeamleaderVo;

import static org.junit.Assert.*;

public class TeamServiceTest
{

    @Test
    public void addLeader()
    {
        TeamService service=new TeamService();
        TeamleaderVo vo=new TeamleaderVo();
        vo.setId("111");
        vo.setName("哈哈哈");
        vo.setPhoneNum("1234665");
        vo.setTeamName("勇士队");
        service.AddLeader(vo);

    }

    @Test
    public void addCoach()
    {
    }

    @Test
    public void addMdeic()
    {
    }

    @Test
    public void getJudgerList()
    {
    }

    @Test
    public void getCoachList()
    {
    }

    @Test
    public void getMdeicList()
    {
    }

    @Test
    public void getPlayerByTeam()
    {
    }

    @Test
    public void getTeamScore()
    {
        TeamService service=new TeamService();
        service.getTeamScore("1");
    }
}