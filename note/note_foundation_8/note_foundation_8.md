<!--
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-10 11:06:30
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-10 21:30:41
 * @: 無限進步
-->
# 多线程
## 进程线程 
### 进程
进程指一个内存中运行的应用程序，它是系统运行程序的基本单位。

一个程序从创建、运行到消亡，这样整个过程就是一个进程。

一个操作系统中可以同时运行多个进程，每个进程运行时，系统都会为其分配独立的内存空间。
![图片1](./图片1.png)
在操作系统中，启动一个应用程序的时候，会有一个或多个进程同时被创建，这些进程其实就表示了当前这个应用程序，在系统中的资源使用情况以及程序运行的情况。如果关闭这个进程，那么对应的应用程序也就关闭了。

### 线程
线程是进程中的一个执行单元，负责当前进程中程序的执行，一个进程中至少有一个线程，一个进程中也可以有多个线程，此时这个应用程序就可以称之为多线程程序。
![图片2](./图片2.png)
<font color=red>**结论：一个程序运行后至少有一个进程，一个进程中可以包含一个(main线程)或多个线程！**</font>

当一个进程中启动了多个线程去分别执行代码（同时完成多个功能）的时候，这个程序就是多线程程序，内存等资源使用情况如下：
![图片3](./多线程内存资源分配.png)

<font color = red>JVM是多线程的吗？</font>

是，JVM可以在运行程序的同时，进行GC垃圾回收，同一时刻做不同事情。案例:
```java
    public class Test01_JVM {
    public static void main(String[] args) throws 
        InterruptedException {
        for(int i = 1; i < 1000000; i++) 
            new Test(i);
            //main线程休眠3s
            Thread.sleep(3000);
            System.err.println("main end...");
        }
    }
    class Test {
        int n;
        public Test(int n) { 
            this.n = n;
        }
        //当GC进行垃圾回收指定对象的时候，对象的finalize方法会被自动调用
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Test被销毁, n: " + n);
            super.finalize();
        }
    }
```
##  并发并行
* **并发**：指两个或多个事件在**同一个时间段内**发生
  
    线程的**并发**执行，是指在一个时间段内（微观），<font color=red>俩个或多个线程，使用同一个CPU交替运行。</font>

![并发](./并发.png)

* 并行：指两个或多个事件在**同一时刻**发生（同时发生）
  
    线程的**并行**执行，是指在同一时刻，俩个或多个线程，<font color = red>各自使用一个CPU同时运行。</font>
  
![并行](./并行.png)

>如果计算机是单核CPU的话，那么同一时刻只能有一个线程使用CPU来执行代码
>
> 如果计算机是多核CPU的话，那么同一时刻有可能是俩个线程同时使用不同的CPU执行代码

<font color=red>注意：当前章节讨论的是并发多线程。</font>

**补充内容：**

>如果我们的计算机是多核的，在程序中编写了俩个线程，然后启动并运行它们，计算机会用一个CPU运行还是两个CPU去运行，我们无法知道也无法控制，因为计算机内核中有专门的资源调度算法负责资源的分配，我们从应用程序的层面无法干涉。

## 线程调度
### 时间片
并发多线程只有一个CPU，某个微观时刻，当指定线程拥有CPU的使用权，则该线程代码就可以执行，而其他线程阻塞等待。

一个线程不可能一直拥有CPU的使用权，不可能一直执行下去，它拥有CPU执行的时间是很短的，微秒纳秒级别，这个时间段我们就称之为CPU时间片。

线程执行时如果一个时间片结束了，则该线程就会停止运行，并交出CPU的使用权，然后等待下一个CPU时间片的分配。

在宏观上，一段时间内，我们感觉俩个线程在同时运行代码，其实在微观中，这俩个线程在使用一个CPU的时候，它们是交替着运行的，每个线程每次都是运行一个很小的时间片，然后就交出CPU使用权，只是它们俩个交替运行的速度太快了，给我们的感觉，好像是它们俩个线程在同时运行。

<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>淡绿背景示例</title>
    <style>
        .light-green-background {
            background-color: #ccffcc; /* 设置背景颜色为淡绿色 */
        }
    </style>
</head>
<body>
    <p class="light-green-background">
        思考，生活中还有哪些是因为速度太快，从而通过我们的眼睛“欺骗”了我们的情况？
    </p>
</body>
</html>