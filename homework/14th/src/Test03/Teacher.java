/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-16 14:50:23
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-17 10:42:25
 * @: 無限進步
 */
package Test03;

import java.io.Serializable;

//实现序列化接口,是为了让Teacher类对象可以被序列化和反序列化
public class Teacher implements Serializable {
    // 序列化版本ID
    //标识当前类的版本,用于序列化和反序列化时的本本校验
    private static final long serialVersionUID = 1L;
    //确认序列化版本ID,序列化和序列化时都会检查这个ID,确认前后一致性
    private String name;
    private int age;
    private double salary;

    public Teacher(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // getters and setters
    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }
    public int getAge() { 
        return age; 
    }
    public void setAge(int age) { 
        this.age = age; 
    }
    public double getSalary() { 
        return salary; 
    }
    public void setSalary(double salary) { 
        this.salary = salary; 
    }
    @Override
    public String toString() {
        return "Teacher [name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
}
