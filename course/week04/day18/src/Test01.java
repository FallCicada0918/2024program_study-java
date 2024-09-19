/*
 * @Description:多态的测试类
 * @Author: FallCicada
 * @Date: 2024-09-19 10:38:26
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-19 10:51:44
 */
public class Test01{
    public static void main(String[] args){
        Point point = new Circle(1,1,2);//多态
        //父类的引用调用 方法
        point.show();

        Point point1 = new Oval(2,2,3,4);
        point1.show();
        
    }
}