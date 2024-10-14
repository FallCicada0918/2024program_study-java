<!--
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-12 09:53:57
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-14 08:44:39
 * @: 無限進步
-->
# File类、IO流

## File类

### 概述

`java.io.File` 类是文件和目录路径名的抽象表示，主要用于文件和目录的创建、查找和删除等操作。

* input I 输入
* output O 输出
* streams 流
    * 字节流
    * 字符流

#### 构造方法
1. `File(String pathname)`：根据一个路径名创建一个File对象。
2. `File(String parent, String child)`：根据父目录路径名和子路径名创建一个File对象。
3. `File(URI uri)`：根据一个抽象路径名创建一个File对象。

```java
    package java.io;
    public class File implements Serializable, Comparable<File>{
        //通过将给定路径名字符串来创建新的 File实例
        public File(String pathname) {
            if (pathname == null) {
                throw new NullPointerException();
            }
                this.path = fs.normalize(pathname);
                this.prefixLength = fs.prefixLength(this.path);
            }
            //从**父抽象路径名和子路径名字符串**创建新的 File实例
        public File(String parent, String child) {
            //省略...
        }
        public File(File parent, String child) {
            //省略...
        }
            //省略...
    }
```
#### 实例对象
```java
    package com.briup.chap11.test;
 
    import java.io.File;
    
    public class Test011_File {
        public static void main(String[] args) {
            // 文件路径名
            String pathname = "D:\\aaa.txt";
            File file1 = new File(pathname);
    
            // 文件路径名
            String pathname2 = "D:\\aaa\\bbb.txt";
            File file2 = new File(pathname2);
    
            // 通过父路径和子路径字符串
            String parent = "D:\\aaa";
            String child1 = "bbb.txt";
            File file3 = new File(parent, child1);
    
            // 通过父级File对象和子路径字符串
            File parentDir = new File("D:\\aaa");
            String child2 = "bbb.txt";
            File file4 = new File(parentDir, child2);
        }
    }
```
>小贴士
>
>   1. 一个File对象代表硬盘中实际存在的一个文件或者目录。
>   2. 无论该路径下是否存在文件或者目录，都不影响File对象的创建。

### 使用
#### 路径获取
```java
    //File绝对路径名字符串
    public String getAbsolutePath();
    //File文件构造路径
    public String getPath();
    //File文件或目录的名称
    public String getName();
    //File文件或目录的长度
    public long length();
```

#### 代码案例
```java
    import java.io.File;
 
public class Test012_File {
    public static void main(String[] args) {
        //针对文件
        File f = new File("D:/aaa/Test1101_File.java");
        //返回此File的绝对路径名字符串
        System.out.println("文件绝对路径:" + f.getAbsolutePath());
        //将此File转换为路径名字符串
        System.out.println("文件构造路径:" + f.getPath());
        //返回由此File表示的文件或目录的名称
         System.out.println("文件名称:" + f.getName());
        //返回由此File表示的文件的长度
        System.out.println("文件长度:" + f.length() + "字节");
        //针对目录
        File f2 = new File("D:/aaa");
        System.out.println("目录绝对路径:" + 
        f2.getAbsolutePath());
        System.out.println("目录构造路径:" + f2.getPath());
        System.out.println("目录名称:" + f2.getName());
        System.out.println("目录长度:" + f2.length());
    }
}
        //输出结果
        文件绝对路径:D:\aaa\Test1101_File.java
        文件构造路径:D:\aaa\Test1101_File.java
        文件名称:Test1101_File.java
        文件长度:650字节
        目录绝对路径:D:\aaa
        目录构造路径:D:\aaa
        目录名称:aaa
        目录长度:0
```
> API中说明：length()，表示文件的长度。但是File对象表示目录，则返回值未指定。

2）路径操作
* 绝对路径：从盘符开始的路径，这是一个完整的路径。
* 相对路径：相对于项目目录的路径，这是一个便捷的路径，开发中经常使用 