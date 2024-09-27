<!--
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-26 08:35:31
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-27 16:12:19
-->

# 2024年秋季Java基础课用笔记

# 集合

## 数组

- 长度，长度是固定的：在创建数组时就需要指定数组长度，并且在创建后不可改变。
- 数据类型是固定的：在创建时就需要制定数组的数据类型，创建后不可改变，该数组只能存储指定数据类型的数据。
- 数组在堆空间的内存是连续的，所以当插入一个元素的时候，后面的元素需要整体移动导致效率低下。

## 集合 - 介绍

- 在Java中，集合是一种数据结构，适用于储存和
- 集合位于 `java.util`包中，提供了一系列的接口和类

  - 接口：`Collection`、`List`、`Map`
  - 类：set

## ***集合***和***数组***的区别

    1.***数组***的长度是固定的
       ***集合***的长度是可变的
    2. ***数组***中元素类型是相同的
       ***集合***中可以存储不同类型的数据
    3. ***数组***可以存放引用数据类型，基本数据类型的数据
       ***集合***只能存放引用类型的数据
    4. ***数组***是由JVM中现有的 `数据类型 + []`组合而成的，除了一个 `length`属性，和从 `object`继承的方法之外，数组就调用不到其他属性和方法
       但是集合是由 `java.util`包中提供的类和接口组合而成，`java.util包`下的多个解耦和实现类组成，定义并实现了很多方法，所以功能强大

### 集合框架体系的组成

    - 接口
      - 是整个集合框架的上层结构，，接口定义了集合中必须要有基本方法
      - 通过接口还把集合划分成了几种不同的类型，每一种集合都有自己对应的接口。
    - 实现类
      - 对于上层使用接口划分好的集合种类，每种集合的接口都会有对应的实现类。
      - 每一种接口的实现类很可能有多个，每个的实现方式也会各有不同。
    - 数据结构
      - 每个实现类都实现了接口中所定义的最基本的方法，例如对数据的存储、检索、操作等方法。但是不同的实现类，它们存储数据的方式不同，也就是使用的**数据结构**不同。

- 集合框架继承体系图:
  ![集合框架继承体系图](./集合框架继承体系图.png)
- 集合的分类

  - 单列集合（Single Column Collection）
    根接口：`java.util.Collection`
    单列集合是指每个集合元素只包含一个单独的对象，它是集合框架中最简单的形式
  - 多列集合（Multiple Column Collection）
    根接口：`java.util.Map`
    多列集合是指每个集合元素由多个列（字段）组成，可以同时存储和操作多个相关的值
- 集合章节的学习的基本要求

  1. 会用集合存储数据
  2. 会从集合中存储数据
  3. 掌握每种集合的特点和应用场景

  - **Collection接口结构图：**
    ![Collection接口结构图](./Collection接口结构图.png)
  - **Map接口结构图如下：**
    ![Map接口结构图](./Map接口结构图.png)

## Collection

Collection接口是**单列**集合类的父接口，这种集合可以将数据一个一个的存放到集合中。它有两个重要的子接口，分别是

1. `java.util.List `
2. `java.util.Set`
   `Collection`是父接口，定义了子接口()的通用方法
   `Collection`接口的实现类就都可以使用这些方法
   **如图：**
   ![单列](./单列.png)

### 方法

- `boolean add(Object obj)`:
  - 作用：将指定的对象添加到当前集合中
  - 返回值：如果添加成功，则返回true，否则返回false
  - 参数：
- `boolean addAll(Collection c)`：
  - 作用：将指定的集合中的所有元素添加到当前集合中
  - 返回值：boolean
  - 参数：Collection 集合
- `boolean remove(Object obj)`：
  - 作用：从当前集合中移除指定的元素
  - 返回值：boolean
  - 参数：Object指定要删除的元素
- `boolean removeAll(Collection c)`：
  - 作用：从当前集合中移除指定的集合中的所有元素
  - 返回值：
  - 参数：
- `boolean retainAll(Collection c)`：
  - 作用：从当前集合中移除不是c集合中的元素
  - 返回值：
  - 参数：
- `boolean contains(Object obj)`：
  - 作用：判断当前集合中是否包含该对象
  - 返回值：bollean
  - 参数：Object
- `boolean containsAll(Collection c)`：
  - 作用：判断当前集合中是否包含指定的集合中的所有元素
  - 返回值：boolean
  - 参数：Collection
