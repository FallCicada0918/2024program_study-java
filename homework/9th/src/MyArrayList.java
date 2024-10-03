/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-29 20:02:43
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-03 23:24:56
 */
import java.util.Arrays;

public class MyArrayList {
    // 定义数组容器
    private Object[] elementData;//默认容量为10
    private static final int DEFAULT_CAPACITY = 10;
    // 实际ArrayList的大小
    private int size;

    // 提供有参构造器自定义初始容量
    public MyArrayList(int initialCapacity) {
        // 如果初始容量小于0，则抛出非法参数异常
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity:" + initialCapacity);
        }
        // 初始化数组容器
        this.elementData = new Object[initialCapacity];
    }

    // 无参构造初始化将默认10传递给有参构造器
    public MyArrayList() {
        // 调用有参构造器，传入默认容量
        this(DEFAULT_CAPACITY);
    }

    // 在尾部添加元素
    public void add(Object object) {
        // 检查是否需要扩容
        ensureCapacity(size + 1);
        // 将元素添加到数组末尾
        elementData[size++] = object;
    }

    // 在指定位置添加元素
    public void add(int index, Object object) {
        // 检查索引是否越界
        rangeCheckForAdd(index);
        // 检查是否需要扩容
        ensureCapacity(size + 1);
        // 将指定位置后的元素向后移动一位
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        // 在指定位置插入新元素
        elementData[index] = object;
        // 更新实际大小
        size++;
    }

    // 获取指定索引元素
    public Object get(int index) {
        // 检查索引是否越界
        rangeCheckForAdd(index);
        // 返回指定索引处的元素
        return elementData[index];
    }

    // 检查数组是否越界
    private void rangeCheckForAdd(int index) {
        // 如果索引小于0或大于实际大小，则抛出数组越界异常
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("数组越界异常");
        }
    }

    // 删除指定索引元素
    public Object remove(int index) {
        // 检查索引是否越界
        rangeCheckForAdd(index);
        // 获取要删除的元素
        Object oldValue = elementData[index];
        // 计算要移动的元素数量
        int numMoved = size - index - 1;
        // 如果要移动的元素数量大于0，则进行数组复制
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        // 将最后一个元素置为null，帮助GC
        elementData[--size] = null;
        // 返回被删除的元素
        return oldValue;
    }

    // 删除对象
    public boolean remove(Object o) {
        // 如果对象为null，则遍历数组找到第一个null元素并删除
        if (o == null) {
            for (int index = 0; index < size; index++) {
                if (elementData[index] == null) {
                    remove(index);
                    return true;
                }
            }
        } else {
            // 如果对象不为null，则遍历数组找到第一个相等的元素并删除
            for (int index = 0; index < size; index++) {
                if (o.equals(elementData[index])) {
                    remove(index);
                    return true;
                }
            }
        }
        // 如果没有找到要删除的元素，则返回false
        return false;
    }

    // 清空数据
    public void clear() {
        // 遍历数组，将每个元素置为null，帮助GC
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        // 重置实际大小为0
        size = 0;
    }

    // 扩容
    private void grow(int minCapacity) {
        // 获取当前数组容量
        int oldCapacity = elementData.length;
        // 新容量为旧容量的1.5倍
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        // 如果新容量小于最小需要的容量，则将新容量设为最小需要的容量
        if (newCapacity < minCapacity) {
            newCapacity = minCapacity;
        }
        // 将数组复制到新容量的数组中
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    // 确保容量足够
    private void ensureCapacity(int minCapacity) {
        // 如果最小需要的容量大于当前数组容量，则进行扩容
        if (minCapacity - elementData.length > 0) {
            grow(minCapacity);
        }
    }
    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < size; i++) {
        sb.append(elementData[i]).append(",");
    }
    // 返回拼接后的字符串，并去除最后一个逗号
    if (sb.length() == 0) {
        return "";
    }
    String result = "[" +sb.toString().substring(0, sb.length() - 1) + "]";
    return result;
}

    // 测试
    public static void main(String[] args) {
        // 创建一个初始容量为1的MyArrayList实例
        MyArrayList my = new MyArrayList(1);
        // 添加元素1
        my.add(1);
        // 添加元素2
        my.add(2);
        // 添加元素3
        my.add(3);
        // 打印
        System.out.println(my.toString());
        // 获取第一个位置的元素并打印
        System.out.println("获取第一个位置" + my.get(1));
        System.out.println(my.size);
        // 删除第一个位置的元素
        my.remove(1);
        // 打印剩余元素
        System.out.println(my.toString());
        // 清空所有元素
        my.clear();
        // 打印实际大小
        System.out.println(my.size);
        
    }
}