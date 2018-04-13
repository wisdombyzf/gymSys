package test;

public class test
{
    public static void main(String[] args)
    {
        Thread thread = new Thread(
                new Runnable()
                {
                    public void run()
                    {
                        System.out.println("test");
                    }
                }
        );
        myThread thread1 = new myThread();
        thread1.start();

    }

}

class myThread extends Thread implements Runnable
{
    @Override
    public void run()
    {
        super.run();
        System.out.println(this.getName());
        System.out.println("id:"+this.getId());
    }
}