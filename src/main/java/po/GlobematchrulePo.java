package po;

import javax.persistence.*;

@Entity
@Table(name = "globematchrule", schema = "gaysys", catalog = "")
public class GlobematchrulePo
{
    private int teamPlayerPerGroup;
    private Integer playerPerMatch;
    private Integer playerCountInGroupScore;

    @Id
    @Column(name = "TeamPlayerPerGroup", nullable = false)
    public int getTeamPlayerPerGroup()
    {
        return teamPlayerPerGroup;
    }

    public void setTeamPlayerPerGroup(int teamPlayerPerGroup)
    {
        this.teamPlayerPerGroup = teamPlayerPerGroup;
    }

    @Id
    @Column(name = "PlayerPerMatch", nullable = true)
    public Integer getPlayerPerMatch()
    {
        return playerPerMatch;
    }

    public void setPlayerPerMatch(Integer playerPerMatch)
    {
        this.playerPerMatch = playerPerMatch;
    }

    @Id
    @Column(name = "PlayerCountInGroupScore", nullable = true)
    public Integer getPlayerCountInGroupScore()
    {
        return playerCountInGroupScore;
    }

    public void setPlayerCountInGroupScore(Integer playerCountInGroupScore)
    {
        this.playerCountInGroupScore = playerCountInGroupScore;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GlobematchrulePo that = (GlobematchrulePo) o;

        if (teamPlayerPerGroup != that.teamPlayerPerGroup) return false;
        if (playerPerMatch != null ? !playerPerMatch.equals(that.playerPerMatch) : that.playerPerMatch != null)
            return false;
        if (playerCountInGroupScore != null ? !playerCountInGroupScore.equals(that.playerCountInGroupScore) : that.playerCountInGroupScore != null)
            return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = teamPlayerPerGroup;
        result = 31 * result + (playerPerMatch != null ? playerPerMatch.hashCode() : 0);
        result = 31 * result + (playerCountInGroupScore != null ? playerCountInGroupScore.hashCode() : 0);
        return result;
    }
}
