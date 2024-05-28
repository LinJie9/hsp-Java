package com.hspedu.encap;

public class Encapsulation01 {

    //不能随便查看人的年龄，工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，否则给默认
    //年龄，必须在1-120，年龄，工资不能直接查看，name的长度在2-6 字符之间

    public static void main(String[]args){
        Person person = new Person();
//        person.name = "jack";
        person.setName("jack");
        person.setAge(300);
        person.setSalary(30000);
        System.out.println(person.info());

        //自己使用构造器指定属性
        Person smith = new Person("smith",20,50000);
        System.out.println(smith.info());

    }

}
class Person{
    public String name; //公开
    private int age; //私有化
    private double salary; //私有化...

    //构造器
    public Person(){

    }

    public Person(String name, int age, double salary){
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //将set方法写到构造器里面
        setName(name);
        setAge(age);
        setSalary(salary);
    }



    public void setName(String name){
        if(name.length() >= 2 && name.length() <= 6){
            this.name = name;
        }else {
            System.out.println("你设置的名字有误，给你一个默认的名字");
            this.name = "无名之辈";
        }

    }

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //增加判断
        if (age >= 1 && age <= 120){
            this.age = age;
        }else {
            System.out.println("您设置的年龄有误，需要再1-120，设置了一个默认年龄");
            this.age = 18; //不满足要求，给个默认值年龄18
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info(){
        return "信息为 name=" + name + " age=" + age + " 薪水=" +salary;
    }
}
