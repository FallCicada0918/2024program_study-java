/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-09 21:00:12
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-09 21:03:42
 * @: 無限進步
 */
public class Return1 {
    public static void main(String[] args) {
        int i = new Return1().testReturn1();
        System.out.println(i);
    }
        
    private int testReturn1() {
        int i = 1;
        try {
            i++;
            System.out.println("try:" + i);
            return i;
        } 
        finally {
            i++;
            System.out.println("finally:" + i);
        }
    }
}