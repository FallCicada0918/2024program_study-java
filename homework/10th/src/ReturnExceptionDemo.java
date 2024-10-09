/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-09 20:50:00
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-09 20:50:36
 * @: 無限進步
 */
public class ReturnExceptionDemo  {
    public static void methodA() throws
        Exception {
        try {
        System.out.println("进入方法A");
        throw new Exception("制造异常");
        } finally {
        System.out.println("用A方法的finally");
        }
    }
        public static int methodB() {
        try {
        System.out.println("进入方法B");
        return 1;
        } finally {
        System.out.println("用B方法的finally");
        return 2;
        }
        }
        public static void main(String[] args) {
        try {
        methodA();
        } catch (Exception e) {
        System.out.println(e.getMessage());
        }
        int i = methodB();
        System.out.println(i);
    }
}