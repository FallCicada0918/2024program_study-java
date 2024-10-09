/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-09 21:15:14
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-09 21:15:19
 * @: 無限進步
 */
public class Return3 {
    public static void main(String[] args) {
        System.out.println(testTest04());
        }
        private static String testTest04() {
        String a = "hello";
        try {
        a += "!";
        System.out.println("try:" + a);
        return a;
        } finally {
        a += "world";
        System.out.println("finally:" +a);
        }
    }
}