- `boolean isEmpty()`：
  - 作用：判断当前集合是否为空
  - 返回值：boolean
  - 参数：无
- `void clear()`：
  - 作用：清空集合中的元素
  - 返回值：无
  - 参数：无
- `int size()`：
  - 作用：返回集合中元素的个数
  - 返回值：int
  - 参数：无
  - 注意：If this collectioncontains more than `<tt>`Integer.MAX_VALUE `</tt>` elements,returns `<tt>`Integer.MAX_VALUE `</tt>`.
- `Object[] toArray()`：
  - 作用：把集合中的元素，存储到数组中
  - 返回值：Object[]
  - 参数：无参
- `boolean equals()`：
  - 作用：判断两个集合是否相等
  - 返回值：boolean
  - 参数：无

### 集合遍历

#### `toArray()`

借助Collection接口中toArray()方法实现，方法原型为：
**遍历格式：**

```java
   //将集合转化成数组
  Object[] array = 集合引用.toArray();
  Object[] toArray();
  //遍历数组
  for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]);
  }
```

#### 增强 `for`循环(`foreach`)

1. 增强for循环遍历集合，遍历数组
2. 遍历集合和遍历数组的格式一样，都是使用for循环，但是遍历集合的格式是固定的，但是遍历数组的格式不是固定的。
3. 遍历集合的格式：

```java
  for(集合数据类型 变量名 : 集合名){}
```

#### 迭代器

迭代器是集合框架提供的一种遍历集合元素的方式。通过调用集合的 `iterator() `方法可以获取一个迭代器对象，然后使用迭代器 `hasNext()`方法判断是否还有下一个元素，使用 `next()`方法获取下一个元素。
**遍历固定格式**

```java
    //1.获取迭代器对象
    Iterator<集合元素类型> iterator = 集合对象.iterator();
  
    //2.借助迭代器中hasNext()和next()方法完成遍历
    while (iterator.hasNext()) {
        //获取集合元素
        集合元素类型 变量名 = iterator.next();
  
        //对集合元素进行输出
        System.out.println(变量名);
    }
```

> 注意，这种迭代器方式获取集合中的每一个元素，是一种 `Collection`集合及其子类型集合通用的方式

**迭代器实现原理：**

1. 获取迭代器对象：集合类实现了Iterable 接口，该接口定义了一个 `iterator()` 方法，用于获取迭代器对象。迭代器对象是实现了 `Iterator`接口的具体类的实例。
2. 迭代器位置初始化：在创建迭代器对象时，迭代器的位置通常初始化为集合的起始位置。不同的集合实现可能对位置初始化进行不同的处理。
3. 遍历集合元素：通过调用迭代器对象的 `hasNext()`方法，可以判断集合中是否还有下一个元素。如果有下一个元素，可以通过 `next()`方法获取下一个元素，并将迭代器的位置后移。
4. 迭代器状态管理：迭代器对象会记录当前迭代的状态，包括当前位置、遍历过程中的操作等。这些状态可以帮助迭代器在遍历过程中正确地访问和操作集合的元素。
5. 结束迭代：当集合中没有更多元素时，迭代器的 `hasNext() `方法将返回 `false`，表示遍历结束。
   **迭代器next方法示意图:**
   ![迭代器next方法示意图](./迭代器next方法示意图.png)

## List接口

`java.util.List` 接口继承了 `Collection` 接口，是常用的一种集合类型。`List `集合具 `Collection` 集合的特点之外，还具有自己的一些特点：

- List是一种**有序集合**
  例如，向集合中存储的元素顺序是8、2、5。那么集合中就是按照这个顺序进行存储的
- List一种**带索引**的集合
  可以通过元素的下标索引，精确查找对应的元素数据
- List集合**可以存放重复元素**
  可以把相同的数据，在List集合中多次保存

### 继承体系

返回一个包含集合中元素的数组
![List继承体系](./List继承体系.png)
**List接口源码：**

```java
    package java.util;
    public interface List<E> extends Collection<E> {
    //省略...
    }
```

List接口的实现类
![List接口的实现类](./List的实现类.png)

> 注意，这些实现类中，都已经实现了List接口、Collection接口、Iterable接口
> 中的方法，我们只要了解并能使用这些接口中的方法，就已经能够操作这些
> 集合对象了（面向接口）。
> 额外的，我们还需要了解这些常用的接口实现类，分别都是什么特点，使用
> 的什么数据结构，以及适合在什么样的场景下使用。

### 常用方法

