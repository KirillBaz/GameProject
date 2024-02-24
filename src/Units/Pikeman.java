package Units;

import Units.BaseUnit;

public class Pikeman extends BaseUnit {
    int rage;
    public Pikeman(String name, int x, int y) {
        super(name,x,y);
        this.rage = 1;
    }

    public int getRage() {
        return rage;
    }

    @Override
    public String toString() {
        return "#"+BaseUnit.id+" "+"Pikeman: " +
                "name='" + name + '\'';
    }
}
