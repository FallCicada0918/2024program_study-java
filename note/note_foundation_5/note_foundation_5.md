<!--
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-19 16:51:19
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-23 19:11:14
-->

# 2024年秋季 - Java基础课用笔记

# `abstract`(抽象)

### 抽象的概念

抽象是一种将复杂概念简化为更易于理解和处理的方式。在编程中，它允许我们关注问题的关键特征，而忽略具体实现细节。Java中的抽象是通过定义抽象类和抽象方法来实现的。

### 抽象方法

* 将共同的方法抽取到父类中后，发现这个方法在父类中没有具体的实现逻辑，无法具体的实现逻辑，无法具体实现，此时就可以把这个方法定义为抽象方法
* 抽象方法只有声明没有实现
* 非抽象子类必须重写父类所有的抽象方法
  ```java
  报错信息：Cat不是抽象
  ```

#### 抽象方法定义格式：

```java
public abstract 返回值类型 方法名(参数列表);
```

### 抽象类

如果一个类包含至少一个抽象方法，那么这个类必须声明为抽象类。抽象类也不能被实例化，也就是说不能直接创建它的对象。然而，它可以有子类来继承这些抽象方法，并提供具体的实现。

#### 抽象类的特点

- 抽象类必须使用 `abstract` 关键字修饰。
- 相对于普通类，抽象类具有包含抽象方法的能力。
- 抽象类不能被实例化创建对象。

#### 普通类与抽象类的对比

- 抽象类与普通类一样遵守继承关系，能够使用多态机制。
- 子类可以重写从抽象类继承的方法。
- 实例化子类对象时，需要借助父类构造器来初始化父类的部分。

#### 抽象类定义格式：

```java
[权限修饰符] abstract class 类名{
    0或多个数据成员
    0或多个构造方法
    0或多个成员方法
}
```

#### 抽象类和抽象方法的关系

- 如果一个类包含至少一个抽象方法，那么这个类必须声明为抽象类。
- 抽象类可以包含也可以不包含抽象方法。
- 包含抽象方法的类，一定要声明为抽象类。

#### 抽象类与普通类的*区别*

1. **抽象类**必须使用 `abstract`修饰符。
2. **抽象类**相比普通类，多了包含抽象方法的能力。
3. **抽象类**失去了实例化创建对象的能力。

#### 抽象类与普通类的*共同点*

1. 可以继承、多态、重写、有构造器、有成员变量、方法
2. 子类可以重写从抽象类继承的方法。
3. 实例化子类对象需要借助父类构造器实现父类部分的初始化。

### 示例代码:动物类

假设我们要定义一个动物类 `Animal`，其中包含两个抽象方法 `eat()`和 `sleep()`，然后定义两个子类 `Cat`和 `Dog`分别重写这些方法。

```java
public abstract class Animal {
    // 抽象方法，用于定义动物的进食行为
    public abstract void eat();

    // 抽象方法，用于定义动物的睡眠行为
    public abstract void sleep();
}

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("躺着睡");
    }
}

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    @Override
    public void sleep() {
        System.out.println("趴着睡");
    }
}

public class TestAbstract {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.eat();
        cat.sleep();

        Animal dog = new Dog();
        dog.eat();
        dog.sleep();
    }
}
```

在这个例子中，`Animal`是一个抽象类，因为它包含两个抽象方法 `eat()`和 `sleep()`。`Cat`和 `Dog`是 `Animal`的子类，它们都提供了各自的实现版本的 `eat()`和 `sleep()`方法。在主方法中，我们可以使用 `Animal`类型的引用指向子类对象，并调用它们的方法，体现了多态性。

### 应用示例：形状类

下面是一个关于形状类的例子，演示了如何使用抽象方法和抽象类：

