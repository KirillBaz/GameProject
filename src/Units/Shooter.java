package Units;

import Units.BaseUnit;

import java.util.List;

public abstract class Shooter extends BaseUnit {
    public Shooter(String name, int x, int y) {
        super(name, x, y);
    }
    public BaseUnit findNearestEnemy(List<BaseUnit> enemyTeam){
        double minDist = 100;
        BaseUnit nearestEnemy=enemyTeam.get(0);
        for (BaseUnit enemy : enemyTeam){
            if (position.targetDistance(enemy)<minDist) nearestEnemy = enemy;
        }
    return nearestEnemy;
    }
}