- `void add(int index, Object ele)`
  作用: index位置插入ele元素
- `boolean addAll(int index, Collection eles)`
  作用: 从index位置开始将eles中的所有元素添加进来
- `Object get(int index)`
  作用: 返回index位置的元素
- `int indexOf(Object obj)`
  作用:返回obj在集合中首次出现的位置
- `int lastIndexOf(Object obj)`
  作用:返回obj在当前集合中末次出现的位置
- `Object remove(int index)`
  作用:移除index位置的元素
  返回值：返回移除元素
- `Object set(int index, Object ele)`
  作用:设置index位置的元素为ele
- `List subList(int fromIndex, int toIndex)`
  作用:返回从fromIndex到toIndex位置的子集合
- `ListIterator listIterator()`
  作用:返回此列表的列表迭代器（按适当顺序）
- `ListIterator listIterator(int index)`
  作用:返回列表的列表迭代器（按适当顺序）
- `Object[] toArray()`
  作用:返回一个包含集合中元素的数组

> 注意，除了这些方法之外，还有从父接口Collection中继承过来的方法

### ArrayList类

`java.util.ArrayList `是最常用的一种List类型集合，`ArrayList` 类**底层使用数组**来实现数据的存储，所以它的**特点是：增删慢，查找快。**
在日常的开发中，查询数据也是用的最多的功能，所以ArrayList是最常用的集合。
但是，如果项目中对性能要求较高，并且在集合中大量的数据做增删操作，那么 `ArrayList`就不太适合了。
`ArrayList`的案例我们之前已经写过很多，此处不在额外演示。
**位置:**java.util.ArrayList
**ArrayList源码参考：**

```java
    package java.util;
    /**
     * Resizable-array implementation of the <tt>List</tt> interface.  Implements
    * all optional list operations, and permits all elements, including
    * <tt>null</tt>. 
    * @see     LinkedList
    * @see     Vector
    * @since   1.2
    */
    public class ArrayList<E> extends AbstractList<E>implements List<E>, RandomAccess, Cloneable, 
    java.io.Serializable
    {
    //省略...
    /**
     * Default initial capacity.
     */
    private static final int DEFAULT_CAPACITY = 10;
    /**
     * Shared empty array instance used for empty instances.
     */
    private static final Object[] EMPTY_ELEMENTDATA = {};
    }
```

### LinkedList类

`java.util.LinkedList `底层**采用的数据结构是双向链表，其特点是：增删快，查找慢**
它的特点刚好和 `ArrayList `相反，所以在代码中，需要对集合中的元素做大量的增删操作的时候，可以选择使用 `LinkedList`。
注意：这里描述的快和慢，需要在大量的数据操作下，才可以体现，如果数据量不大的话，集合每一种集合的操作几乎没有任何区别。

1) **特点验证**
   实例化ArrayList、LinkedList集合对象，放入100000个元素，测试两种集合插入、查询效率！

   ```java
      package com.briup.chap08.test;
      import java.util.ArrayList;
      import java.util.LinkedList;
      import java.util.List;
      public class Test054_LinkedList {
        public static void main(String[] args) {
          //操作集合的次数
          final int NUM = 100000;
          //1.实例化集合对象
          List<String> list = new ArrayList<>();
          //List<String> list = new LinkedList<>();
          //2.开启计时，往集合种放入 100000 个元素
          long start1 = System.currentTimeMillis();
          for (int i = 0; i < NUM; i++) {
            list.add(0,"hello"+i);
          }
          long end1 = System.currentTimeMillis();
          //3.输出时长
          System.out.println(list.getClass().getSimpleName()+"插入"+NUM+"条数据耗时"+(end1-start1)+"毫秒");
          //4.开启计时，从集合种取 100000 个元素
          long start2 = System.currentTimeMillis();
          for(int i = 0; i < list.size(); i++){
            list.get(i);
          }
          long end2 = System.currentTimeMillis();
          //5.输出时长
          System.out.println(list.getClass().getSimpleName()+"检索"+NUM+"条数据耗时"+(end2-start2)+"毫秒");
        }
      }

   ```

   ```java
      //运行效果：
      //根据电脑的当前情况，每次运行的结果可能会有差异
      //以下是我的电脑运行俩次的实验结果，第一次使用ArrayList，第二次使用
      LinkedList
      ArrayList插入100000条数据耗时508毫秒
      ArrayList检索100000条数据耗时2毫秒
      LinkedList插入100000条数据耗时22毫秒
      LinkedList检索100000条数据耗时17709毫
   ```

