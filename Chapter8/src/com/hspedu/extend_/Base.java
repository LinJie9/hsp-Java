package com.hspedu.extend_;

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

    public void callTest400(){
        test400();
    }
}
