package com.inmysong.demo.demo16Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/10 21:31
 * @description 源码分析
 *
 */
@SuppressWarnings("all")
public class MapSourceTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","加欧阳");//k -v
        map.put("no2","家伙");
        /*
        * 1. K-v  最后是 HashMap$Node node = newNode(hash ,key, value, null)
        * 2. k -v 为了方便程序员的遍历， 还会创建 EntrySet 集合，该集合存放的元素的类型是 Entry，
        *    而一个Entry 对象就有 K ，v ，EntrySet<Entry<k,v>>, 就是 transient Set<Map.Entry<K,V>> entrySet;
        * 3. EntrySet 中，定义的类型是 Map.Entry , 但是实际上存放的还是 HashMap$Node,因为 HashMap$Node implement Map.Entry
        *
        *
        *
        * */

        Set set = map.entrySet();
        System.out.println(set.getClass());//HashMap$EntrySet
        for (Object entry : set) {
            //System.out.println(entry.getClass());
            //为了从 HashMap$Node 取出 K-V
            //先向下转型
            Map.Entry in  = (Map.Entry)entry ;
            System.out.println(in.getKey() + "*" + in.getValue());
        }

    }
}
