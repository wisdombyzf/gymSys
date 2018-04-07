


import test.*;

import java.util.HashMap;
import java.util.Map;


public class test
{
    public static void main(String[] args)
    {
        Map<String,String[]> map=new HashMap<String, String[]>();
        map.put("123", new String[]{"222","dfdfs"});
        map.put("124", new String[]{"22"});
        map.put("126", new String[]{"22"});
        map.put("127", new String[]{"324222"});
        map.put("128", new String[]{"22322"});
        map.put("1232", new String[]{"223422"});

        System.out.println(map.get("123")[1]);
    }
}


