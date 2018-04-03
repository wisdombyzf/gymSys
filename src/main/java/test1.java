import entity.PlayerEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test1
{
    public static void main(String []args)
    {
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        PlayerEntity playerEntity=new PlayerEntity();
        playerEntity.setPlayerId("14553");
        playerEntity.setName("测试341");
        session.save(playerEntity);
        //playerEntity=session.get(PlayerEntity.class,"13323");
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
