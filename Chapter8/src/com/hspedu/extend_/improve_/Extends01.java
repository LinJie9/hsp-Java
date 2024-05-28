package com.hspedu.extend_.improve_;

import com.hspedu.extend_.Graduate;
import com.hspedu.extend_.Pupil;

public class Extends01 {
    public static void main(String[] args) {
        com.hspedu.extend_.Pupil pupil = new Pupil();
        pupil.name = "小王";
        pupil.age = 17;
        pupil.testing();
        pupil.setScore(50);
        pupil.showInfo();


        System.out.println("======");


        com.hspedu.extend_.Graduate graduate = new Graduate();
        graduate.name = "大王";
        graduate.age = 22;
        graduate.testing();
        graduate.setScore(90);
        graduate.showInfo();
    }
}
