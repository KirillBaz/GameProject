package Units;

import Units.BaseUnit;

public class Rogue extends BaseUnit {
    int luck;

    public Rogue(String name, int x, int y) {
        super(name,x,y);
        this.luck = 1;
    }

    public int getLuck() {
        return luck;
    }

    @Override
    public String toString() {
        return "#"+BaseUnit.id+" "+"Rogue: " +
                "name='" + name + '\'';
    }
}
