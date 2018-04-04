package action;

import com.opensymphony.xwork2.ActionSupport;

//TODO 密码还是明文传输
/**
 *  管理员登陆
 */
public class LoginAction extends BaseAction
{

    private String username;
    private String password;


    @Override
    public String execute() throws Exception
    {
        return "fail";
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