```java
// 定义形状类，因为该类中包含了抽象方法，则该类必须声明为抽象类
abstract class Shape {
    private String name;

    public Shape() {
        System.out.println("Shape()...");
    }

    public Shape(String name) {
        System.out.println("Shape(String)..."); 
        this.name = name;
    }

    // 定义抽象方法，获取形状的面积
    // 因为现在形状不确定，获取面积的功能实现也是不确定的，故而定义为抽象方法
    public abstract double getArea();
}

// 正常子类：必须重写所有抽象方法
class Circle extends Shape {
    // 半径
    private int radius;

    public Circle() {
        super();
        System.out.println("Circle()...");
    }

    // 子类构造器需要借助抽象父类构造器，完成父类部分的初始化
    public Circle(String name, int radius) {
        super(name);
        System.out.println("Circle(String, int)..."); 
        this.radius = radius;
    }

    // 重写抽象方法
    @Override
    public double getArea() {
        return Math.PI * radius * radius; // 使用Math.PI代替3.14
    }
}

public class Test013_AbstractBasic {
    public static void main(String[] args) {
        // 抽象类不能实例化对象
        //Shape shape = new Shape(); // 错误

        // 抽象类引用可以指向子类（非抽象类）对象
        Shape circle = new Circle("圆形", 2);

        // 多态应用
        double area = circle.getArea();
        System.out.println("area:" + area);
    }
}
```

在这个例子中，`Shape` 是一个抽象类，它有一个抽象方法 `getArea()`。`Circle` 类继承了 `Shape` 并实现了 `getArea()` 方法，这样每个 `Circle` 对象就能计算出自己的面积。主方法展示了如何创建 `Circle` 的实例，并打印出它的面积。

# `interface`接口

### 接口的概念与作用

接口（Interface）是Java中的一种重要抽象机制，它提供了一种定义行为规范和实现多态性的方式。接口使得代码更加灵活，提高了代码的可扩展性、可维护性和灵活性。接口是对Java单继承机制的补充，允许一个类实现多个接口，从而获得多种行为。

### 特点

> 引用数据类型中的一种：类 接口 数组
>
>> java中的接口是对单继承的一个补充，在开发过程中想增强类的功能，可以借助接口去实现，接口是多实现（比如一个人可以有多个老师）
>> 接口文件编译后生成.class 但是接口和类不是同一种东西
>> public interface IAction {}
>> 注意1， 定义类使用关键字 class ，定义接口使用关键字 interface
>> 注意2，接口中的数据成员，默认 public static final 修饰，是常量，名称一般全大写
>> 注意3，接口中的方法，默认 public abstract 修饰，是抽象方法
>> 接口和类不一样，接口不可以实例化对象，没有构造方法
>> 接口是用来实现的，而不是继承
>> 接口是多实现的，但是
>> 接口的实现类要重写接口的所有抽象方法
>> Java中类的继承是单继承，接口和接口之间是多继承
>>

### 类与接口的区别

- 类与类之间是单继承、但是是多层继承
  - 类与接口之间是实现关系，一个类可以在继承一个类的情况下，同时实现多个接口
  - 接口和接口之间的关系
    - 继承关系，可以单继承，也可以多继承

### 接口的新特性

- jdk8中，接口可以添加默认方法和静态方法，
- 但是静态方法，只能通过接口名调用
- jdk9中，接口中可以添加私有方法，在jdk1.8中报错

### 使用接口时需要注意的几点

#### 接口定义

1. **定义格式**：接口使用 `interface`关键字定义，接口中的方法默认为 `public abstract`，接口中的变量默认为 `public static final`，即常量。
2. **常量命名**：接口内的常量命名通常使用全大写字母，并用下划线分隔单词。
3. **方法定义**：接口中的方法只需要声明而不需实现（没有方法体）。
4. **继承**：Java中類的繼承是但繼承，接口可以被其他接口继承，接口与接口之间可以实现多继承，这弥补了Java类的单继承限制。

#### 接口实现

1. **实现类**：一个类实现接口需要使用 `implements`关键字，并且需要重写接口中所有的抽象方法。接口是用来实现的不是用来继承的
2. **多实现**：一个类可以同时实现多个接口，实现多个接口时使用逗号分隔。
3. **抽象类实现接口**：抽象类可以实现接口，但是并不需要重写接口中的所有方法，因为抽象类本身也不会被实例化。
4. **构造函数**：接口没有构造函数，因为接口不能被实例化。

