package po;

import javax.persistence.*;

@Entity
@Table(name = "player_match", schema = "gaysys", catalog = "")
@IdClass(PlayerMatchPoPK.class)
public class PlayerMatchPo
{
    private String playerId;
    private String matchId;
    private String groups;
    private String playerName;
    private String dScore;
    private String pScore;
    private String allScore;
    private String scoreState;

    @Id
    @Column(name = "player_id", nullable = false, length = 255)
    public String getPlayerId()
    {
        return playerId;
    }

    public void setPlayerId(String playerId)
    {
        this.playerId = playerId;
    }

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

    @Basic
    @Column(name = "groups", nullable = true, length = 255)
    public String getGroups()
    {
        return groups;
    }

    public void setGroups(String groups)
    {
        this.groups = groups;
    }

    @Basic
    @Column(name = "player_name", nullable = true, length = 255)
    public String getPlayerName()
    {
        return playerName;
    }

    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }

    @Basic
    @Column(name = "DScore", nullable = true, length = 255)
    public String getdScore()
    {
        return dScore;
    }

    public void setdScore(String dScore)
    {
        this.dScore = dScore;
    }

    @Basic
    @Column(name = "PScore", nullable = true, length = 255)
    public String getpScore()
    {
        return pScore;
    }

    public void setpScore(String pScore)
    {
        this.pScore = pScore;
    }

    @Basic
    @Column(name = "AllScore", nullable = true, length = 255)
    public String getAllScore()
    {
        return allScore;
    }

    public void setAllScore(String allScore)
    {
        this.allScore = allScore;
    }

    @Basic
    @Column(name = "ScoreState", nullable = true, length = 255)
    public String getScoreState()
    {
        return scoreState;
    }

    public void setScoreState(String scoreState)
    {
        this.scoreState = scoreState;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlayerMatchPo that = (PlayerMatchPo) o;

        if (playerId != null ? !playerId.equals(that.playerId) : that.playerId != null) return false;
        if (matchId != null ? !matchId.equals(that.matchId) : that.matchId != null) return false;
        if (groups != null ? !groups.equals(that.groups) : that.groups != null) return false;
        if (playerName != null ? !playerName.equals(that.playerName) : that.playerName != null) return false;
        if (dScore != null ? !dScore.equals(that.dScore) : that.dScore != null) return false;
        if (pScore != null ? !pScore.equals(that.pScore) : that.pScore != null) return false;
        if (allScore != null ? !allScore.equals(that.allScore) : that.allScore != null) return false;
        if (scoreState != null ? !scoreState.equals(that.scoreState) : that.scoreState != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = playerId != null ? playerId.hashCode() : 0;
        result = 31 * result + (matchId != null ? matchId.hashCode() : 0);
        result = 31 * result + (groups != null ? groups.hashCode() : 0);
        result = 31 * result + (playerName != null ? playerName.hashCode() : 0);
        result = 31 * result + (dScore != null ? dScore.hashCode() : 0);
        result = 31 * result + (pScore != null ? pScore.hashCode() : 0);
        result = 31 * result + (allScore != null ? allScore.hashCode() : 0);
        result = 31 * result + (scoreState != null ? scoreState.hashCode() : 0);
        return result;
    }
}
