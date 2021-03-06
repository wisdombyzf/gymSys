package action;

import Service.AdminService;
import Service.JudgeService;
import Service.TeamService;
import com.opensymphony.xwork2.ActionSupport;
import jdk.nashorn.internal.objects.NativeNumber;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import util.SpringBeanFactory;
import vo.AdminVo;
import vo.JudgerVo;
import vo.TeamVo;

import javax.servlet.http.HttpSession;
import javax.swing.*;

//TODO 密码还是明文传输

/**
 *  登陆相关
 */
@Controller
public class LoginAction extends BaseAction
{

    private String username;
    private String password;


    @Autowired
    AdminService adminService;

    @Autowired
    TeamService teamService;

    @Autowired
    JudgeService judgeService;


    /**
     * 管理员登陆
     * @return
     */
    public String loginAdamin()
    {
        AdminVo vo=new AdminVo();
        vo.setId(username);
        vo.setPassword(password);

        if (adminService.IsLogin(vo))
        {
            HttpSession session=getSession();
            session.setAttribute("admin",vo);
            System.out.println("管理员登陆成功");
            return "success";
        }else
        {
            return "error";
        }
    }

    /**
     * 普通用户登陆
     * @return
     */
    public String loginNomal()
    {
        TeamVo vo=new TeamVo();
        vo.setTeamAccount(username);
        vo.setPassword(password);

        if (teamService.IsLogin(vo))
        {
            HttpSession session=getSession();
            session.setAttribute("team",vo);
            return "success";
        }else
        {
            return "error";
        }
    }


    /**
     * 裁判员登陆
     * @return
     * @throws Exception
     */
    public String loginJudger() throws Exception
    {
        JudgerVo vo=new JudgerVo();
        vo.setJudgeAccount(username);
        vo.setPassword(password);
        if (judgeService.IsJudger(vo))
        {
            HttpSession session=getSession();
            session.setAttribute("judger",vo);
            return "success";
        }else
        {
            return "error";
        }
    }


    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }


}