#### 接口使用

1. **接口引用**：接口不能直接实例化，但可以用接口类型的引用指向其实现类的对象。
2. **多态性**：接口支持多态性，即可以用接口类型的引用指向不同的实现类对象，并通过接口类型的引用调用方法，编译时检查类型是接口类型，运行时则根据对象的实际类型确定具体的行为。
3. ***接口新特性***
4. **静态方法和默认方法**：从JDK 8开始，接口可以包含静态方法和默认方法（用 `default`关键字定义），静态方法可以通过接口名直接调用，而默认方法在实现类中可以被重写，静态方法只能用接口名引用。
5. **私有方法**：从JDK 9开始，接口支持私有方法，可以用来辅助实现接口中的默认方法或抽象方法,在jdk41.8中报错。

### 数据类型

##### 基本数据类型

###### 引用数据类型

类　接口　数组

##### 示例代码

下面是一个接口使用的示例代码，展示了如何定义接口、实现接口以及在不同场景下的使用：

```java
interface IAction {
    int NUM = 10;
    void start();
    public abstract void end();
}

// 定义接口的实现类
class ActionImpl implements IAction {
    @Override
    public void start() {
        System.out.println("start开始执行");
    }

    @Override
    public void end() {
        System.out.println("执行完成，end结束");
    }
}

public class Test021_Basic {
    public static void main(String[] args) {
        // 接口不可以实例化对象
        //IAction ac= new IAction(); // error
        // 接口引用指向实现类对象
        IAction ac = new ActionImpl();
        // 接口中数据成员默认 public static final，故而下行编译报错
        //IAction.NUM = 20;
        System.out.println(IAction.NUM);
        ac.start();
        ac.end();
    }
}
```

在这个例子中，`IAction`是一个接口，它包含两个方法 `start()`和 `end()`。`ActionImpl`类实现了这个接口，并提供了方法的具体实现。主方法中创建了 `ActionImpl`的一个实例，并通过接口类型的引用 `ac`调用了这些方法。

##### 接口多态

接口支持多态，这意味着接口类型的引用可以指向任何实现了该接口的类的对象。在编译时，检查类型是接口类型；而在运行时，会根据对象的实际类型确定具体的行为。

```java
// 测试类
public class Test024_Monkey {
    public static void main(String[] args) {
        // 抽象类引用可以指向子类对象
        Animal2 a = new Monkey("yellow", 2, "小悟空");
        a.eat();
        a.sleep();
  
        // 接口引用指向实现类对象
        ICycleAble c = new Monkey("yellow", 5, "马戏团小猴");
        c.cycle();
  
        // 类型转换，访问其他接口或父类方法
        if (c instanceof Monkey) {
            Monkey m = (Monkey) c;
            m.eat();
            m.sleep();
        }
    }
}
```

这个例子中，`Animal2`是一个抽象类，`Monkey`继承了 `Animal2`并且实现了 `ICycleAble`接口。主方法中通过接口类型的引用 `c`调用了 `cycle()`方法，并通过类型转换访问了 `Monkey`类的其他方法。

### 接口的定义与格式

接口定义通常包含方法声明（没有方法体）、常量声明以及其他成员声明。定义接口使用 `interface`关键字。

接口定义的基本格式如下：

```java
[修饰符] interface 接口名 {
    // 数据成员，默认为 public static final
    [public static final] 数据类型 数据成员 = 值;

    // 抽象方法，默认为 public abstract
    [public abstract] 返回值类型 方法名(形参列表);
}
```

### 接口中的成员特点

- **数据成员**：接口中的数据成员默认为 `public static final`，即常量，名称一般全大写。
- **方法**：接口中的方法默认为 `public abstract`，即抽象方法。

### `JDK 8` 与 `JDK 9` 中接口的新特性

- **默认方法**：在 `JDK 8`中，允许在接口中定义默认方法，使用 `default`关键字，这样在不修改现有类的情况下可以添加新方法。
- **静态方法**：`JDK 8`中还可以定义静态方法，但不能通过接口引用调用，只能通过接口名调用。
- **私有方法**：`JDK 9`中引入了接口中定义私有方法的能力，使得接口能更好地控制内部实现细节。

