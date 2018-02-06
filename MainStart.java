package Homework.MyPattern;

import Homework.MyPattern.Behavior.Crossbow;
import Homework.MyPattern.Behavior.Spear;
import Homework.MyPattern.Behavior.Sword;
import Homework.MyPattern.Model.AbsKnight;
import Homework.MyPattern.Model.Archer;
import Homework.MyPattern.Model.Knight;
import Homework.MyPattern.Model.Spearman;

public class MainStart {

    public static void main(String[] args) {
        AbsKnight knight = new Knight(new Sword());
        AbsKnight archer = new Archer(new Crossbow());
        AbsKnight spearman = new Spearman(new Spear());

        knight.run();
        knight.jump();
        knight.fight();
        System.out.println();

        archer.run();
        archer.jump();
        archer.fight();
        System.out.println();

        spearman.run();
        spearman.jump();
        spearman.fight();
    }
}

