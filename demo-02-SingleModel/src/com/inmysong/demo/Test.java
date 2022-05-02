package com.inmysong.demo;

import java.math.BigDecimal;

public class Test {
        public static void main(String[] args) {
                animal ni = new animal("ni",new BigDecimal(100));
                BigDecimal age = ni.getAge();
                age = age.add(BigDecimal.valueOf(20));
                ni.setAge(age);
                System.out.println(ni.age);
        }

}
class animal{
        public String name;
        public BigDecimal age;

        public animal(String name, BigDecimal age) {
                this.name = name;
                this.age = age;
        }

        @Override
        public String toString() {
                return "animal{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public BigDecimal getAge() {
                return age;
        }

        public void setAge(BigDecimal age) {
                this.age = age;
        }
}