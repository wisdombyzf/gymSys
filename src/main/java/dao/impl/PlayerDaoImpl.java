package dao.impl;

import dao.PlayerDao;
import entity.PlayerEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import vo.PlayerVo;

import java.sql.SQLException;

public class PlayerDaoImpl implements PlayerDao
{
    private Configuration configuration;
    private SessionFactory sessionFactory;

    public PlayerDaoImpl()
    {
        ///因为session不是线程安全的，所以只提前构造出sessionFactory
        configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
    }

    /**
     * 创建一个新运动员
     *
     * @param vo 要增加内容的vo对象
     * @return 成功返回true
     */
    public boolean doCreate(PlayerVo vo)
    {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        PlayerEntity playerEntity=new PlayerEntity();

        return false;
    }

    /**
     * 修改一位新运动员的信息
     *
     * @param vo 要修改内容的vo对象
     * @return 成功返回true
     */
    public boolean doUpdata(PlayerVo vo)
    {
        return false;
    }

    /**
     * @param id 要删除的对象
     * @return 成功返回true
     * @brief 删除一位新运动员的信息
     */
    public boolean doRemove(String id)
    {
        return false;
    }

    /**
     * 根据id查询新运动员信息
     *
     * @param id 要查询的对象
     * @return 返回该对象
     */
    public PlayerVo findById(String id) throws SQLException
    {
        return null;
    }

    /**
     * @param vo 传入user值对象
     * @return 登陆成功返回true
     */
    public boolean isLogin(PlayerVo vo)
    {
        return false;
    }

    /**
     * 判断管理员权限
     *
     * @param id
     * @return 是管理员则返回true
     */
    public boolean isAdmin(String id)
    {
        return false;
    }
}
