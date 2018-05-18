package vo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;

public class MatchVo
{
    private String matchId;
    private String playerGroup;
    private String event;
    private String chiefId;
    private String satrtTime;
    private String endTime;
    private String matchStatus;
    private Integer matchType;
    private String subGroup;

    public String getMatchId()
    {
        return matchId;
    }

    public void setMatchId(String matchId)
    {
        this.matchId = matchId;
    }

    public String getPlayerGroup()
    {
        return playerGroup;
    }

    public void setPlayerGroup(String playerGroup)
    {
        this.playerGroup = playerGroup;
    }

    public String getEvent()
    {
        return event;
    }

    public void setEvent(String event)
    {
        this.event = event;
    }

    public String getChiefId()
    {
        return chiefId;
    }

    public void setChiefId(String chiefId)
    {
        this.chiefId = chiefId;
    }

    public String getSatrtTime()
    {
        return satrtTime;
    }

    public void setSatrtTime(String satrtTime)
    {
        this.satrtTime = satrtTime;
    }

    public String getEndTime()
    {
        return endTime;
    }

    public void setEndTime(String endTime)
    {
        this.endTime = endTime;
    }

    public String getMatchStatus()
    {
        return matchStatus;
    }

    public void setMatchStatus(String matchStatus)
    {
        this.matchStatus = matchStatus;
    }

    public Integer getMatchType()
    {
        return matchType;
    }

    public void setMatchType(Integer matchType)
    {
        this.matchType = matchType;
    }

    public String getSubGroup()
    {
        return subGroup;
    }

    public void setSubGroup(String subGroup)
    {
        this.subGroup = subGroup;
    }

}
