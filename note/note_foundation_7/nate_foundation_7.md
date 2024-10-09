<!--
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-08 17:29:46
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-09 17:07:00
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
* 编译器在编译期间，会主动检查这种异常，如果发现异常则必须显示处理，否则程序就会发生错误，无法通过编译,无法生成字节码文件
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

例如，上述案例中执行 `int a = 1/0;` 的时候，代码会自动创建并抛出 `ArithmeticException` 类型的异常对象，来表示当前的这种异常情况。（算术异常）

又如，代码中执行`String str = null; str.toString();` 的时候，代码会自动创建并抛出 `NullPointerException` 类型的异常对象，来表示当前这种异常情况。（空指针异常）

### 手动抛出
以上描述的异常情况，都是JVM中提前规定好的，我们不需要干预，JVM内部自己就会创建并抛出异常对象。

但是在其他的一些情况下，我们也可以手动的创建并抛出异常对象，抛出后系统也会按照默认的方式去处理。

#### **手动抛出异常固定格式：**

`throw 异常对象;`

#### 案例展示：
从键盘录入用户名和密码，如果不是"root"和"briup"，则主动抛出异常RuntimeException。
```java
    import java.util.Scanner;
    //手动抛出异常对象
    public class Test02_Throw {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input username and password: ");
        String username = sc.nextLine();
        String password = sc.nextLine();
            login(username,password);
        }
        public static void login(String name, String passwd) {
            if("root".equals(name) && "briup".equals(passwd)) {
                System.out.println("登录成功!");
            }else {
                //抛出运行时异常
                throw new RuntimeException("用户名或密码录入有误")String username = sc.nextLine();
                String password = sc.nextLine();
                login(username,password);
        }
        public static void login(String name, String passwd) {
            if("root".equals(name) && "briup".equals(passwd)) {
                System.out.println("登录成功!");
            }else {
                //抛出运行时异常
                throw new RuntimeException("用户名或密码录入有误");
            }
        }
    }
```
运行结果：
![手动抛出异常](./案例2运行结果.png)
注意，此时方法中抛出的是一个运行时异常，编译器不会做出检查，所以代码可以正常的编译运行，但是运行的时候，如果用户名密码匹配失败，则抛出异常。

如果抛出的是编译时异常，则编译器会检查，代码无法通过编译，具体如下：
![手动抛出异常](./手动抛出异常.png)

如果要解决上述编译问题，需要程序员修改代码，有2种方式解决：
* 声明当前方法不对该异常处理，继续抛出异常，给上一级处理
* 主动捕获异常并处理
具体内容下一章节讲解。

# 异常处理
代码中出现了异常，除了默认的处理方式外，我们还可以手动处理异常:
* 声明继续抛出异常，借助throws关键字实现
* 捕获并处理异常，借助try、catch、finally关键字实现
  
## thorws
throws关键字用于在方法声明中指定该方法可能抛出的异常类型。

这个声明的目的，就是告诉方法的调用者，你调用我的这个方法的时候要小心啦，方法在运行的时候**可能**会抛出指定类型的异常。

#### 定义格式
```java
    [修饰符] 返回值类型 方法名(形参列表) throws 异常类名1,异常类名2... {
        方法体语句;
    }
```

#### 案例展示：
使用throws关键字解决上述案例中编译报错的问题。
![手动抛出异常](./thorws.png)
分析上述代码可知，login方法中虽然存在编译时异常，但程序员借助throws关键字告诉编译器，login方法中如果出现Exception异常则主动抛出，传递给上一级，所以login方法可以通过编译。

>main方法中第13行之所以编译出错，是因为第13行可能会出现编译时异常，程序员必须主动处理该异常才可以：要么继续throws抛出，要么主动捕获处理（后续课程讲解）。

main方法借助throws声明抛出Exception解决异常：
![main方法借助throws声明抛出Exception解决异常](./main方法借助throws声明抛出Exception解决异常.png)
**运行结果：**
![手动抛出异常](./手动抛出异常运行结果.png)

