/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-08 14:39:07
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-08 14:48:10
 */
/**
 * MyClass - 泛型类
 */
// 泛型的基本语法定义在<>中的是泛型参数，可以有多个泛型参数，用逗号隔开
// 在使用这个类的时候，传入上面类型，T就是上面类型
//
public class MyClass<T,K> {
//成员属性
    private T value;
    //原来使用具体类型声明的变量，现在用泛型代替
    private K key;
    // private int age;
    //成员方法
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }
    public static void main(String[] args) {
        
    }
}