### Vector

Vector是在JDK1.0引入的，它实现了List接口，属于Java集合框架的一部分，其**基于动态数组（Dynamic Array）实现，线程安全，Vector在功能和使用方式上和ArrayList非常相似**
ArrayList是在JDK 1.2引入的，非线程安全，但单线程环境下性能更高效，是Vector的一个非线程安全的替代品。
**Vector继承体系**如下：
![Vector继承体系](./List继承体系.png)
**Vector部分源码：**

```java
  package java.util;
  /**
     * The {@code Vector} class implements a growable array of
     * objects. Like an array, it contains components that can be
     * accessed using an integer index.
     * @see LinkedList
     * @since   JDK1.0
   */
  public class Vector<E>
    extends AbstractList<E>
    implements List<E>, RandomAccess, Cloneable, 
  java.io.Serializable
  {
    //省略
    /** 
    * 底层借助数组存储数据
    * The array buffer into which the components of the 
    vector are
    * stored.
    */
    protected Object[] elementData;
  }
```

`Vector`内部也是采用了数组来存储数据，但是 `Vector`中的方法大多数都是线程安全的方法，所以在多线并发访问的环境中，可以使用 `Vector`来保证集合中元据操作的安全。

#### 常用方法

- `public synchronized boolean add(E e)`
  作用:将指定元素添加到此列表的末尾（可选操作）。
- `public synchronized boolean addAll(Collection<? extends E> c)`
  作用：将指定集合中的所有元素添加到此列表的末尾（可选操作）。
- `public synchronized void add(int index, E element)`
  作用：将指定元素插入此列表中的指定位置（可选操作）。
- `public synchronized E remove(int index)`
  作用：删除此列表中指定位置的元素（可选操作）。
- `public synchronized boolean remove(Object o)`
  作用：
- `public synchronized boolean removeAll(Collection<?> c)`
  作用：删除此列表包含在指定集合中的所有元素（可选操作）。
- `public synchronized boolean retainAll(Collection<?> c)`
  作用：保留此列表中在指定集合中存在的元素（可选操作）。
- `public synchronized void clear()`
  作用：清除此列表中的所有元素（可选操作）。
- `public synchronized boolean contains(Object o)`
  作用：判断此列表中是否包含指定元素。
- `public synchronized boolean containsAll(Collection<?> c)`
  作用：判断此列表中是否包含指定集合中的所有元素。

### List 小结

| 集合类     | 特点                                                 | 示例                             |
| ---------- | ---------------------------------------------------- | -------------------------------- |
| ArrayList  | 内部使用数组实现，动态调整大小。读取快，插入删除慢   | List list = new ArrayList<>();  |
| LinkedList | 内部使用双向链表实现，插入删除快，读取快             | List list = new LinkedList<>(); |
| Vector     | 线程安全的动态数组实现，操作方法同步，多线程环境安全 | List list = new Vector<>();     |

## 数据结构

### 概述

数据结构是计算机科学中研究数据组织、存储和操作的一门学科。它涉及了**如何组织和存储数据**以及如何设计和实现不同的数据操作算法和技术。常见的据结构有**线性数据结构**（含数组、链表、栈和队列等），**非线性数据结构**（树、图等）。

> 注意：不同的数据结构适用于不同的场景和问题，选择合适的数据结构可以提高算法的效率和性能。
> **Java集合框架中不同的实现类底层借助不同数据结构来存储输出，常见的数据结构有：**

1. 数组（Array）：有序集合，可以包含重复的元素，常见实现类有ArrayList、Vector
2. 链表（LinkedList）：链表是一种动态数据结构，通过节点之间的链接来组织数据。常见的链表实现类是LinkedList
3. 集合（Set）：集合是不允许包含重复元素的无序集合。常见的集合实现类有HashSet、LinkedHashSet和TreeSet
4. 映射（Map）：映射是一种键值对的集合，每个键只能对应一个值。常见的映射实现类有HashMap、LinkedHashMap和TreeMap
5. 队列（Queue）：队列是一种先进先出（FIFO）的数据结构。常见的队列实现类有LinkedList和PriorityQueue
6. 栈（Stack）：栈是一种后进先出（LIFO）的数据结构。常见的栈实现类是Stack
7. 树（Tree）：树是一种具有分层结构的数据结构，常见的树实现类有BinaryTree和BinarySearchTree
