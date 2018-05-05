package po;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ScorePoPK implements Serializable
{
    private String matchId;
    private String judgeId;
    private String playerId;

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

    @Column(name = "JudgeID", nullable = false, length = 255)
    @Id
    public String getJudgeId()
    {
        return judgeId;
    }

    public void setJudgeId(String judgeId)
    {
        this.judgeId = judgeId;
    }

    @Column(name = "PlayerID", nullable = false, length = 255)
    @Id
    public String getPlayerId()
    {
        return playerId;
    }

    public void setPlayerId(String playerId)
    {
        this.playerId = playerId;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScorePoPK scorePoPK = (ScorePoPK) o;

        if (matchId != null ? !matchId.equals(scorePoPK.matchId) : scorePoPK.matchId != null) return false;
        if (judgeId != null ? !judgeId.equals(scorePoPK.judgeId) : scorePoPK.judgeId != null) return false;
        if (playerId != null ? !playerId.equals(scorePoPK.playerId) : scorePoPK.playerId != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = matchId != null ? matchId.hashCode() : 0;
        result = 31 * result + (judgeId != null ? judgeId.hashCode() : 0);
        result = 31 * result + (playerId != null ? playerId.hashCode() : 0);
        return result;
    }
}
