package Units;

import Units.BaseUnit;

import java.util.List;

public class Wizard extends BaseUnit {
    int wisdom;
    int scripts;

    public Wizard(String name, int x, int y) {
        super(name, x, y);
        this.wisdom = 1;
        this.scripts = 3;
        this.priority = 1;
    }

    public void increaseDamage(BaseUnit targetAlly){
        targetAlly.damage += 10*this.wisdom;
    }

    @Override
    public String toString() {
        return "#"+this.id+" "+"Wizard: " +
                "name='" + name + '\'';
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getScripts() {
        return scripts;
    }
    @Override
    public void step(List<BaseUnit> enemyTeam, List<BaseUnit> allies) {

    }
}
