package po;

import javax.persistence.*;

@Entity
@Table(name = "judger", schema = "gaysys", catalog = "")
public class JudgerPo
{
    private String id;
    private String judgeAccount;
    private String password;
    private String name;
    private String phoneNum;
    private String teamName;

    @Id
    @Column(name = "ID", nullable = false, length = 255)
    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    @Basic
    @Column(name = "JudgeAccount", nullable = false, length = 255)
    public String getJudgeAccount()
    {
        return judgeAccount;
    }

    public void setJudgeAccount(String judgeAccount)
    {
        this.judgeAccount = judgeAccount;
    }

    @Basic
    @Column(name = "Password", nullable = true, length = 255)
    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @Basic
    @Column(name = "Name", nullable = true, length = 255)
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Basic
    @Column(name = "PhoneNum", nullable = true, length = 255)
    public String getPhoneNum()
    {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum)
    {
        this.phoneNum = phoneNum;
    }

    @Basic
    @Column(name = "TeamName", nullable = true, length = 255)
    public String getTeamName()
    {
        return teamName;
    }

    public void setTeamName(String teamName)
    {
        this.teamName = teamName;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JudgerPo judgerPo = (JudgerPo) o;

        if (id != null ? !id.equals(judgerPo.id) : judgerPo.id != null) return false;
        if (judgeAccount != null ? !judgeAccount.equals(judgerPo.judgeAccount) : judgerPo.judgeAccount != null)
            return false;
        if (password != null ? !password.equals(judgerPo.password) : judgerPo.password != null) return false;
        if (name != null ? !name.equals(judgerPo.name) : judgerPo.name != null) return false;
        if (phoneNum != null ? !phoneNum.equals(judgerPo.phoneNum) : judgerPo.phoneNum != null) return false;
        if (teamName != null ? !teamName.equals(judgerPo.teamName) : judgerPo.teamName != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (judgeAccount != null ? judgeAccount.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (phoneNum != null ? phoneNum.hashCode() : 0);
        result = 31 * result + (teamName != null ? teamName.hashCode() : 0);
        return result;
    }
}
