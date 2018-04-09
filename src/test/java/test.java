import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class test extends Thread
{
    int a;
    public static void main(String []args)
    {
        int a=11;
        String s=String.format("%04d",a);
        System.out.println(s);
    }
}

class MyThread extends Thread
{
    static int num=0;
    @Override
    public  void run ()
    {
        while (true)
        {
           print();
        }
    }

    private synchronized void print()
    {
        num++;
        System.out.println(this.getName()+"值为"+num);
        try
        {
            sleep(1000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

}

