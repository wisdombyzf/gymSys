package util;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;
import po.TeamleaderPo;
import vo.TeamleaderVo;

import java.lang.reflect.InvocationTargetException;


public class LeaderPo2VoTest
{

    @Test
    public void po2Vo()
    {
        TeamleaderVo teamleaderPo=new TeamleaderVo();
        teamleaderPo.setId("1241");
        teamleaderPo.setName("zf");
        teamleaderPo.setPhoneNum("qwere");

        TeamleaderPo vo=new TeamleaderPo();
        try
        {
            BeanUtils.copyProperties(vo,teamleaderPo);

        } catch (IllegalAccessException e)
        {
            e.printStackTrace();
        } catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }
        System.out.println(vo.getId());
    }

    @Test
    public void po2Vo1()
    {
    }
}