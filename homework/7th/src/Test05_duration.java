/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-16 11:34:02
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-16 11:35:29
 */
public class Test05_duration {
    public static void main(String[] args) {
        Duration d = new Duration(1, 1, 1);
        int totalSeconds = d.getTotalSeconds();
        System.out.println("totalSeconds = " + totalSeconds);
        //输出 totalSeconds = 3661
        Duration d2 = new Duration(3660);
        int hours = d2.getHours();
        System.out.println("hours = " + hours);//输出 hours = 1
        System.out.println(d2);// 输出 1:1:0
    }
}