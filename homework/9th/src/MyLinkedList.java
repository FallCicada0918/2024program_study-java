/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-03 23:36:25
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-04 00:07:17
 */
public class MyLinkedList<T> {
    private Node<T> first; // 定义头节点
    private Node<T> last; // 定义尾节点
    private int size; // 链表的长度

    // 定义节点类
    private class Node<T> {
        private T data; // 存放元素的值
        private Node<T> pre; // 存放上一个节点
        private Node<T> next; // 存放下一个节点

        // 节点构造方法
        public Node(T data) {
            this.data = data;
        }
    }

    // 添加元素方法
    public void add(T t) {
        Node<T> newNode = new Node<>(t); // 创建新节点
        if (first == null) { // 如果链表为空
            first = newNode; // 新节点为头节点
            last = newNode; // 新节点为尾节点
        } else { // 如果链表不为空
            last.next = newNode; // 将新节点添加到链表末尾
            newNode.pre = last; // 设置新节点的前驱节点
            last = newNode; // 更新尾节点
            //交换节点位置(个人理解)
        }
        size++; // 链表长度加1
    }

    // 将元素添加到指定索引方法
    public void add(int index, T t) throws Exception {
        checkIndex(index); // 校验参数
        Node<T> newNode = new Node<>(t); // 创建新节点
        if (index == 0) { // 如果索引为0
            newNode.next = first; // 新节点的下一个节点为头节点
            first.pre = newNode; // 头节点的前驱节点为新节点
            first = newNode; // 更新头节点
        } else { // 如果索引不为0
            Node<T> current = get(index); // 获取指定索引的节点
            Node<T> previous = current.pre; // 获取指定索引节点的前驱节点
            previous.next = newNode; // 前驱节点的下一个节点为新节点
            newNode.pre = previous; // 新节点的前驱节点为前驱节点
            newNode.next = current; // 新节点的下一个节点为指定索引节点
            current.pre = newNode; // 指定索引节点的前驱节点为新节点
        }
        size++; // 链表长度加1
    }

    // 根据索引删除元素方法
    public void remove(int index) throws Exception {
        checkIndex(index); // 校验参数
        Node<T> current = get(index); // 获取指定索引的节点
        if (current == first) { // 如果删除的是头节点
            first = current.next; // 更新头节点
            if (first != null) { // 如果新的头节点不为空
                first.pre = null; // 新的头节点的前驱节点为空
            }
        } else if (current == last) { // 如果删除的是尾节点
            last = current.pre; // 更新尾节点
            if (last != null) { // 如果新的尾节点不为空
                last.next = null; // 新的尾节点的下一个节点为空
            }
        } else { // 如果删除的是中间节点
            Node<T> previous = current.pre; // 获取前驱节点
            Node<T> next = current.next; // 获取后继节点
            previous.next = next; // 前驱节点的下一个节点为后继节点
            next.pre = previous; // 后继节点的前驱节点为前驱节点
        }
        size--; // 链表长度减1
    }

    // 根据索引获取元素方法
    private Node<T> get(int index) throws Exception {
        checkIndex(index); // 校验参数
        Node<T> current = first; // 从头节点开始遍历
        for (int i = 0; i < index; i++) { // 遍历到指定索引
            current = current.next; // 移动到下一个节点
        }
        return current; // 返回指定索引的节点
    }

    // 获取MyLinkedList长度方法
    public int getSize() {
        return this.size; // 返回链表长度
    }

    // 展示数据方法
    public void show() throws Exception {
        for (int i = 0; i < getSize(); i++) { // 遍历链表
            if (i == getSize() - 1) { // 如果是最后一个元素
                System.out.println(get(i).data); // 打印元素值并换行
            } else { // 如果不是最后一个元素
                System.out.print(get(i).data + "->"); // 打印元素值和箭头
            }
        }
    }

    // 校验参数方法
    private void checkIndex(int index) throws Exception {
        if (index < 0 || index >= getSize()) { // 如果索引不合法
            throw new Exception("参数index不合法"); // 抛出异常
        }
    }

    // 测试
    public static void main(String[] args) throws Exception {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>(); // 创建链表实例
        linkedList.add(1); // 添加元素1
        linkedList.add(2); // 添加元素2
        linkedList.add(3); // 添加元素3
        linkedList.add(4); // 添加元素4
        linkedList.add(5); // ........
        linkedList.show(); // 展示链表
        linkedList.add(2, 1); // 在索引2处添加元素1
        linkedList.show(); // 展示链表
        linkedList.remove(2); // 删除索引2处的元素
        linkedList.show(); // 展示链表
    }
}