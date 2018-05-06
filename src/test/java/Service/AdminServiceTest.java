package Service;

import org.junit.Test;
import vo.RulesVo;

import static org.junit.Assert.*;

public class AdminServiceTest
{

    @Test
    public void setRules()
    {
        AdminService service=new AdminService();
        RulesVo vo=new RulesVo();
        vo.setPlayerCountInGroupScore(1);
        vo.setPlayerPerMatch(2);
        vo.setTeamPlayerPerGroup(3);
        service.setRules(vo);
    }
}