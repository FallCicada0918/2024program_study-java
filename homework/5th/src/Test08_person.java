/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-11 15:52:03
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-11 16:00:48
 */

class Person{
    private String name;
    private int age;
    public Person(String name){
        this.name = name;
    }
    public Person(String name,int age){
        this(name);
        this.age = age;
    }
    public void show(){
        System.out.println("姓名:" + name + ";年龄:" + age);
    }
}
public class Test08_person {
     public static void main(String[] args) {
        Person p1 = new Person("jack",21);
        p1.show();
        System.out.println("------------------");
        Person p2 = new Person("lucy");
        p2.show();
     }
}