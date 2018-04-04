package Service;

import dao.AdminDao;
import dao.TeamDao;
import factory.DaoFactory;
import po.AdminPo;
import po.TeamPo;
import vo.AdminVo;
import vo.TeamVo;

/**
 * 管理员服务类
 */
public class AdminService
{

    public AdminService()
    {
    }


    /**
     * 能否以管理员权限登陆
     *
     * @param vo
     * @return
     */
    public boolean IsLogin(AdminVo vo)
    {
        AdminDao adminDao = DaoFactory.getAdminDao();
        AdminPo adminPo = adminDao.findById(vo.getId());

        if (adminPo == null || !adminPo.getPassword().equals(vo.getPassword()))
        {
            return false;
        } else
        {
            return true;
        }
    }

    /**
     * 管理员添加队伍信息
     *
     * @param vo
     * @return
     */
    public boolean AddTeam(TeamVo vo)
    {

        TeamDao teamDao = DaoFactory.getTeamDao();
        TeamPo teamPo = new TeamPo();

        //TODO po转vo待定   暂时直接暴力
        teamPo.setTeamName(vo.getTeamName());
        teamPo.setTeamAccount(vo.getTeamAccount());
        teamPo.setPassword(vo.getPassword());
        teamPo.setFile(vo.getFile());

        teamDao.save(teamPo);
        return true;
    }



}
