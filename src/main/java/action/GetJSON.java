package action;

import Service.TeamService;
import net.sf.json.JSONArray;
import vo.JudgerVo;
import vo.PlayerVo;

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

}
