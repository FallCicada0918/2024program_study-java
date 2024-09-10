/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-10 09:08:45
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-10 09:20:04
 */
public class TestTeacher {
    public static void main(String[] args) {
       Teacher teacher = new Teacher();
       teacher.setName("任殿臣");
       teacher.setId("123456789");
       teacher.setSex('男');
       teacher.sayHello();
       Teacher teacher1 = new Teacher("任殿臣","123456789",'男');
       teacher1.sayHello();
    }
}