package vo;


import java.io.Serializable;

public class TeamVo implements Serializable
{
    private String teamName;
    private String teamAccount;
    private String password;
    private String file;
    private Double score;


    public String getTeamName()
    {
        return teamName;
    }

    public void setTeamName(String teamName)
    {
        this.teamName = teamName;
    }

    public String getTeamAccount()
    {
        return teamAccount;
    }

    public void setTeamAccount(String teamAccount)
    {
        this.teamAccount = teamAccount;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getFile()
    {
        return file;
    }

    public void setFile(String file)
    {
        this.file = file;
    }

    public Double getScore()
    {
        return score;
    }

    public void setScore(Double score)
    {
        this.score = score;
    }
}
