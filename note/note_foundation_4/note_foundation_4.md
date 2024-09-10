<!--
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-06 08:38:30
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-10 15:10:21
-->
# 2024年秋季 - Java基础课用笔记
# 面向过程
    强调按步骤实现功能，先分析解决问题要经过的步骤，然后定义方法实现，每个步骤的功能，然后依次调用方法，去解决问题
# 面向对象
    将大问题拆分成小问题，借助不同对象去解决，最终实现功能
- 面向对象的语言特征
- 面向对象语言的三大特征
  - 继承、封装、多态
## 对象的理解
  - 任何事物都是一个对象（object）
  - 对象由对象组成
  - 每个对象都有属性
  - 具有相同属性和行为的对象可以归为一类
## 类的定义
  - 具有相似属性和行为的对象可以归为一类，类在java中是一种数据类型
### 类的组成
- 属性
  - 这类事务的静态特征
- 行为（方法）
  - 事物所具有的动态功能\
***类***是对现实生活中，具有共同属性和行为的事物的抽象\
**类**是**对象**的数据类型
**类**是对象的抽象，而**对象**是类的实例\
**类**是抽象的，而**对象**是具体的\
 ***对象***是类在程序中创建的实例
- 类的定义格式
  ```java

  public 权限修饰符 class 数据类型 Test 类名{
    // 属性
    权限修饰符 数据类型 变量名；
    public int a;
    // 功能（方法、行为）
    权限修饰符 返回值数据类型 方法名(形参列表){
      // 方法体语句
    }
    // 构造器、构造方法 创建对象需要用到
  }
    ```


  - 变量类型
  - 成员变量
    - 定义在类中，方法外；
    - 在堆内存
    - 成员变量具有默认值
    - 生命周期：随着对象的存在而存在
  - 局部变量
    - 定义在方法中，或者方法的形参列表上；
    - 在栈内存
    - 没有默认值
    - 生命周期：随着方法的调用而生成，方法调用完毕消失

### 封装
  - 是面向对象语言的三大特征，另外两个是继承和多态
  - 封装 
    - 隐藏对象的属性和实现的细节 仅对外提供公共的访问方式
    - 提高安全性
    - 用户不需要知道内部具体复杂的实现。只需要使用对应的功能即可
  - 封装的原则
    - 把不需要对外提供的内容隐藏起来
    - 把属性隐藏掉，提供方法来修改，保证数据的安全
      - 属性：
    ``` 
      - 余额
      stu1.name = "张三";
      card.balance = 10000;
    ```
  - 封装的实现
    1. 用 private 修饰成员属性（成员变量）
    2. 提供对应的公开的 public set和public get方法

- this关键字
  - this关键字可以用来区分局部变量和成员变量
      ```
      public void setId(String id){
        this.id = id; // this.id 就是成员变量
      }
      public void setId(String newId){
        id = newId; // id 就是成员变量
      }
      ```

- 构造函数（构造方法）
  - 构造方法可以对对象进行初始化操作
  - 当为对象开辟内存空间时，就给对象的成员变量赋初始值
  - 在创建对象的时候，每创建一次对象就会执行一次构造方法
  - 构造方法不能手动调用
  - 用户如果没有写无参构造器，那么系统会默认提供一个；
  - 当用户有写无参构造器，系统不提供了。
  - 在构造方法中，可以借助this调用其他构造方法，
  - 必须放到构造方法中的第一行有效代码上
- 构造方法的格式
    ```java
    public class Test{
      //无参构造方法
      public Test(){
        System.out.println("无参构造方法");
      }

      //有参构造方法
      public Test(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("有参构造方法");
      }
    }
    ```

    - 随课笔记
  
    ```java
            public class Account {
            private String id;//卡号
            private double balance;//余额
            private String userName;

            // 构造方法 - 无参 - 无参构造器
            public Account(){
                System.out.println("调用了Account的无参构造器");
            }

            //构造方法 - 有参 - 有参构造器
            public Account(String id, double balance){
                this.id = id;
                this.balance = balance;
            }

            public Account(String userName ,String id ,double balance) {
                //必须是第一行有效代码
                this(id,balance);
                this.userName = userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public String getUserName() {
                return userName;
            }

            public void setId(String id) {
                this.id = id;
            }

            public void setBalance(double balance) {
                this.balance = balance;
            }

            public String getId(){
                return id;
            } 

            public double getBalance(){
                return balance;
            }

        }
    ``` 

#### 内存图
  ![上面代码的内存图](./类内存图.png)
  
- java程序 一般会有测试类和基础类的区分
  - 测试类
    - 包含main方法，作为程序入口
  - 基础类
    - Student
    - Teacher
    - Table类
