/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-09 21:28:16
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-09 21:28:29
 * @: 無限進步
 */
   //如何理解异常：
    //  程序不正常情况，统称为 异常
    public class Test011_Basic {
        public static void main(String[] args) {
            // ArithmeticException
            int a = 10 / 0;
            String s = "123";
            //: NumberFormatException
            int n = Integer.parseInt(s);
            Object obj = new Object();//new String("hello");
            //类型转换异常：ClassCastException
            s = (String)obj;
            int[] arr = {1,2,3,4};
            arr = null;
            //空指针异常：NullPointerException
            System.out.println(arr[0]);
            //数组索引越界 ArrayIndexOutOfBoundsException
            System.out.println(arr[4]); 
        }
    }