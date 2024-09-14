/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-13 16:48:09
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-13 16:52:03
 */
public class Test03 {
    public static void main(String[] args) {
    Student s = new Student("张三", 19, "男", "10000");
    System.out.println(s.getName()); //输出张三
    System.out.println(s.getAge()); //输出19
    s.setName("李四");
    System.out.println(s.getName()); //输出李四
    }
}
class Student {
    private String name;
    private int age;
    private String sex;
    private String id;
    public Student(){
    }
    public Student(String name,int age,String sex,String id){
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    
}