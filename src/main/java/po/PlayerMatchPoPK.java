package po;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class PlayerMatchPoPK implements Serializable
{
    private String playerId;
    private String matchId;

    @Column(name = "player_id", nullable = false, length = 255)
    @Id
    public String getPlayerId()
    {
        return playerId;
    }

    public void setPlayerId(String playerId)
    {
        this.playerId = playerId;
    }

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

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlayerMatchPoPK that = (PlayerMatchPoPK) o;

        if (playerId != null ? !playerId.equals(that.playerId) : that.playerId != null) return false;
        if (matchId != null ? !matchId.equals(that.matchId) : that.matchId != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = playerId != null ? playerId.hashCode() : 0;
        result = 31 * result + (matchId != null ? matchId.hashCode() : 0);
        return result;
    }
}
