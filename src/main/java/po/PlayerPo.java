package po;

import javax.persistence.*;

@Entity
@Table(name = "player", schema = "gaysys", catalog = "")
public class PlayerPo
{
    private String playerId;
    private Integer age;
    private String event;
    private String idCard;
    private String name;
    private String teamName;
    private String sex;
    private Double score;

    @Basic
    @Column(name = "player_id", nullable = false, length = 20)
    public String getPlayerId()
    {
        return playerId;
    }

    public void setPlayerId(String playerId)
    {
        this.playerId = playerId;
    }

    @Basic
    @Column(name = "age", nullable = true)
    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    @Basic
    @Column(name = "event", nullable = true, length = 255)
    public String getEvent()
    {
        return event;
    }

    public void setEvent(String event)
    {
        this.event = event;
    }

    @Id
    @Column(name = "id_card", nullable = false, length = 255)
    public String getIdCard()
    {
        return idCard;
    }

    public void setIdCard(String idCard)
    {
        this.idCard = idCard;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 255)
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Basic
    @Column(name = "team_name", nullable = true, length = 255)
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

        PlayerPo playerPo = (PlayerPo) o;

        if (playerId != null ? !playerId.equals(playerPo.playerId) : playerPo.playerId != null) return false;
        if (age != null ? !age.equals(playerPo.age) : playerPo.age != null) return false;
        if (event != null ? !event.equals(playerPo.event) : playerPo.event != null) return false;
        if (idCard != null ? !idCard.equals(playerPo.idCard) : playerPo.idCard != null) return false;
        if (name != null ? !name.equals(playerPo.name) : playerPo.name != null) return false;
        if (teamName != null ? !teamName.equals(playerPo.teamName) : playerPo.teamName != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = playerId != null ? playerId.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (event != null ? event.hashCode() : 0);
        result = 31 * result + (idCard != null ? idCard.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (teamName != null ? teamName.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "sex", nullable = true, length = 255)
    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    @Basic
    @Column(name = "score", nullable = true, precision = 0)
    public Double getScore()
    {
        return score;
    }

    public void setScore(Double score)
    {
        this.score = score;
    }
}
