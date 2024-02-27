package Units;

import Units.BaseUnit;

import java.util.List;

public class Pikeman extends Warriors {
    int rage;
    public Pikeman(String name, int x, int y) {
        super(name,x,y);
        this.rage = 1;
        this.priority = 2;
    }

    public int getRage() {
        return rage;
    }

    @Override
    public String toString() {
        return "#"+this.id+" "+"Pikeman: " +
                "name='" + name + '\'';
    }

}
