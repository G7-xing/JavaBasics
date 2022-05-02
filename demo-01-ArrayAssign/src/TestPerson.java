public class TestPerson {

}

class Person04{
    String name;
    int age;

    //构造器
    public Person04(String name,int age){
        this.name = name;
        this.age = age;
    }

    //compareTo比较方法
    public boolean compareTo(Person04 p){
        return this.name.equals(p.name) && this.age == p.age;
    }
}