### 接口实现

Java中的类和类之间是继承关系，且只能单继承；类和接口之间是实现关系，通过 `implements`关键字表示，可以是单实现或多实现。子类还可以在继承一个父类的同时实现多个接口。

接口实现类定义格式如下：

```java
[修饰符] class 类名 implements 接口名1, 接口名2, ...
```

实现类需要重写接口中所有的抽象方法。如果实现类本身是抽象类，则不需要全部重写。

### 示例代码

#### 定义接口

```java
interface IAction {
    int NUM = 10;
    void start();
    public abstract void end();
}
```

此接口定义了一个名为 `IAction`的接口，包含一个常量 `NUM`和两个抽象方法 `start()`和 `end()`。

#### 实现接口

```java
class ActionImpl implements IAction {
    @Override
    public void start() {
        System.out.println("start开始执行");
    }

    @Override
    public void end() {
        System.out.println("执行完成，end结束");
    }
}
```

这个类 `ActionImpl`实现了 `IAction`接口，并提供了 `start()`和 `end()`的具体实现。

#### 测试接口实现

```java
public class Test021_Basic {
    public static void main(String[] args) {
        IAction ac = new ActionImpl();
        System.out.println(IAction.NUM);
        // 接口中数据成员默认 public static final，故而下行编译报错
        // IAction.NUM = 20;
        ac.start();
        ac.end();
    }
}
```

在这段测试代码中，创建了一个 `ActionImpl`的实例，并通过接口引用 `ac`调用了方法 `start()`和 `end()`。此外，尝试改变接口中的常量值会导致编译错误。

### 接口部分的代码示例

#### 接口基础定义与实现

首先，定义了一个接口 `IAction`，该接口定义了两个方法 `start()`和 `end()`，以及一个常量 `NUM`。

```java
package com.briup.chap07.test;

interface IAction {
    int NUM = 10;
    void start();
    public abstract void end();
}
```

接着，定义了一个类 `ActionImpl`来实现 `IAction`接口，并提供了具体的方法实现。

```java
class ActionImpl implements IAction {
    @Override
    public void start() {
        System.out.println("start开始执行");
    }

    @Override
    public void end() {
        System.out.println("执行完成，end结束");
    }
}
```

在测试类 `Test021_Basic`中，创建了 `ActionImpl`的实例，并通过接口引用 `ac`来调用方法 `start()`和 `end()`。

```java
public class Test021_Basic {
    public static void main(String[] args) {
        IAction ac = new ActionImpl();
        System.out.println(IAction.NUM);
        System.out.println(ac.NUM); // 编译错误
        ac.start();
        ac.end();
    }
}
```

这段代码展示了如何定义接口和实现接口，以及如何通过接口引用调用实现类的方法。

#### 接口继承

接口之间可以相互继承，这样可以实现接口的功能扩展。以下是一个接口继承的例子：

```java
interface Runable {
    void run();
}

interface Flyable {
    void fly();
}

interface Action extends Runable, Flyable {
    void sing();
}
```

在这个例子中，`Action`接口继承了 `Runable`和 `Flyable`接口，并且增加了一个新的方法 `sing()`。

#### 接口实现类定义

接下来定义了一个抽象父类 `Animal2`，以及两个接口 `IJumpAble`和 `ICycleAble`，然后定义一个猴子类 `Monkey`继承 `Animal2`并且实现了这两个接口。

```java
abstract class Animal2 {
    private String color;
    private int age;

    public Animal2() {}

    public Animal2(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public abstract void eat();
    public abstract void sleep();
}

interface IJumpAble {
    void jump();
}

interface ICycleAble {
    public abstract void cycle();
}

class Monkey extends Animal2 implements ICycleAble, IJumpAble {
    private String name;

    public Monkey() {}

    public Monkey(String color, int age, String name) {
        super(color, age);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("猴子" + name + "喜欢吃大桃子");
    }

    @Override
    public void sleep() {
        System.out.println("猴子" + name + "趴着睡");
    }

    @Override
    public void jump() {
        System.out.println("猴子" + name + "跳火圈");
    }

    @Override
    public void cycle() {
        System.out.println("猴子" + name + "骑自行车");
    }
}
```

