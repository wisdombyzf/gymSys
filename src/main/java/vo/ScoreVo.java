package vo;


public class ScoreVo
{
    private String matchId;
    private String judgeId;
    private String playerId;
    private Integer score;
    private String scoreAccept;

    public String getMatchId()
    {
        return matchId;
    }

    public void setMatchId(String matchId)
    {
        this.matchId = matchId;
    }

    public String getJudgeId()
    {
        return judgeId;
    }

    public void setJudgeId(String judgeId)
    {
        this.judgeId = judgeId;
    }

    public String getPlayerId()
    {
        return playerId;
    }

    public void setPlayerId(String playerId)
    {
        this.playerId = playerId;
    }

    public Integer getScore()
    {
        return score;
    }

    public void setScore(Integer score)
    {
        this.score = score;
    }

    public String getScoreAccept()
    {
        return scoreAccept;
    }

    public void setScoreAccept(String scoreAccept)
    {
        this.scoreAccept = scoreAccept;
    }

}
