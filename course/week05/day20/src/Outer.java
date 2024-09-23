/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-23 15:08:47
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-23 15:20:10
 */
public class Outer {
    // 成员属性
    private int oNum = 20;
    private int num = 10;
    
    // 正确定义内部类
    public class Inner {
        private int iNum = 30;
        private int num = 40;

        public void show() {
            // 访问外部类成员属性
            System.out.println(oNum); // 访问外部类的oNum
            System.out.println(Outer.this.num); // 明确访问外部类的num
            // 访问内部类成员属性
            System.out.println(iNum); // 访问内部类的iNum
            System.out.println(num); // 访问内部类的num
        }

        
    }

    
    
    // 外部类的其他代码...
}