package po;

import javax.persistence.*;

@Entity
@Table(name = "teammdeic", schema = "gaysys", catalog = "")
public class TeammdeicPo
{
    private String id;
    private String name;
    private String phoneNum;

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
    @Column(name = "PhoneNum", nullable = true, length = 20)
    public String getPhoneNum()
    {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum)
    {
        this.phoneNum = phoneNum;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeammdeicPo po = (TeammdeicPo) o;

        if (id != null ? !id.equals(po.id) : po.id != null) return false;
        if (name != null ? !name.equals(po.name) : po.name != null) return false;
        if (phoneNum != null ? !phoneNum.equals(po.phoneNum) : po.phoneNum != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (phoneNum != null ? phoneNum.hashCode() : 0);
        return result;
    }
}
