package com.hspedu.encap;

public class Account {

    //定义两个类：Account和AccountTest类体会Java的封装性
    //Account类要求具有属性：姓名(长度2位3位或4位)、余额〔必须20)、
    //密码（必须是六位），如果不满足，则给出提示信息，并给默认值〔程序员自己定）
    //通过setXxx的方法给Account的属性赋值。
    //在AccountTest中测试

    //封装
    private String name;
    private double balance;
    private String pwd;

    //提供两个构造器
    // 无参构造和有参构造
    public Account(){
    }

    public Account(String name, double balance, String pwd){
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <=4){
            this.name = name;
        }else{
            System.out.println("姓名要求2-4位，默认值为无名之辈");
            this.name = "无名之辈";
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20){
            this.balance = balance;
        }else {
            System.out.println("余额要大于20，默认值为0");
        }

    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if(pwd.length() == 6){
            this.pwd = pwd;
        }else {
            System.out.println("密码必须是6位，默认密码为000000");
            this.pwd = "000000";
        }

    }

    public void showInfo(){
        System.out.println("账号信息 name=" + name + " 余额=" + balance + " 密码=" + pwd );
    }

}
