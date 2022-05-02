package com.inmysong.demo.demo15Set;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/27 22:52
 * @description 模拟HashMap的底层
 */
@SuppressWarnings("all")
public class HashMapStructure {
    public static void main(String[] args) {
        //1.创建一个数组，数组的类型Node[]
        Node[] tables = new Node[16];
        //2.创建结点
        Node john = new Node("john", null);
        tables[2] = john;
        Node jack = new Node("jack", null);
        john.next = jack;
        Node rose = new Node("rose", null);
        jack.next = rose;
        Node lucy = new Node("lucy", null);
        tables[3] = lucy;
    }
}
class Node{//结点，存储数据，可以指向下一个结点，从而形成链表
    Object item;//数据
    Node next ;

    public Node(String item, Node next) {
        this.item = item;
        this.next = next;
    }
}
