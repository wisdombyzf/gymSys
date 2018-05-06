package po;

import javax.persistence.*;

@Entity
@Table(name = "rules", schema = "gaysys", catalog = "")
public class RulesPo
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

    @Basic
    @Column(name = "PlayerPerMatch", nullable = true)
    public Integer getPlayerPerMatch()
    {
        return playerPerMatch;
    }

    public void setPlayerPerMatch(Integer playerPerMatch)
    {
        this.playerPerMatch = playerPerMatch;
    }

    @Basic
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

        RulesPo rulesPo = (RulesPo) o;

        if (teamPlayerPerGroup != rulesPo.teamPlayerPerGroup) return false;
        if (playerPerMatch != null ? !playerPerMatch.equals(rulesPo.playerPerMatch) : rulesPo.playerPerMatch != null)
            return false;
        if (playerCountInGroupScore != null ? !playerCountInGroupScore.equals(rulesPo.playerCountInGroupScore) : rulesPo.playerCountInGroupScore != null)
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
