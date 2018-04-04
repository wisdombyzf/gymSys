package po;

import javax.persistence.*;

@Entity
@Table(name = "teammdeic", schema = "gaysys", catalog = "")
public class TeammdeicPo
{
    private String id;
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
    @Column(name = "Name", nullable = false, length = 255)
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Basic
    @Column(name = "PhoneNum", nullable = false, length = 20)
    public String getPhoneNum()
    {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum)
    {
        this.phoneNum = phoneNum;
    }

    @Basic
    @Column(name = "TeamName", nullable = false, length = 255)
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

        TeammdeicPo that = (TeammdeicPo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (phoneNum != null ? !phoneNum.equals(that.phoneNum) : that.phoneNum != null) return false;
        if (teamName != null ? !teamName.equals(that.teamName) : that.teamName != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (phoneNum != null ? phoneNum.hashCode() : 0);
        result = 31 * result + (teamName != null ? teamName.hashCode() : 0);
        return result;
    }
}