这个例子展示了如何在一个类中实现多个接口，并且继承一个抽象类，同时也展示了接口的继承和实现。通过 `Monkey`类，可以看到它继承了 `Animal2`抽象类，并实现了 `IJumpAble`和 `ICycleAble`两个接口，提供了具体的方法实现。

### 总结

接口在Java中提供了一种定义行为规范的方式，允许类通过实现接口来获得多种行为。接口可以包含抽象方法和常量定义，并且在JDK 8及以后版本中还可以包含默认方法和静态方法。通过接口实现，可以提高代码的复用性和扩展性。

# 内部类概述

## ***定义：***

在一个类的内部定义零为一个类，这就是内部类。

### 分类

- 成员内部类
- 静态内部类
- 局部内部类
- 匿名内部类

### 成员内部类

成员内部类作为外部类的一个成员定义，可以直接访问外部类的成员，包括私有的成员。

#### 成员内部类定义格式

```java
[修饰符] class 外部类 {
    // 外部类的成员
    [权限修饰符] class 内部类 {
        // 内部类的成员
    }
}
```

#### 成员内部类实例化格式

```java
外部类名.内部类名 对象名 = 外部类对象.new 内部类();
```

#### 成员内部类示例

```java
package com.briup.chap07.test;

class Outer {
    private int o_num = 10;
    private int num = 20;

    class Inner {
        private int i_num = 30;
        private int num = 40;

        void show() {
            System.out.println("in Inner,o_num:" + o_num);
            int num = 50;
            System.out.println("in Inner,num:" + num);
            System.out.println("in Inner,num:" + this.num);
            System.out.println("in Inner,num:" + Outer.this.num);
        }
    }

    public void disp() {
        Outer.Inner inn = this.new Inner();
        System.out.println("in Outer, i_num:" + inn.i_num);
        Inner inn2 = new Inner();
        System.out.println("inn2.i_num:" + inn2.i_num);
    }
}

public class Test031_Member {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner inn = out.new Inner();
        inn.show();
        Outer.Inner inn2 = new Outer().new Inner();
        inn2.show();
    }
}
```

在这个示例中，`Outer`类包含了一个成员内部类 `Inner`。`Inner`类可以访问 `Outer`类的所有成员，包括私有的。

### 静态内部类

静态内部类使用 `static`关键字定义，可以拥有 `static`成员或方法。

#### 静态内部类定义格式

```java
[修饰符] class 外部类 {
    // 外部类的成员
    static class 内部类 {
        // 内部类的成员
    }
}
```

#### 静态内部类示例

```java
package com.briup.chap07.test;

class Outer2 {
    private int o_num = 10;
    private static int s_num = 20;

    static class Inner {
        private int i_num = 30;
        private static int is_num = 40;

        public static void sFun() {
            System.out.println("Outer2 s_num:" + Outer2.s_num);
        }

        void show() {
            System.out.println("in Inner, num:" + this.i_num);
            System.out.println("in Inner, is_num:" + Inner.is_num);
        }
    }

    public void disp() {
        Outer2.Inner inn = new Outer2.Inner();
        System.out.println("in Outer, i_num:" + inn.i_num);
        System.out.println("in Outer, is_num:" + Outer2.Inner.is_num);
    }
}

public class Test032_Static {
    public static void main(String[] args) {
        Outer2.Inner.sFun();
        Outer2.Inner inn = new Outer2.Inner();
        inn.show();
        Outer2 outer = new Outer2();
        outer.disp();
    }
}
```

在这个示例中，`Outer2`类包含了一个静态内部类 `Inner`。`Inner`类可以拥有 `static`成员，并且它的 `static`方法只能访问外部类的 `static`成员。

### 局部内部类

局部内部类是在外部类的方法内部定义的类，其作用域仅限于该方法内部。

#### 局部内部类定义格式

