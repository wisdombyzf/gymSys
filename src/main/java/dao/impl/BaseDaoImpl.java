package dao.impl;

import dao.BaseDao;
import org.hibernate.Hibernate;
import org.hibernate.Session;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * dao基类实现类
 *
 * @param <T>
 * @author zf
 */
public class BaseDaoImpl<T> implements BaseDao<T>
{

    private Class<T> clazz;

    /**
     * 通过构造方法指定DAO的具体实现类
     * 通过反射机制获取DAO实现类的泛型具体类型。。。mark一下
     */
    public BaseDaoImpl()
    {
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        clazz = (Class<T>) type.getActualTypeArguments()[0];
        //System.out.println("DAO的真实实现类是："+this.clazz.getName());
    }

    public Session getSession()
    {

    }

    /**
     * 添加一个对象
     *
     * @param entity 对象实体
     */
    public void save(T entity)
    {

    }

    /**
     * 更新一个对象，所有属性
     *
     * @param entity 对象实体
     */
    public void update(T entity)
    {

    }

    /**
     * 更新一个对象，部分属性
     *
     * @param id     id
     * @param names  键
     * @param values
     */
    public void partUpdate(int id, String[] names, Object[] values)
    {

    }

    /**
     * 删除一个对象
     *
     * @param id
     */
    public void delete(Serializable id)
    {

    }

    /**
     * 根据id查找一个对象
     *
     * @param id
     * @return
     */
    public T findById(Serializable id)
    {
        return null;
    }

    /**
     * 根据HQL返回对象List
     *
     * @param hql
     * @param params
     * @return
     */
    public List<T> findByHQL(String hql, Object... params)
    {
        return null;
    }

    /**
     * 分页查询
     *
     * @param hql
     * @param pageNo
     * @param pageSize
     * @return
     */
    public List<T> queryPage(String hql, int pageNo, int pageSize)
    {
        return null;
    }
}
