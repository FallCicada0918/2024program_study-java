
/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-23 19:31:20
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-23 19:37:42
 */
package student;
// 测试代码
public class Test4_3 {
    public static void main(String[] args) {
        Student student = new Student("Tom", 20, "123456", 90.5);
        student.run();    // 继承自 Person 的行为
        student.study();  // Student 自身的行为
        student.sing();   // 实现 ISingAble 接口中的行为
        student.fly();    // 实现 IFlyAble 接口中的行为
    }
}