package com.jacob.gettingstart;

public abstract class Duck {
    FlyBehavior flyBehavior;
    public abstract void display();
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void swim(){
        System.out.println("all ducks can swim");
    }
    public void performFly(){
        flyBehavior.fly();
    }
}
