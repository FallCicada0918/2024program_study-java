/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-19 09:25:52
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-19 09:28:01
 */
public class Student {
    //保证这个类只有一个实例
    //初始化一个实例对象
    private static final Student instance = new Student();
    //私有化构造函数，保证一个类只有一个实例
    private Student(){
        System.out.println("Student的无参构造器");
    }
    
    //提供一个全局访问点
    public static Student getStudent(){
        //返回学生实例
        return instance;
    }
}