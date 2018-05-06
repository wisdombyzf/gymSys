package factory;

import dao.*;
import dao.impl.*;
import org.aspectj.weaver.MemberImpl;

public class DaoFactory
{
    public static RulesDao getRulesDao()
    {
        return new RulesDaoIpml();
    }

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

    public static MatchDao getMatchDao()
    {
        return new MatchDaoImpl();
    }

    public static PlayerMatchDao getPlayerMatchDao()
    {
        return new PlayerMatchDaoImpl();
    }
}