```java
[修饰符] class 外部类 {
    [修饰符]返回值类型 方法名(形式参数列表) {
        // 功能实现省略...
        class 内部类名 {
            // 内部类的成员
        }
    }
}
```

#### 局部内部类示例

```java
package com.briup.chap07.test;

class Outer3 {
    private int num = 10;

    public void innerFun() {
        final int num = 20;

        class Inner {
            private int i_num = 30;

            public void test() {
                System.out.println("局部变量num:" + num);
                System.out.println("内部类成员变量this.i_num:" + this.i_num);
                System.out.println("外部类成员变量Outer3.this.num:" + Outer3.this.num);
            }
        }

        Inner inn = new Inner();
        System.out.println(inn.i_num);
        inn.test();
    }
}

public class Test033_Local {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        outer.innerFun();
    }
}
```

在这个示例中，`Outer3`类包含了一个局部内部类 `Inner`，它只能在其方法 `innerFun`内部使用。

### 匿名内部类

匿名内部类是没有名字的内部类，通常用于简化代码，特别是在实现接口时。

#### 匿名内部类定义格式

```java
new 接口或抽象类() {
    方法体实现
};
```

#### 匿名内部类示例

```java
package com.briup.chap07.test;

interface ISleep {
    void sleep();
}

public class Test034_Interface {
    public static void main(String[] args) {
        ISleep s1 = new ISleep() {
            @Override
            public void sleep() {
                System.out.println("躺着睡");
            }
        };
        s1.sleep();
  
        ISleep s2 = new ISleep() {
            @Override
            public void sleep() {
                System.out.println("趴着睡");
            }
        };
        s2.sleep();
  
        new ISleep() {
            @Override
            public void sleep() {
                System.out.println("水里面睡");
            }
        }.sleep();
    }
}
```

在这个示例中，定义了一个接口 `ISleep`，并使用匿名内部类实现了该接口的 `sleep`方法。

### 内部类概述

内部类是定义在一个类内部的类。内部类可以根据其定义的位置分为成员内部类、静态内部类、局部内部类和匿名内部类。

### 成员内部类

成员内部类作为外部类的一个成员定义，可以直接访问外部类的成员，包括私有的成员。

#### 成员内部类定义格式

```java
[修饰符] class 外部类 {
    // 外部类的成员
    [权限修饰符] class 内部类 {
        // 内部类的成员
    }
}
```

#### 成员内部类实例化格式

```java
外部类名.内部类名 对象名 = 外部类对象.new 内部类();
```

#### 成员内部类示例

```java


class Outer {
    private int o_num = 10;
    private int num = 20;

    class Inner {
        private int i_num = 30;
        private int num = 40;

        void show() {
            System.out.println("in Inner,o_num:" + o_num);
            int num = 50;
            System.out.println("in Inner,num:" + num);
            System.out.println("in Inner,num:" + this.num);
            System.out.println("in Inner,num:" + Outer.this.num);
        }
    }

    public void disp() {
        Outer.Inner inn = this.new Inner();
        System.out.println("in Outer, i_num:" + inn.i_num);
        Inner inn2 = new Inner();
        System.out.println("inn2.i_num:" + inn2.i_num);
    }
}

public class Test031_Member {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner inn = out.new Inner();
        inn.show();
        Outer.Inner inn2 = new Outer().new Inner();
        inn2.show();
    }
}
```

在这个示例中，`Outer`类包含了一个成员内部类 `Inner`。`Inner`类可以访问 `Outer`类的所有成员，包括私有的。

### 静态内部类

静态内部类使用 `static`关键字定义，可以拥有 `static`成员或方法。

#### 静态内部类定义格式

```java
[修饰符] class 外部类 {
    // 外部类的成员
    static class 内部类 {
        // 内部类的成员
    }
}
```

#### 静态内部类示例

