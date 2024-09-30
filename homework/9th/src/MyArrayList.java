/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-29 20:03:21
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-29 20:36:21
 */

import java.util.Arrays;

public class MyArrayList {
    // 定义数组容器
    private Object[] elementData;
    // 默认容量为10
    private static final int DEFAULT_CAPACITY = 10;
    // 实际ArrayList的大小
    private int size;

    // 提供有参构造器 自定义初始容量
    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
        this.elementData = new Object[initialCapacity];
    }

    // 无参构造初始化 将默认10传递给有参构造器
    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    // 在尾部添加元素
    public void add(Object object) {
        ensureCapacity(size + 1); // 增加容量
        elementData[size++] = object;
    }

    // 在指定位置添加元素
    public void add(int index, Object object) {
        rangeCheckForAdd(index);
        ensureCapacity(size + 1); // 增加容量
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = object;
        size++;
    }

    // 获取指定索引元素
    public Object get(int index) {
        rangeCheckForAdd(index);
        return elementData[index];
    }

    // 检查数组是否越界
    private void rangeCheckForAdd(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("数组越界异常");
        }
    }

    // 删除指定索引元素
    public Object remove(int index) {
        rangeCheckForAdd(index);
        Object oldValue = elementData[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null; // 清除引用
        return oldValue;
    }

    // 删除对象
    public boolean remove(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elementData[i] == null) {
                    fastRemove(i);
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elementData[i])) {
                    fastRemove(i);
                    return true;
                }
            }
        }
        return false;
    }

    // 快速移除
    private void fastRemove(int index) {
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null; // 清除引用
    }

    // 清空数据
    public void clear() {
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        size = 0;
    }

    // 扩容
    private void ensureCapacity(int minCapacity) {
        if (minCapacity - elementData.length > 0) {
            grow(minCapacity);
        }
    }

    // 扩容
    private void grow(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0) {
            newCapacity = minCapacity;
        }
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    @Override
    public String toString() {
        return "MyArrayList{" + "elementData=" + Arrays.toString(elementData) +", size=" + size +'}';
    }

    // 测试
    public static void main(String[] args) {
        MyArrayList my = new MyArrayList(1);
        my.add(1);
        my.add(2);
        System.out.println("当前大小: " + my.size);
        System.out.println("获取第一个位置: " + my.get(0));
        System.out.println("获取第二个位置: " + my.get(1));
        // my.remove(1);
        System.out.println(my);
        my.clear();
        System.out.println("当前大小: " + my.size);
    }
}