package Units;

import Units.BaseUnit;

import java.util.List;

public class Rogue extends BaseUnit {
    int luck;

    public Rogue(String name, int x, int y) {
        super(name,x,y);
        this.luck = 1;
        this.priority = 2;
    }

    public int getLuck() {
        return luck;
    }

    @Override
    public String toString() {
        return "#"+this.id+" "+"Rogue: " +
                "name='" + name + '\'';
    }
    @Override
    public void step(List<BaseUnit> enemyTeam) {

    }
}
