/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-13 10:45:58
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-13 15:37:51
 */
//继承只能单继承和多层继承



public class Dog extends Animal{
    //继承了animal的属性
    //private name 
    //不可以直接操作
    //public number
    //可以直接操作
    // public String name;

    private String color;

    public Dog(){
        System.out.println("Dog的构造器");
    }
    public Dog(String name){
        //super(name);
        this.setName(name);
        System.out.println("Dog的带参构造器");
    }

    public Dog(String name,int number,String color){
        super(name,number);
        //赋值color
        this.color=color;
    }

    public void showNumber(){
        System.out.println("this.number:" + this.number);
        System.out.println("super.number:" + super.number);
    }
    
    public void setColor(String color){
        this.color=color;
    }

    public void setName(String name){
        //父类私有属性,可以通过非私有方法访问
        super.setName(name);
    }

    // public String setColor(String color){
    //     this.color=color;
    // }

    public String getColor(){
        return color;
    }
    public void sayHello(){
        System.out.println("我是"+getName()+"，我的颜色是"+color);
        System.out.println("汪汪汪");
    }
}