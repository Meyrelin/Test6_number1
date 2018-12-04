package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("fclass1:");
        new fclass1().WhoAreYou();
        System.out.println("fclass2:");
        new fclass2().WhoAreYou();


        fclass3 testClass =new fclass3();
        System.out.println("fclass3:");
        testClass.WhoAreYou();
        testClass.m();
 }
}
class fclass1{
    private int fild=666;

    public int getFild(){
        return this.fild;
    }
    public void WhoAreYou(){
        System.out.println("Вызван метод суперкласса fclass3");
    }

}
class fclass2 extends fclass3 {
    @Override
    public void WhoAreYou(){
        System.out.println("это был вызван метод класса потомка fclass3");
    }

}

class fclass3 extends  fclass1{
    public void m(){
        System.out.println("Значение поля класса родителя с модификатором доступа private ="+getFild());
    }
    @Override
    public void WhoAreYou(){
        System.out.println("это был вызван метод класса потомка fclass1");
    }
}