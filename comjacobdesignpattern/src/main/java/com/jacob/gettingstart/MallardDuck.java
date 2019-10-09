package com.jacob.gettingstart;

public class MallardDuck extends Duck {
    public MallardDuck(){
        flyBehavior = new FlyWithWing();
    }
    public void display() {
        System.out.println("i am a real mallard duck");
    }
}
