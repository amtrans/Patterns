package Homework.MyPattern.Model;

import Homework.MyPattern.Behavior.IBehavior;

public abstract class AbsKnight {

    IBehavior Sword;

    public AbsKnight(IBehavior Sword){
        this.Sword = Sword;
    }

    public void run(){
        System.out.println("I'm running");
    }

    public void jump() {
        System.out.println("I'm jumping");
    }

    public void fight(){
        Sword.fight();
    }
}
