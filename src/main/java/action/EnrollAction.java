package action;

import Service.TeamService;
import vo.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

//TODO 感觉是不是和前端耦合太紧....
public class EnrollAction extends BaseAction
{
    @Override
    public String execute() throws Exception
    {
        HttpServletRequest request = getRequest();
        Map<String,String[]> map=request.getParameterMap();
        TeamService service=new TeamService();

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

        /**
         * 运动员编号设定规则
         * 系统自动为每个运动员生成运动员号码
         * 从000到999
         * 女运动员为双号，男运动员为单号
         * 东道主排在最后。。。
         * 包报名完毕后在统一设定
         */
        //添加运动员
        final String name="playerName";
        final String id="playerID";
        final String age="playerAge";
        final String sex="sex";
        final String choose="checkbox";
        //TODO 组别设置待定...同时暂时将playerid设为身份证号

        for (int i=1;map.containsKey(name+i);i++)
        {
            PlayerVo playerVo=new PlayerVo();
            playerVo.setPlayerId(map.get(id+i)[0]);
            playerVo.setName(map.get(name+i)[0]);
            playerVo.setIdCard(map.get(id+i)[0]);
            playerVo.setAge(Integer.valueOf(map.get(age+i)[0]));
            playerVo.setSex(map.get(sex+i+"Option")[0]);

            //添加该运动员对应比赛项目
            String []temp=map.get(choose+i+"Option");
            StringBuffer stringBuffer=new StringBuffer();
            for (String s:temp)
            {
                stringBuffer.append(s+',');
            }
            playerVo.setEvent(stringBuffer.toString());

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
        return "fail";
    }
}
