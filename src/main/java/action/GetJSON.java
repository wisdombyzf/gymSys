package action;

import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GetJSON extends BaseAction
{

    public String getAllPlayer() throws IOException
    {
        PrintWriter  out= ServletActionContext.getResponse().getWriter();

        HttpServletResponse response=getResponse();
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        out.print("[\n" +
                "    {\n" +
                "        \"PlayerID\":12,\n" +
                "        \"ID\":12345,\n" +
                "        \"Name\":\"运动员甲\",\n" +
                "        \"Age\":13,\n" +
                "        \"Group\":\"13岁组\",\n" +
                "        \"CultureScore\":99,\n" +
                "        \"TeamName\":\"队伍甲\"\n" +
                "    },{\n" +
                "        \"PlayerID\":13,\n" +
                "        \"ID\":12345,\n" +
                "        \"Name\":\"运动员甲\",\n" +
                "        \"Age\":13,\n" +
                "        \"Group\":\"13岁组\",\n" +
                "        \"CultureScore\":99,\n" +
                "        \"TeamName\":\"队伍甲\"\n" +
                "    },{\n" +
                "        \"PlayerID\":14,\n" +
                "        \"ID\":12345,\n" +
                "        \"Name\":\"运动员甲\",\n" +
                "        \"Age\":13,\n" +
                "        \"Group\":\"13岁组\",\n" +
                "        \"CultureScore\":99,\n" +
                "        \"TeamName\":\"队伍甲\"\n" +
                "    },{\n" +
                "        \"PlayerID\":15,\n" +
                "        \"ID\":12345,\n" +
                "        \"Name\":\"运动员甲\",\n" +
                "        \"Age\":13,\n" +
                "        \"Group\":\"13岁组\",\n" +
                "        \"CultureScore\":99,\n" +
                "        \"TeamName\":\"队伍甲\"\n" +
                "    },{\n" +
                "        \"PlayerID\":16,\n" +
                "        \"ID\":12345,\n" +
                "        \"Name\":\"运动员甲\",\n" +
                "        \"Age\":13,\n" +
                "        \"Group\":\"13岁组\",\n" +
                "        \"CultureScore\":99,\n" +
                "        \"TeamName\":\"队伍甲\"\n" +
                "    },{\n" +
                "        \"PlayerID\":17,\n" +
                "        \"ID\":12345,\n" +
                "        \"Name\":\"运动员甲\",\n" +
                "        \"Age\":13,\n" +
                "        \"Group\":\"13岁组\",\n" +
                "        \"CultureScore\":99,\n" +
                "        \"TeamName\":\"队伍甲\"\n" +
                "    },{\n" +
                "        \"PlayerID\":18,\n" +
                "        \"ID\":12345,\n" +
                "        \"Name\":\"运动员甲\",\n" +
                "        \"Age\":13,\n" +
                "        \"Group\":\"13岁组\",\n" +
                "        \"CultureScore\":99,\n" +
                "        \"TeamName\":\"队伍甲\"\n" +
                "    },{\n" +
                "        \"PlayerID\":19,\n" +
                "        \"ID\":12345,\n" +
                "        \"Name\":\"运动员甲\",\n" +
                "        \"Age\":13,\n" +
                "        \"Group\":\"13岁组\",\n" +
                "        \"CultureScore\":99,\n" +
                "        \"TeamName\":\"队伍甲\"\n" +
                "    },{\n" +
                "        \"PlayerID\":20,\n" +
                "        \"ID\":12345,\n" +
                "        \"Name\":\"运动员甲\",\n" +
                "        \"Age\":13,\n" +
                "        \"Group\":\"13岁组\",\n" +
                "        \"CultureScore\":99,\n" +
                "        \"TeamName\":\"队伍甲\"\n" +
                "    },{\n" +
                "        \"PlayerID\":21,\n" +
                "        \"ID\":12345,\n" +
                "        \"Name\":\"运动员甲\",\n" +
                "        \"Age\":13,\n" +
                "        \"Group\":\"13岁组\",\n" +
                "        \"CultureScore\":99,\n" +
                "        \"TeamName\":\"队伍甲\"\n" +
                "    },{\n" +
                "        \"PlayerID\":22,\n" +
                "        \"ID\":12345,\n" +
                "        \"Name\":\"运动员甲\",\n" +
                "        \"Age\":13,\n" +
                "        \"Group\":\"13岁组\",\n" +
                "        \"CultureScore\":99,\n" +
                "        \"TeamName\":\"队伍甲\"\n" +
                "    },{\n" +
                "        \"PlayerID\":23,\n" +
                "        \"ID\":12345,\n" +
                "        \"Name\":\"运动员甲\",\n" +
                "        \"Age\":13,\n" +
                "        \"Group\":\"13岁组\",\n" +
                "        \"CultureScore\":99,\n" +
                "        \"TeamName\":\"队伍甲\"\n" +
                "    },{\n" +
                "        \"PlayerID\":24,\n" +
                "        \"ID\":12345,\n" +
                "        \"Name\":\"运动员甲\",\n" +
                "        \"Age\":13,\n" +
                "        \"Group\":\"13岁组\",\n" +
                "        \"CultureScore\":99,\n" +
                "        \"TeamName\":\"队伍甲\"\n" +
                "    }\n" +
                "]");
        out.flush();
        out.close();
        return "fail";
    }
}
