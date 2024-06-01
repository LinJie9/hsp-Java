package com.hspedu.extend_;

//子类继承了所有的属性和方法，但是私有属性和方法不能在子类直接访问，要通过公共的方法去访问

public class Base { //父类
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    //如果父类的默认构造器被覆盖了，那么需要在子类的每个构造器中去指明要哪个父类构造器
    public Base(){
        System.out.println("Base()....");
    }

    public Base(String name){
        System.out.println("父类Base(String name)构造器被调用...");
    }

    //这里是我定义的有参构造器，如果我把上面的无参构造器给注释掉，那么我这个有参构造就会覆盖掉上面的无参构造
    public Base(String name,int age){
        System.out.println("父类Base(String name,int age)构造器被调用...");
    }

    //父类提供了一个public方法，返回了n4
    public int getN4(){
        return n4;
    }

    public void test100(){
        System.out.println("test100");
    }

    protected void test200(){
        System.out.println("text200");
    }

    void test300(){
        System.out.println("test300");
    }

    private void test400(){
        System.out.println("test400");
    }

    //子类继承了所有的属性和方法，但是私有属性和方法不能在子类直接访问，要通过公共的方法去访问
    public void callTest400(){ //这一步就是创建了一个call...方法来调用本身受保护的test400，使得子类页面可以调用
        test400();
    }
}
