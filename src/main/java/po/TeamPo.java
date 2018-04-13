package po;

import javax.persistence.*;

@Entity
@Table(name = "team", schema = "gaysys", catalog = "")
public class TeamPo
{
    private String teamName;
    private String teamAccount;
    private String password;
    private String file;
    private Double score;

    @Id
    @Column(name = "team_name", nullable = false, length = 20)
    public String getTeamName()
    {
        return teamName;
    }

    public void setTeamName(String teamName)
    {
        this.teamName = teamName;
    }

    @Basic
    @Column(name = "TeamAccount", nullable = false, length = 20)
    public String getTeamAccount()
    {
        return teamAccount;
    }

    public void setTeamAccount(String teamAccount)
    {
        this.teamAccount = teamAccount;
    }

    @Basic
    @Column(name = "Password", nullable = false, length = 20)
    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @Basic
    @Column(name = "File", nullable = true, length = 255)
    public String getFile()
    {
        return file;
    }

    public void setFile(String file)
    {
        this.file = file;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeamPo teamPo = (TeamPo) o;

        if (teamName != null ? !teamName.equals(teamPo.teamName) : teamPo.teamName != null) return false;
        if (teamAccount != null ? !teamAccount.equals(teamPo.teamAccount) : teamPo.teamAccount != null) return false;
        if (password != null ? !password.equals(teamPo.password) : teamPo.password != null) return false;
        if (file != null ? !file.equals(teamPo.file) : teamPo.file != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = teamName != null ? teamName.hashCode() : 0;
        result = 31 * result + (teamAccount != null ? teamAccount.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (file != null ? file.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "Score", nullable = true, precision = 0)
    public Double getScore()
    {
        return score;
    }

    public void setScore(Double score)
    {
        this.score = score;
    }
}
