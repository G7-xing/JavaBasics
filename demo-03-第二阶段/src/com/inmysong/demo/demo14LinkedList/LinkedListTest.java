package com.inmysong.demo.demo14LinkedList;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/3/27 20:15
 * @description LinkedList
 * 1.LinkedList 底层实现了双向链表，双端队列特点
 * 2.可以添加任意元素（可以重复），包括null
 * 3.线程不安全，没有实现同步
 *
 * 底层操作机制
 * 1.LinkedList维护了一个双向链表。
 * 2.LinkedList中维护了两个属性first ，last ，分别指向首节点，尾节点。
 * 3.每个节点Node ，是一个数据结构：里面有prev，next，item三个属性，
 *   其中通过prev指向前一个节点，next指向后一个，最终实现双向链表。
 * 4.所以LinkedList的元素的添加和删除，不是通过数组完成的，相对来说效率较高。
 * 5.
 *
 */
@SuppressWarnings("all")
public class LinkedListTest {
    //模拟一个双向链表
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node stx = new Node("stx");
        Node zhangqing = new Node("zhangqing");

        //链接
        jack.next = tom;
        tom.next = stx;

        stx.prev = tom;
        tom.prev = jack;

        Node first = jack;
        Node last = stx;
    /*    //遍历
        while(true){
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }*/
        //添加元素
        zhangqing.next = stx;
        zhangqing.prev = tom;
        stx.prev = zhangqing;
        tom.next = zhangqing;

        //遍历
        while(true){
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
    }
}

class Node{
    public Object item;
    public Node prev;
    public Node next;
    public Node(Object name){
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name = `" + item;
    }
}
