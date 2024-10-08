<!--
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-08 17:29:46
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-08 17:40:25
-->
# 2024年秋季Java基础课用笔记
# 异常
## 异常
### 概述
程序在运行过程中，由于意外情况导致程序发生异常事件，默认情况下发生的异常会中断程序的运行。

在Java中，把常见的异常情况，都抽象成了对应的异常类型，那么每种异常类型都代表了一种特定的异常情况。

当程序中出现一种异常情况时，也会创建并抛出一个异常类型对象，这个对象就表示当前程序所出现的问题。

如图:
![异常图示](./异常图示.png)
例如，程序中有一种异常情况是，当前使用下标从数组中取值的时候，这个下标值超过了数组下标的最大值，那么程序中就出现了异常情况，java中把这种异常情况抽象成了一个类：`java.lang.ArrayIndexOutOfBoundsException` ，将来这个类的对象，就表示程序中出现了数组下标超过边界的异常情况。

案例描述：

观察下面的情况。
```java
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
    //运行结果：
    Exception in thread "main" java.lang.ArithmeticException: / by zero
    at com.briup.chap09.Test011_Basic.main(Test01_Basic.java:9)
```
>可以看出，当前程序出现异常情况时，会创建并抛出和该异常情况对应的异常类的对象，这个异常对象中保存了一些信息，用来表示当前程序到底发生了什么异常情况。
>
>通过异常信息，我们可以定位异常发生的位置，以及异常发生的原因
### 异常体系
`