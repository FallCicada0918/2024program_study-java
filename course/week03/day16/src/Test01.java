/*
 * @Description: 测试类_员工
 * @Author: FallCicada
 * @Date: 2024-09-14 09:30:06
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-14 14:50:42
 */
public class Test01{
    public static void main(String[] args) {
        Employee emp = new Employee("FishB1rd", "002");
        emp.doWork();
        Manager mgr = new Manager("FallCicada", "001",1000);
        mgr.doWork();
        System.out.println("manager" + mgr);
    }
}