package com.hspedu.extend_;

public class Sub extends Base{ //子类
    public Sub(){
        System.out.println("sub()...");
    }
    public void sayOk(){
        System.out.println(n1 + " " +n2 + " " +n3 + " " ); //这里也无法访问n4
        test100();
        test200();
        test300();
//        test400();错误  因为是受保护的，所以无法访问

        //通过父类提供的公共方法去访问; 正确
        System.out.println("n4=" + getN4());

        callTest400();

    }
}
