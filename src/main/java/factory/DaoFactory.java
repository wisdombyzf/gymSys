package factory;

import dao.*;
import dao.impl.*;

public class DaoFactory
{
    public static PlayerDao getPlayerDao()
    {
        return new PlayerDaoImpl();
    }

    public static AdminDao getAdminDao()
    {
        return new AdminDaoImpl();
    }

    public static TeamDao getTeamDao()
    {
        return new TeamDaoImpl();
    }

    public static TeammdeicDao getDeicDao()
    {
        return new TeammdeicDaoImpl();
    }

    public static TeamLeaderDao getLeaderDao()
    {
        return new TeamLeaderDaoImpl();
    }

    public static TeamcoachDao getCoachDao()
    {
        return new TeamcoachDaoImpl();
    }

    public static JudgerDao getJudgerDao()
    {
        return new JudgerDaoImpl();
    }

    public static GameDao getGameDao()
    {
        return new GameDaoImpl();
    }

    public static ScoreDao getScroeDao()
    {
        return new ScoreDaoImpl();
    }
}
