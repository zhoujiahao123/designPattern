package com.jacob.gettingstart;

import com.sun.org.apache.xpath.internal.operations.Mod;

public class ModelDuck extends Duck {
    public ModelDuck(){
        //先让他不能飞
        flyBehavior = new FlyNoWay();

    }
    public void display() {
        System.out.println("i am a model duck");
    }
}
