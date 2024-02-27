package Units;

import java.util.List;

public abstract class Shooters extends BaseUnit {
    int charges;
    public Shooters(String name, int x, int y) {
        super(name, x, y);
        this.priority = 3;
    }
//    public BaseUnit findNearestEnemy(List<BaseUnit> enemyTeam){
//        double minDist = 100;
//        BaseUnit nearestEnemy=null;
//        for (BaseUnit enemy : enemyTeam){
//            if (position.targetDistance(enemy)<minDist){
//                nearestEnemy = enemy;
//                minDist = position.targetDistance(enemy);
//            }
//        }
//        return nearestEnemy;
//    }

    @Override
    public void step(List<BaseUnit> enemyTeam, List<BaseUnit> allies) {
        BaseUnit enemy = findNearestEnemy(enemyTeam);
    if (this.isAlive == true && this.charges!=0 && enemy!=null) {
        this.Attack(enemy);
        this.charges--;
        System.out.println("У персонажа "+this.id+" осталось "+this.charges+" выстрелов");
    }
    else return;
    }
}
