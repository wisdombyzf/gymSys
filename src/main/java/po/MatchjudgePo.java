package po;

import javax.persistence.*;

@Entity
@Table(name = "matchjudge", schema = "gaysys", catalog = "")
@IdClass(MatchjudgePoPK.class)
public class MatchjudgePo
{
    private String matchId;
    private String judgerId;
    private Integer isChief;

    @Id
    @Column(name = "MatchID", nullable = false, length = 255)
    public String getMatchId()
    {
        return matchId;
    }

    public void setMatchId(String matchId)
    {
        this.matchId = matchId;
    }

    @Id
    @Column(name = "judgerID", nullable = false, length = 255)
    public String getJudgerId()
    {
        return judgerId;
    }

    public void setJudgerId(String judgerId)
    {
        this.judgerId = judgerId;
    }

    @Basic
    @Column(name = "IsChief", nullable = true)
    public Integer getIsChief()
    {
        return isChief;
    }

    public void setIsChief(Integer isChief)
    {
        this.isChief = isChief;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MatchjudgePo that = (MatchjudgePo) o;

        if (matchId != null ? !matchId.equals(that.matchId) : that.matchId != null) return false;
        if (judgerId != null ? !judgerId.equals(that.judgerId) : that.judgerId != null) return false;
        if (isChief != null ? !isChief.equals(that.isChief) : that.isChief != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = matchId != null ? matchId.hashCode() : 0;
        result = 31 * result + (judgerId != null ? judgerId.hashCode() : 0);
        result = 31 * result + (isChief != null ? isChief.hashCode() : 0);
        return result;
    }
}
