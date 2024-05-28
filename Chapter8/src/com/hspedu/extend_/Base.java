package com.hspedu.extend_;

//子类继承了所有的属性和方法，但是私有属性和方法不能在子类直接访问，要通过公共的方法去访问

public class Base { //父类
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base(){
        System.out.println("Base()....");
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
