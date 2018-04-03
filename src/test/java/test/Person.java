package test;

import java.lang.reflect.ParameterizedType;

public class Person<T>
{
    private Class<T> clazz;
    public Person() {
        // 使用反射技术得到T的真实类型
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass(); // 获取当前new的对象的 泛型的父类 类型
        this.clazz = (Class<T>) pt.getActualTypeArguments()[0]; // 获取第一个类型参数的真实类型
        System.out.println("clazz ---> " + clazz);
    }

}
