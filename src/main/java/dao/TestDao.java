package dao;


import org.springframework.stereotype.Repository;

@Repository
public class TestDao
{
    String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        System.out.println("哈哈哈哈");
        this.name = name;
    }
}
