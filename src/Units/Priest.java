package Units;

import Units.BaseUnit;

import java.util.List;

public class Priest extends BaseUnit {
    int maxMana;
    int mana;
    int faith;

    public Priest(String name, int x, int y) {
        super(name, x, y);
        this.maxMana = 100;
        this.mana = maxMana;
        this.faith = 1;
        this.priority = 1;
    }
    public void Healing(BaseUnit targetAlly){
        targetAlly.hp += 20*this.faith;
        this.mana -= 30;
    }

    @Override
    public String toString() {
        return "#"+this.id+" "+"Priest: " +
                "name='" + name + '\'';
    }
    @Override
    public void step(List<BaseUnit> enemyTeam, List<BaseUnit> allies) {

    }
}
