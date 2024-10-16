/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-16 14:50:23
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-16 19:45:53
 * @: 無限進步
 */
package Test03;

import java.io.Serializable;


public class Teacher implements Serializable {
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
