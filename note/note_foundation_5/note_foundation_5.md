<!--
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-19 16:51:19
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-19 17:20:21
-->

# 2024年秋季 - Java基础课用笔记

# abstract(抽象)

### 抽象的概念

抽象是一种将复杂概念简化为更易于理解和处理的方式。在编程中，它允许我们关注问题的关键特征，而忽略具体实现细节。Java中的抽象是通过定义抽象类和抽象方法来实现的。

#### 抽象方法

抽象方法是在类中声明的方法，但它没有具体的实现（即没有方法体）。抽象方法的定义以关键字 `abstract`开始，后面跟方法签名，但没有方法体。任何包含抽象方法的类也必须声明为抽象类。

### 抽象的概念与特点

抽象是一种将复杂的概念和现实世界的问题简化为更易于理解和处理的表示方法。在面向对象编程中，抽象通过定义类、接口和方法来实现。特别是，抽象类和抽象方法允许开发者定义一种框架，子类可以在其中填充具体的实现细节。

##### 抽象方法定义格式：

```java
public abstract 返回值类型 方法名(参数列表);
```

#### 抽象类

如果一个类包含至少一个抽象方法，那么这个类必须声明为抽象类。抽象类也不能被实例化，也就是说不能直接创建它的对象。然而，它可以有子类来继承这些抽象方法，并提供具体的实现。

#### 抽象类的特点

- 抽象类必须使用 `abstract` 关键字修饰。
- 相对于普通类，抽象类具有包含抽象方法的能力。
- 抽象类不能被实例化创建对象。

#### 普通类与抽象类的对比

- 抽象类与普通类一样遵守继承关系，能够使用多态机制。
- 子类可以重写从抽象类继承的方法。
- 实例化子类对象时，需要借助父类构造器来初始化父类的部分。

#### 抽象类定义格式

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

#### 抽象类与普通类的区别

1. **抽象类**必须使用 `abstract`修饰符。
2. 抽象类相比普通类，多了包含抽象方法的能力。
3. 抽象类失去了实例化创建对象的能力。

#### 抽象类与普通类的共同点

1. 都符合继承关系的特点。
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

# interface接口

### 接口的概念与作用

接口（Interface）是Java中的一种重要抽象机制，它提供了一种定义行为规范和实现多态性的方式。接口使得代码更加灵活，提高了代码的可扩展性、可维护性和灵活性。接口是对Java单继承机制的补充，允许一个类实现多个接口，从而获得多种行为。

### 接口的定义与格式

接口定义通常包含方法声明（没有方法体）、常量声明以及其他成员声明。定义接口使用`interface`关键字。

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

- **数据成员**：接口中的数据成员默认为`public static final`，即常量，名称一般全大写。
- **方法**：接口中的方法默认为`public abstract`，即抽象方法。

### JDK 8 与 JDK 9 中接口的新特性

- **默认方法**：在JDK 8中，允许在接口中定义默认方法，使用`default`关键字，这样在不修改现有类的情况下可以添加新方法。
- **静态方法**：JDK 8中还可以定义静态方法，但不能通过接口引用调用，只能通过接口名调用。
- **私有方法**：JDK 9中引入了接口中定义私有方法的能力，使得接口能更好地控制内部实现细节。

### 接口实现

Java中的类和类之间是继承关系，且只能单继承；类和接口之间是实现关系，通过`implements`关键字表示，可以是单实现或多实现。子类还可以在继承一个父类的同时实现多个接口。

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

此接口定义了一个名为`IAction`的接口，包含一个常量`NUM`和两个抽象方法`start()`和`end()`。

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

这个类`ActionImpl`实现了`IAction`接口，并提供了`start()`和`end()`的具体实现。

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

在这段测试代码中，创建了一个`ActionImpl`的实例，并通过接口引用`ac`调用了方法`start()`和`end()`。此外，尝试改变接口中的常量值会导致编译错误。


### 接口部分的代码示例

#### 接口基础定义与实现

首先，定义了一个接口`IAction`，该接口定义了两个方法`start()`和`end()`，以及一个常量`NUM`。

```java
package com.briup.chap07.test;

interface IAction {
    int NUM = 10;
    void start();
    public abstract void end();
}
```

接着，定义了一个类`ActionImpl`来实现`IAction`接口，并提供了具体的方法实现。

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

在测试类`Test021_Basic`中，创建了`ActionImpl`的实例，并通过接口引用`ac`来调用方法`start()`和`end()`。

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

在这个例子中，`Action`接口继承了`Runable`和`Flyable`接口，并且增加了一个新的方法`sing()`。

#### 接口实现类定义

接下来定义了一个抽象父类`Animal2`，以及两个接口`IJumpAble`和`ICycleAble`，然后定义一个猴子类`Monkey`继承`Animal2`并且实现了这两个接口。

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

这个例子展示了如何在一个类中实现多个接口，并且继承一个抽象类，同时也展示了接口的继承和实现。通过`Monkey`类，可以看到它继承了`Animal2`抽象类，并实现了`IJumpAble`和`ICycleAble`两个接口，提供了具体的方法实现。

### 总结

接口在Java中提供了一种定义行为规范的方式，允许类通过实现接口来获得多种行为。接口可以包含抽象方法和常量定义，并且在JDK 8及以后版本中还可以包含默认方法和静态方法。通过接口实现，可以提高代码的复用性和扩展性。