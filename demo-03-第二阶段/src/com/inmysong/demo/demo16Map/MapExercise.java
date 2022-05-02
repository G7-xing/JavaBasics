package com.inmysong.demo.demo16Map;

import java.util.*;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/13 18:56
 * @description
 */
@SuppressWarnings("all")
public class MapExercise {
    public static void main(String[] args) {
      Map hashMap = new HashMap();
      hashMap.put(1, new EMP(1,"jack",8000));
      hashMap.put(2, new EMP(2,"tom",34344));
      hashMap.put(3, new EMP(3,"jens",8789));

      // 遍历
      // 使用KeySet - 增强for
      System.out.println("+++++++++++++01++++++++++");
      Set set = hashMap.keySet();
      for (Object key : set) {
          // 先获取value
          EMP emp = (EMP) hashMap.get(key);
          if (emp.getSal() >= 8000){
              System.out.println(emp);
          }
      }
      // 使用entrySet---迭代器方式
        System.out.println("+++++++++++++02++++++++++");
        Set entrySet = hashMap.entrySet();
      Iterator iterator = entrySet.iterator();
      while (iterator.hasNext()) {
          Map.Entry next = (Map.Entry) iterator.next();
          // 通过next 获取key 和 value
          EMP emp = (EMP) next.getValue();
          System.out.println(emp);
      }


    }
}

class EMP{
    private int id;
    private String name;
    private double sal;

    public EMP(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "EMP{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
