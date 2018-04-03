package dao;

import vo.PlayerVo;

import java.sql.SQLException;

public interface PlayerDao
{
    /**
     * 创建一个新运动员
     * @param vo 要增加内容的vo对象
     * @return 成功返回true
     */
    boolean doCreate(PlayerVo vo);

    /**
     * 修改一位新运动员的信息
     * @param vo 要修改内容的vo对象
     * @return 成功返回true
     */
    boolean doUpdata(PlayerVo vo) ;

    /**
     * @param id 要删除的对象
     * @return 成功返回true
     * @brief 删除一位新运动员的信息
     */
    boolean doRemove(String id);

    /**
     * 根据id查询新运动员信息
     * @param id 要查询的对象
     * @return 返回该对象
     */
    PlayerVo findById(String id) throws SQLException;

    /**
     * @param vo 传入user值对象
     * @return 登陆成功返回true
     */
    boolean isLogin(PlayerVo vo);

    /**
     * 判断管理员权限
     *
     * @param id
     * @return 是管理员则返回true
     */
    boolean isAdmin(String id);


}
