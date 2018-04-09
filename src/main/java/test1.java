public class test1
{


    public static void main(String[] args)
    {
        String s = "cbbd";
        Solution solution = new Solution();
        System.out.print(solution.longestPalindrome(s));
    }
}

class Solution
{
    public String longestPalindrome(String s)
    {
        //每个空位插入#,以排除对奇偶性的判断
        StringBuffer buffer = new StringBuffer();
        buffer.append('#');
        for (int i = 0; i < s.length(); i++)
        {
            buffer.append(s.charAt(i));
            buffer.append('#');
        }
        String string = new String(buffer);


        //开始计算
        int[] RL = new int[string.length() + 1];
        RL[0] = 1;

        int maxRight = 0; //所有回文子串，能达到的最右一个字符的位置
        int pos = 0;      //该回文子串对应的对称轴

        //从第二个字符开始遍历
        for (int i = 1; i < string.length(); i++)
        {
            //i在maxRight右边。。。直接扩展
            if (i > maxRight)
            {
                //由中心向两侧扩展的算法
                int left = i;
                int right = i;
                while (left >= 0 && right < string.length() && string.charAt(left) == string.charAt(right))
                {
                    left--;
                    right++;
                }
                left++;
                right--;
                //更新RL
                RL[i] = right - i + 1;
                //更新maxRight和pos
                maxRight = right;
                pos = i;
            } else  //i在左边时。。重点
            {
                //当i关于pos的对称点的RL大于pos所在串的半径时。。已maxright-i为已知半径扩展
                int posR = maxRight - pos;
                int R = RL[2 * pos - i];
                if (R > posR)
                {
                    int left = 2 * i - maxRight;
                    int right = maxRight;
                    while (left >= 0 && right < string.length() && string.charAt(left) == string.charAt(right))
                    {
                        left--;
                        right++;
                    }
                    left++;
                    right--;
                    //更新RL
                    RL[i] = right - i + 1;
                    //更新maxRight和pos
                    maxRight = right;
                    pos = i;
                } else   //小于时
                {
                    int left = i - R;
                    int right = i + R;
                    while (left >= 0 && right < string.length() && string.charAt(left) == string.charAt(right))
                    {
                        left--;
                        right++;
                    }
                    left++;
                    right--;
                    //更新RL
                    RL[i] = right - i + 1;
                    //更新maxRight和pos
                    if (right > maxRight)
                    {
                        maxRight = right;
                        pos = i;
                    }
                }

            }
        }
        //获取结果
        int num = 0;
        int p = 0;
        for (int i = 0; i < RL.length; i++)
        {
            if (RL[i] > num)
            {
                num = RL[i];
                p = i;
            }
        }
        num--;
        String result = string.substring(p - num, p + num);
        StringBuffer b = new StringBuffer();
        for (int i = 0; i < result.length(); i++)
        {
            if (result.charAt(i) != '#')
            {
                b.append(result.charAt(i));
            }
        }
        return b.toString();
    }
}