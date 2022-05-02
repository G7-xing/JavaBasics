package com.inmysong.demo.demo16Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/10 21:03
 * @description Map接口的特点 :JDK8
 * 1.Map与Collection并列存在。用于保存具有映射关系的数据：key - value (双列元素),无序的
 * 2.Map 中的Key 和 value 可以是任何引用类型的数据，会封装到HashMap$Node对象中
 * 3.Map中的Key不许重复，当有相同的key是，直接替换
 * 4.Map中的value可以重复
 * 5.Map的key可以为null ，value 也可以是null，注意  key为null，只能有一个，value为null可以多个
 * 6.常用String类作为Map的key
 * 7.key和value之间存在单项的一对一光系，即通过指定的key总能找到对应的value
 * 8.Map 存放数据的key-value示意图，，一对 k - v 是存放一个HashMap$Node中的，因为Node是实现了Entry 接口，有些书上说一对kv就是一个Entry
 *
 *
 * Map接口常用的方法
 * 1.put：添加
 * 2.remove ：根据键删除映射关系
 * 3.get ：根据键获取值
 * 4.size ： 获取元素个数
 * 5.isEmpty ：判断个数是否为 0
 * 6. clear ：清除
 * 7. containsKey ：查找键是否存在
 */
@SuppressWarnings("all")
public class MapTest {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("no1","加欧阳");//k -v
        map.put("no2","家伙");
        map.put(null,null);
        map.put(null,"234");//给上一个替换了

        System.out.println(map.get("no2"));
        System.out.println(map);
    }
}
