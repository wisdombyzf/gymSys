package po;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MatchjudgePoPK implements Serializable
{
    private String matchId;
    private String judgerId;

    @Column(name = "MatchID", nullable = false, length = 255)
    @Id
    public String getMatchId()
    {
        return matchId;
    }

    public void setMatchId(String matchId)
    {
        this.matchId = matchId;
    }

    @Column(name = "judgerID", nullable = false, length = 255)
    @Id
    public String getJudgerId()
    {
        return judgerId;
    }

    public void setJudgerId(String judgerId)
    {
        this.judgerId = judgerId;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MatchjudgePoPK that = (MatchjudgePoPK) o;

        if (matchId != null ? !matchId.equals(that.matchId) : that.matchId != null) return false;
        if (judgerId != null ? !judgerId.equals(that.judgerId) : that.judgerId != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = matchId != null ? matchId.hashCode() : 0;
        result = 31 * result + (judgerId != null ? judgerId.hashCode() : 0);
        return result;
    }
}
