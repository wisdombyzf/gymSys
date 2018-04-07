public class test2
{
    public <T> T test21(Class<T> c) throws IllegalAccessException, InstantiationException
    {
        T a=c.newInstance();
        System.out.println(a);
        return a;
    }
}
