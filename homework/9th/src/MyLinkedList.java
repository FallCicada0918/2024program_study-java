/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-03 23:36:25
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-03 23:48:42
 */
public class MyLinkedList<T> {
    private Node<T> first; //定义头节点
    private Node<T> last; //定义尾节点
    private int size; //链表的长度

    private class Node<T> {
        private T data; //存放元素的值
        private Node<T> pre; //存放上一个节点
        private Node<T> next; //存放下一个节点

        public Node(T data) {
            this.data = data;
        }
    }

    //添加元素方法
    public void add(T t) {
        Node<T> newNode = new Node<>(t);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.pre = last;
            last = newNode;
        }
        size++;
    }

    //将元素添加到指定索引方法
    public void add(int index, T t) throws Exception {
        //校验参数
        checkIndex(index);
        Node<T> newNode = new Node<>(t);
        if (index == 0) {
            newNode.next = first;
            first.pre = newNode;
            first = newNode;
        } else {
            Node<T> current = get(index);
            Node<T> previous = current.pre;
            previous.next = newNode;
            newNode.pre = previous;
            newNode.next = current;
            current.pre = newNode;
        }
        size++;
    }

    //根据索引删除元素方法
    public void remove(int index) throws Exception {
        //校验参数
        checkIndex(index);
        Node<T> current = get(index);
        if (current == first) {
            first = current.next;
            if (first != null) {
                first.pre = null;
            }
        } else if (current == last) {
            last = current.pre;
            if (last != null) {
                last.next = null;
            }
        } else {
            Node<T> previous = current.pre;
            Node<T> next = current.next;
            previous.next = next;
            next.pre = previous;
        }
        size--;
    }

    //根据索引获取元素方法
    private Node<T> get(int index) throws Exception {
        checkIndex(index);
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    //获取MyLinkedList长度方法
    public int getSize() {
        return this.size;
    }

    //展示数据方法
    public void show() throws Exception {
        for (int i = 0; i < getSize(); i++) {
            if (i == getSize() - 1) {
                System.out.println(get(i).data);
            } else {
                System.out.print(get(i).data + "->");
            }
        }
    }

    //校验参数方法
    private void checkIndex(int index) throws Exception {
        if (index < 0 || index >= getSize()) {
            throw new Exception("参数index不合法");
        }
    }

    //测试
    public static void main(String[] args) throws Exception {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.show();
        linkedList.add(2, 1);
        linkedList.show();
        linkedList.remove(2);
        linkedList.show();
    }
}