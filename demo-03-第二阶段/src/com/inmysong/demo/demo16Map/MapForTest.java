package com.inmysong.demo.demo16Map;

import com.inmysong.demo.demo15Set.HashMapStructure;

import java.util.*;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/10 22:07
 * @description 遍历方式
 */
@SuppressWarnings("all")
public class MapForTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超","孙俪");
        map.put("王宝强","马蓉");
        map.put("宋喆","马蓉");
        map.put(null,"刘亦菲");
        map.put("宋祖尔",null);
        map.put("宋天星","张清");

        //1.先取出所有的key，再通过key阙处对应的Value
        Set set = map.entrySet();
        for (Object key : set) {
            System.out.println(key + "-" );
        }
        //迭代器
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key + "-" );

        }

        //2.取出所有的value
        Collection values = map.values();
        //这里可以是使用所有的Collection使用的遍历方式
        //增强for ，迭代器，for循环


        //3.通过EntrySet 来获取K - V
        Set entrySet = map.entrySet();
        for (Object entry :entrySet) {
            //将entry 装成 Map.Entry.向下转型
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            //System.out.println(next.getClass());
            Map.Entry m = (Map.Entry) next;
            System.out.println(m.getKey() + "-" + m.getValue());
        }

    }
}
