/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-24 15:19:46
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-24 16:27:27
 */
public class Student{
    private String name;
    private int age;

    public Student(){

    }
    
    public Student(String name, int age){
        this.name = name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void study(){
        System.out.println("study");
    }
    
    public void show(){
        System.out.println("name: " + this.name + " age: " + this.age);
    }

    @Override
    public boolean equals(Object obj) {
        //重写equals方法
        boolean result = false;
        //类型判断
        // 判断类型是否相同
        //如果类型不同，那么直接返回 falese
        if (!(obj instanceof Student)){
            return false;
        }
        //第二步判断：比较对象中属性是否相同
        //向下转型，强转
        Student stu = (Student) obj;
        if(name.equals(stu.getName()) && (age == stu.getAge())){
            result = true;
        }else{
            return false;
        }
        return result;
    }
}
