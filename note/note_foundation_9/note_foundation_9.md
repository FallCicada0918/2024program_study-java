<!--
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-12 09:53:57
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-12 14:47:16
 * @: 無限進步
-->
# File类、IO流

## File类

### 概述

`java.io.File` 类是文件和目录路径名的抽象表示，主要用于文件和目录的创建、查找和删除等操作。

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
>
>1. 一个File对象代表硬盘中实际存在的一个文件或者目录。
>2. 无论该路径下是否存在文件或者目录，都不影响File对象的创建。