```java
package com.briup.chap07.test;

class Outer2 {
    private int o_num = 10;
    private static int s_num = 20;

    static class Inner {
        private int i_num = 30;
        private static int is_num = 40;

        public static void sFun() {
            System.out.println("Outer2 s_num:" + Outer2.s_num);
        }

        void show() {
            System.out.println("in Inner, num:" + this.i_num);
            System.out.println("in Inner, is_num:" + Inner.is_num);
        }
    }

    public void disp() {
        Outer2.Inner inn = new Outer2.Inner();
        System.out.println("in Outer, i_num:" + inn.i_num);
        System.out.println("in Outer, is_num:" + Outer2.Inner.is_num);
    }
}

public class Test032_Static {
    public static void main(String[] args) {
        Outer2.Inner.sFun();
        Outer2.Inner inn = new Outer2.Inner();
        inn.show();
        Outer2 outer = new Outer2();
        outer.disp();
    }
}
```

在这个示例中，`Outer2`类包含了一个静态内部类 `Inner`。`Inner`类可以拥有 `static`成员，并且它的 `static`方法只能访问外部类的 `static`成员。

### 局部内部类

局部内部类是在外部类的方法内部定义的类，其作用域仅限于该方法内部。

#### 局部内部类定义格式

```java
[修饰符] class 外部类 {
    [修饰符]返回值类型 方法名(形式参数列表) {
        // 功能实现省略...
        class 内部类名 {
            // 内部类的成员
        }
    }
}
```

#### 局部内部类示例

```java
package com.briup.chap07.test;

class Outer3 {
    private int num = 10;

    public void innerFun() {
        final int num = 20;

        class Inner {
            private int i_num = 30;

            public void test() {
                System.out.println("局部变量num:" + num);
                System.out.println("内部类成员变量this.i_num:" + this.i_num);
                System.out.println("外部类成员变量Outer3.this.num:" + Outer3.this.num);
            }
        }

        Inner inn = new Inner();
        System.out.println(inn.i_num);
        inn.test();
    }
}

public class Test033_Local {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        outer.innerFun();
    }
}
```

在这个示例中，`Outer3`类包含了一个局部内部类 `Inner`，它只能在其方法 `innerFun`内部使用。

### 匿名内部类

匿名内部类是没有名字的内部类，通常用于简化代码，特别是在实现接口时。

#### 匿名内部类定义格式

```java
new 接口或抽象类() {
    方法体实现
};
```

#### 匿名内部类示例

```java
package com.briup.chap07.test;

interface ISleep {
    void sleep();
}

public class Test034_Interface {
    public static void main(String[] args) {
        ISleep s1 = new ISleep() {
            @Override
            public void sleep() {
                System.out.println("躺着睡");
            }
        };
        s1.sleep();
  
        ISleep s2 = new ISleep() {
            @Override
            public void sleep() {
                System.out.println("趴着睡");
            }
        };
        s2.sleep();
  
        new ISleep() {
            @Override
            public void sleep() {
                System.out.println("水里面睡");
            }
        }.sleep();
    }
}
```

在这个示例中，定义了一个接口 `ISleep`，并使用匿名内部类实现了该接口的 `sleep`方法。

## ***课述***

```java
成员内部类
  在类中，可以定义成员属性、成员方法，还可以定义成员内部类
  在内部类中不能定义静态成员变量和成员方法
  实例化一个内部类 Inner 的对象
    外部类名.内部类名 对象名 = 外部类对象.内部类对象;
    Outer.Inner inner = new Outer().new Inner();
    Outer.Inner inn = this.new Inner();

    // 创建一个外部类的对象
    Outer out = new Outer();
    // 创建一个内部类的对象
    Outer.Inner inn = out.new Inner();
    Outer.Inner inn2 = new Outer().new Inner();
在外部类中实例化自己的成员内部类对象的3种方式
  1. Outer.Inner inner = new Outer().new Inner();
  2. Outer.Inner inner = this.new Inner();
  3. Inner inner = new Inner();
编译后，外部类和内部类都会生成字节码文件
  Outer.class
  Outer$Inner.class
内部类的使用：
  1. 比如ArrayList中 就有多个内部类的使用
  2. 类与类之间的包含关系 比如汽车类 包含发动机 发动机也是一个类 此时就可以使用内部类的概念来处理这种关系
静态内部类  
  用static修饰的成员内部类叫静态内部类
  静态内部类中成员方法，只能访问外部类中的静态成员或静态方法。
  在成员内部类中不能定义静态成员变量和成员方法，在静态内部类中，可以定义静态成员和静态方法
  外部类的方法是能访问静态内部类的所有成员和方法
局部内部类  
  在外部类的方法中定义的内部类，叫局部内部类，作用范围在当前方法中
  从内部类引用的本地变量必须是最终变量或实际上的最终变量 final

总结梳理程序启动后代码中的各种方法的执行顺序以及执行次数？
```

