<!--
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-26 08:35:31
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-26 10:58:26
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
  - 注意：If this collectioncontains more than <tt>Integer.MAX_VALUE</tt> elements,returns<tt>Integer.MAX_VALUE</tt>.
- `Object[] toArray()`：
  - 作用：把集合中的元素，存储到数组中
  - 返回值：Object[]
  - 参数：无参
- `boolean equals()`：
  - 作用：判断两个集合是否相等
  - 返回值：boolean
  - 参数：无
