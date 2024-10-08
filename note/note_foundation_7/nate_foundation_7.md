<!--
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-08 17:29:46
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-08 19:33:34
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
异常体系中的根类是：`java.lang.Throwable` ，该类下面有俩个子类型，`java.lang.Error` 和 `java.lang.Exception`

注意，`Throwable` 表示可以被抛出的
* `Error`，表示错误情况，一般是程序中出现了比较严重的问题，并且程序自身并无法进行处理。
* `Exception`，表示异常情况，程序中出了这种异常，大多是可以通过特定的方式进行处理和纠正的，并且处理完了之后，程序还可以继续往下正常运行。
![异常体系](./异常体系.png)
> 注意，我们一般说的异常，都是指的Exception

### 异常种类
我们平时使用的异常类型，都是`Exception` 类的子类型，它们把异常划分成了两种：
* 编译时异常
* 运行时异常
#### 编译时异常
* 继承自`Exception` 类，也称为checked exception
* 编译器在编译期间，会主动检查这种异常，如果发现异常则必须显示处理，否则程序就会发生错误，无法通过编译
#### 运行时异常
* `RuntimeException` 类及其子类，也称为unchecked exception
* 编译器在编译期间，不会检查这种异常，也不要求我们去处理，但是在运行期间，如果出现这种异常则自动抛出
![允许抛出异常](./允许抛出异常.png)
### 异常传播
如果一个方法中出现了异常的情况，系统默认的处理方式是：自动创建异常对象，并将这个异常对象抛给当前方法的调用者，并一直向上抛出，最终传递给JVM，JVM默认处理步骤有2步：

* 把异常的名称，错误原因及异常出现的位置等信息输出在了控制台
* 程序停止执行

案例：
```java
    
    public class Test02_Default {
        public static void main(String[] args) {
        System.out.println("hello");
            test1();
            System.out.println("world");
        }
        
        public static void test1(){
            test2();
        }
        
        public static void test2(){
            test3();
        }
        
        public static void test3(){
            //下面代码会抛出异常
            int a = 1/0;
        }
    }
```
运行结果：
![案例1运行结果](./案例1运行结果.png)

**代码执行步骤解析：**
* 因为`java.lang.ArithmeticException`是运行时异常，所以代码可以编译通过
* 程序运行时，先输出"hello"，然后一层一层调用，最终执行test3方法
* 行test3方法时，出现除数为0的情况，系统自动抛出异常`java.lang.ArithmeticException`
* 码中没有对异常进行任何捕获处理，所以该异常往上传递给test2 --> test1 --> main --> JVM
* JVM虚拟机拿到异常后，输出异常相关信息，然后终止程序

## 异常抛出
### 自动抛出
Java代码中，出现了提前指定好的异常情况的时候，代码会自动创建异常对象，并且将该异常对象抛出。