package Units;

import Units.BaseUnit;

import java.util.ArrayList;
import java.util.List;

public abstract class Shooter extends BaseUnit {
    int charges;
    public Shooter(String name, int x, int y) {
        super(name, x, y);
        this.priority = 3;
    }
    public BaseUnit findNearestEnemy(List<BaseUnit> enemyTeam){
        double minDist = 100;
        BaseUnit nearestEnemy=enemyTeam.get(0);
        for (BaseUnit enemy : enemyTeam){
            if (position.targetDistance(enemy)<minDist){
                nearestEnemy = enemy;
                minDist = position.targetDistance(enemy);
            }
        }
        return nearestEnemy;
    }

    @Override
    public void step(List<BaseUnit> enemyTeam) {
    if (this.isAlive == true && this.charges!=0) {
        this.Attack(this.findNearestEnemy(enemyTeam));
        this.charges--;
        System.out.println("У персонажа "+this.id+" осталось "+this.charges+" выстрелов");
    }
    else return;
    }
}
