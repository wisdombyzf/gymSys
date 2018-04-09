package po;

import javax.persistence.*;

@Entity
@Table(name = "score", schema = "gaysys", catalog = "")
@IdClass(ScorePoPK.class)
public class ScorePo
{
    private String matchId;
    private String judgeId;
    private String playerId;
    private Integer score;
    private String scoreAccept;

    @Id
    @Column(name = "MatchID", nullable = false, length = 11)
    public String getMatchId()
    {
        return matchId;
    }

    public void setMatchId(String matchId)
    {
        this.matchId = matchId;
    }

    @Id
    @Column(name = "JudgeID", nullable = false, length = 11)
    public String getJudgeId()
    {
        return judgeId;
    }

    public void setJudgeId(String judgeId)
    {
        this.judgeId = judgeId;
    }

    @Id
    @Column(name = "PlayerID", nullable = false, length = 11)
    public String getPlayerId()
    {
        return playerId;
    }

    public void setPlayerId(String playerId)
    {
        this.playerId = playerId;
    }

    @Basic
    @Column(name = "Score", nullable = true)
    public Integer getScore()
    {
        return score;
    }

    public void setScore(Integer score)
    {
        this.score = score;
    }

    @Basic
    @Column(name = "ScoreAccept", nullable = true, length = 255)
    public String getScoreAccept()
    {
        return scoreAccept;
    }

    public void setScoreAccept(String scoreAccept)
    {
        this.scoreAccept = scoreAccept;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScorePo scorePo = (ScorePo) o;

        if (matchId != null ? !matchId.equals(scorePo.matchId) : scorePo.matchId != null) return false;
        if (judgeId != null ? !judgeId.equals(scorePo.judgeId) : scorePo.judgeId != null) return false;
        if (playerId != null ? !playerId.equals(scorePo.playerId) : scorePo.playerId != null) return false;
        if (score != null ? !score.equals(scorePo.score) : scorePo.score != null) return false;
        if (scoreAccept != null ? !scoreAccept.equals(scorePo.scoreAccept) : scorePo.scoreAccept != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = matchId != null ? matchId.hashCode() : 0;
        result = 31 * result + (judgeId != null ? judgeId.hashCode() : 0);
        result = 31 * result + (playerId != null ? playerId.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (scoreAccept != null ? scoreAccept.hashCode() : 0);
        return result;
    }
}
