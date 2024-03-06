package Units;

import java.util.List;

public abstract class Warriors extends BaseUnit {
    public Warriors(String name, int x, int y) {
        super(name, x, y);
        this.priority = 2;
    }

    @Override
    public void step(List<BaseUnit> enemyTeam, List<BaseUnit> allies) {
        if (!isAlive) return;
        BaseUnit target = super.findNearestEnemy(enemyTeam);
        if (position.targetDistance(target) < 2) {
            this.Attack(target);
            return;
        }
        Coordinates diff = position.getDiff(target.position);

        Coordinates currentPosition = new Coordinates(position.x, position.y);

        if (Math.abs(diff.x) > Math.abs(diff.y)) currentPosition.x += diff.x < 0 ? 1 : -1;
        else currentPosition.y += diff.y < 0 ? 1 : -1;

        for (BaseUnit friend : allies) {
            if (friend.position.equals(currentPosition)&& target.hp>0) return;

        }
        System.out.println("Персонаж "+this.id+" сдвинулся с "+ this.position+ " на "+currentPosition);
        this.position = currentPosition;
    }
}
