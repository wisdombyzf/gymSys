package po;

import javax.persistence.*;

@Entity
@Table(name = "game", schema = "gaysys", catalog = "")
public class GamePo
{
    private int id;
    private String gameId;
    private String groups;
    private String playerId;
    private String playerName;

    @Id
    @Column(name = "id", nullable = false)
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Basic
    @Column(name = "game_id", nullable = true, length = 255)
    public String getGameId()
    {
        return gameId;
    }

    public void setGameId(String gameId)
    {
        this.gameId = gameId;
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
    @Column(name = "player_id", nullable = true, length = 255)
    public String getPlayerId()
    {
        return playerId;
    }

    public void setPlayerId(String playerId)
    {
        this.playerId = playerId;
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

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GamePo gamePo = (GamePo) o;

        if (id != gamePo.id) return false;
        if (gameId != null ? !gameId.equals(gamePo.gameId) : gamePo.gameId != null) return false;
        if (groups != null ? !groups.equals(gamePo.groups) : gamePo.groups != null) return false;
        if (playerId != null ? !playerId.equals(gamePo.playerId) : gamePo.playerId != null) return false;
        if (playerName != null ? !playerName.equals(gamePo.playerName) : gamePo.playerName != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id;
        result = 31 * result + (gameId != null ? gameId.hashCode() : 0);
        result = 31 * result + (groups != null ? groups.hashCode() : 0);
        result = 31 * result + (playerId != null ? playerId.hashCode() : 0);
        result = 31 * result + (playerName != null ? playerName.hashCode() : 0);
        return result;
    }
}
