package com.hspedu.extend_;

public class ExtendsDetail {
    public static void main(String[] args) {
        Sub sub = new Sub();
        System.out.println("===1===");
        Sub sub2 = new Sub("tom");
//        sub.sayOk();
        System.out.println("===3===");
        Sub sub3 = new Sub("king",10);

    }
}
