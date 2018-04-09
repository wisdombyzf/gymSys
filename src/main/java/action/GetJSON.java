package action;

import Service.TeamService;
import net.sf.json.JSONArray;
import vo.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.List;

public class GetJSON extends BaseAction
{

    public PrintWriter ini() throws IOException
    {
        HttpServletResponse response = getResponse();
        PrintWriter out = new PrintWriter(new OutputStreamWriter(response.getOutputStream(),"utf-8"),true);
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        return out;
    }


    /**
     * 运动员列表
     * @return
     * @throws IOException
     */
    public String getAllPlayer() throws IOException
    {
        PrintWriter out=ini();
        TeamService service=new TeamService();
        List<PlayerVo> vos =service.getAllPlayerList();
        JSONArray jsonArray=new JSONArray();
        for (PlayerVo vo:vos)
        {
            jsonArray.add(vo);
        }
        out.print(jsonArray);
        out.flush();
        out.close();
        return "fail";
    }

    /**
     * 裁判员列表
     * @return
     * @throws IOException
     */
    public String getAllJudger() throws IOException
    {
        PrintWriter out=ini();
        TeamService service=new TeamService();
        List<JudgerVo> vos =service.getJudgerList();
        JSONArray jsonArray=new JSONArray();
        for (JudgerVo vo:vos)
        {
            jsonArray.add(vo);
        }
        out.print(jsonArray);
        out.flush();
        out.close();
        return "fail";
    }

    /**
     * 教练表
     * @return
     * @throws IOException
     */
    public String getAllCoach() throws IOException
    {
        PrintWriter out=ini();
        TeamService service=new TeamService();
        List<TeamCoachVo> vos =service.getCoachList();
        JSONArray jsonArray=new JSONArray();
        for (TeamCoachVo vo:vos)
        {
            jsonArray.add(vo);
        }
        out.print(jsonArray);
        out.flush();
        out.close();
        return "fail";
    }

    /**
     * 队医表
     * @return
     * @throws IOException
     */
    public String getAllMdeic() throws IOException
    {
        PrintWriter out=ini();
        TeamService service=new TeamService();
        List<TeamMdeicVo> vos =service.getMdeicList();
        JSONArray jsonArray=new JSONArray();
        for (TeamMdeicVo vo:vos)
        {
            jsonArray.add(vo);
        }
        out.print(jsonArray);
        out.flush();
        out.close();
        return "fail";
    }

}