# `enum`(枚举)

枚举（Enum）是一种特殊的类，用来表示一组固定的常量集合。枚举类中的每一个枚举常量都是该枚举类型的对象。枚举在Java中是通过 `enum`关键字定义的，它继承自 `java.lang.Enum`类，因此可以使用一些内置的方法，比如 `name()`和 `ordinal()`等。

### 枚举定义

枚举定义的基本格式如下：

```java
[修饰符] enum 枚举类名 {
    枚举元素1, 枚举元素2, ..., 枚举元素n;
}
```

枚举元素可以看作是枚举类型的实例，它们都是 `final`的，且默认都是 `public static`的。

### 枚举的性质

- 枚举是一个类，因此可以有构造器、方法和成员变量。
- 枚举类会隐式地继承 `java.lang.Enum`类。
- 枚举元素默认是 `public static final`的，且不可变。
- 枚举类可以定义方法，也可以实现接口。
- 枚举类可以有构造器，但必须是私有的。

### 枚举的使用注意事项

- 枚举类可以实现接口，这样枚举元素就自动实现了这些接口。
- 枚举元素的名字默认为字符串形式。
- 枚举元素可以通过 `name()`方法获取其名称，通过 `ordinal()`方法获取其顺序索引。
- 枚举类中可以定义方法、构造器和成员变量，但构造器必须是私有的。
- 枚举元素可以被用来进行比较、排序等操作。

### 枚举示例代码

#### 定义枚举类

```java
package com.briup.chap07.test;

// 定义枚举类
enum Gender {
    MALE, FEMALE
}

public class Test071_EnumBasic {
    public static void main(String[] args) {
        // 枚举类实例化对象
        Gender g1 = Gender.MALE;
        Gender g2 = Gender.MALE;
        System.out.println(g1);
        System.out.println(g2);
        Gender g3 = Gender.FEMALE;
        Gender g4 = Gender.FEMALE;
        System.out.println(g3);
        System.out.println(g4);
        // 枚举对象的取值，只能是枚举元素
        // Gender g5 = Gender.BOY; // 错误用法
    }
}
```

在这个例子中，定义了一个枚举类 `Gender`，它包含两个枚举元素 `MALE`和 `FEMALE`。在主方法中，创建了枚举对象，并通过枚举元素的名字输出它们。

#### 枚举类分析

枚举类 `Gender`本质上是一个 `final`修饰的类，不可以被继承，并且会默认继承 `java.lang.Enum`类。枚举元素本质上是枚举类的对象，且由 `static`和 `final`修饰。枚举类提供私有构造器，不允许在类外主动创建枚举类对象。

#### 含有数据成员和构造方法的枚举类

```java
// 定义枚举类
enum Week {
    MON("星期一"), TUE("星期二"), WED("星期三");

    private String desc;

    private Week(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}

public class Test072_Define01 {
    public static void main(String[] args) {
        System.out.println(Week.MON.getDesc());
        System.out.println(Week.TUE.getDesc());
        System.out.println(Week.WED.getDesc());
    }
}
```

在这个例子中，枚举类 `Week`包含三个枚举元素 `MON`、`TUE`和 `WED`，每个元素都有一个描述字符串。通过构造器为每个枚举元素赋值，并通过方法 `getDesc()`获取描述信息。

### 总结

枚举是一种特殊的数据类型，用来表示一组固定的常量集合。枚举类可以定义方法、构造器和成员变量，并且可以实现接口。枚举元素默认是 `public static final`的，并且枚举类会隐式地继承 `java.lang.Enum`类。使用枚举可以提高代码的可读性和安全性。
