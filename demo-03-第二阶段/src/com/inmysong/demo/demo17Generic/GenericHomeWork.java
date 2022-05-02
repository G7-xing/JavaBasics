package com.inmysong.demo.demo17Generic;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @version 1.0
 * @Author S-user
 * @Date 2022/4/16 22:03
 * @description
 */
@SuppressWarnings("all")
public class GenericHomeWork {
    public static void main(String[] args) {
        DAO<User> userDAO = new DAO<>();
    }
    @Test
    public void TestList(){
        DAO<User> userDAO = new DAO<>();
        userDAO.save("001",new User(1,10,"jack"));
        userDAO.save("002",new User(2,12,"tom"));
        userDAO.save("003",new User(3,14,"jency"));

        List<User> list = userDAO.list();
        System.out.println(list);
    }
}

class DAO<T>{
    public Map<String,T> map = new HashMap<>();

    public void save(String id,T entity){
       map.put(id,entity);
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T entity){
        map.put(id,entity);
    }
    public List<T> list(){
        List<T> list = new ArrayList<>();

        Set<Map.Entry<String, T>> entries = map.entrySet();
        Iterator<Map.Entry<String, T>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, T> next = iterator.next();
            list.add(next.getValue());
        }
        return list;
    }
    public void delete(String id){

    }
}
class User{
    private int id;
    private int age;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}