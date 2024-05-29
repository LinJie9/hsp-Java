package com.hspedu.extend_;

public class Sub extends Base{ //子类
    public Sub(){

        //如果父类的默认构造器被覆盖了，那么需要在子类的每个构造器中去指明要哪个父类构造器
        super("jack",10);
        System.out.println("sub()...");
    }

    public Sub(String name){
        //.....
        super("mark",11);
        System.out.println("子类的String name被调用");
    }
    public void sayOk(){
        //非私有的属性和方法可以在子类直接访问（n1、n2、n3）
        //但是私有属性和方法不能在子类直接访问（n4）
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
