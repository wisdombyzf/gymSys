package action;

import Service.TeamService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vo.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

//TODO 感觉是不是和前端耦合太紧....

/**
 * 队伍成员信息登记action
 */

public class EnrollAction extends BaseAction
{
    @Autowired
    TeamService service;

    @Override
    public String execute() throws Exception
    {
        TeamService service=new TeamService();
        HttpServletRequest request = getRequest();
        Map<String,String[]> map=request.getParameterMap();

        //添加领队
        TeamleaderVo teamleaderVo=new TeamleaderVo();
        teamleaderVo.setName(map.get("leaderName")[0]);
        teamleaderVo.setId(map.get("leaderID")[0]);
        teamleaderVo.setPhoneNum(map.get("leaderTel")[0]);
        service.AddLeader(teamleaderVo);
        //TODO 队伍信息通过session获取

        //添加队医
        TeamMdeicVo teamMdeicVo=new TeamMdeicVo();
        teamMdeicVo.setId(map.get("DocID")[0]);
        teamMdeicVo.setName(map.get("DocName")[0]);
        teamMdeicVo.setPhoneNum(map.get("DocTel")[0]);
        service.AddMdeic(teamMdeicVo);


        //添加运动员
        final String name="playerName";
        final String id="playerID";
        final String age="playerAge";
        final String sex="sex";
        final String choose="checkbox";
        final String group="playerGroup";


        for (int i=1;map.containsKey(name+i);i++)
        {
            PlayerVo playerVo=new PlayerVo();
            playerVo.setPlayerId(map.get(id+i)[0]);
            playerVo.setName(map.get(name+i)[0]);
            playerVo.setIdCard(map.get(id+i)[0]);
            playerVo.setAge(Integer.valueOf(map.get(age+i)[0]));
            playerVo.setSex(map.get(sex+i+"Option")[0]);
            //根据年龄计算出年龄组比较好
            int tempAge=Integer.valueOf(map.get(age+i)[0]);
            if (tempAge<=8)
            {
                playerVo.setGroup("7-8岁组");
            }else if (tempAge<=10)
            {
                playerVo.setGroup("9-10岁组");
            }else
            {
                playerVo.setGroup("11-12岁组");
            }

            //添加该运动员对应比赛项目。。。利用json储存
            String []temp=map.get(choose+i+"Option");
            JSONObject jsonObject=new JSONObject();
            for (String s:temp)
            {
                jsonObject.put(s,"");
            }
            playerVo.setEvent(jsonObject.toString());
            service.AddPlayer(playerVo);
        }

        //添加教练
        final String Cname="couchName";
        final String Cid="couchID";
        final String Csex="couchSex";
        final String Ctel="couchTel";
        for (int i=1;map.containsKey(Cname+i);i++)
        {
            TeamCoachVo teamCoachVo=new TeamCoachVo();
            teamCoachVo.setId(map.get(Cid+i)[0]);
            teamCoachVo.setName(map.get(Cname+i)[0]);
            teamCoachVo.setPhoneNum(map.get(Ctel+i)[0]);
            //TODO 暂时不设置性别
            service.AddCoach(teamCoachVo);
        }

        //添加裁判员
        final String Jname="judgeName";
        final String Jid="judgeID";
        final String Jtel="judgeTel";
        for (int i=1;map.containsKey(Cname+i);i++)
        {
            JudgerVo judgerVo=new JudgerVo();
            judgerVo.setId(map.get(Jid+i)[0]);
            judgerVo.setJudgeAccount(map.get(Jid+i)[0]);
            judgerVo.setName(map.get(Jname+i)[0]);
            judgerVo.setPhoneNum(map.get(Jtel+i)[0]);
            service.AddJudger(judgerVo);
        }
        return "success";
    }
}
