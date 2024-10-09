/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-09 20:23:18
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-09 20:40:21
 * @: 無限進步
 */
/**
 * 1.	编写⽅法：division()：要求执⾏10/0操作，并使⽤异 常处理机制处理可能会产⽣的异常
 * 2.	编写main()：调⽤division()
 * 3.	修改division()：执⾏10/0不变，但不在⽅法中处理产⽣的异常，改将异常抛出
 * 4.	修改main()：调⽤division()并处理其抛出的异常
 */
public class Test_DivisionByZero {
    public static void main(String[] args) {
        try {
            division();
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }
    }

    public static void division() throws ArithmeticException {
        int c = 10 / 0;
    }
}
