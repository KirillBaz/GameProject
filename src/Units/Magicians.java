package Units;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class Magicians extends BaseUnit{

    int maxmana=10;
    int mana;
    boolean flag;

    public Magicians(String name, int x, int y) {
        super(name, x, y);
        this.priority = 1;
        this.mana = maxmana;
        flag = false;

    }

    @Override
    public void step(List<BaseUnit> enemyTeam, List<BaseUnit> allies) {
        if (this.hp <= 0)
            return;
        ArrayList<BaseUnit> listForHeal = new ArrayList<BaseUnit>(allies);
        ArrayList<BaseUnit> deadAllies = new ArrayList<BaseUnit>();
        listForHeal.sort((u1, u2) -> u1.hp - u2.hp);

        Iterator<BaseUnit> iterator = listForHeal.iterator();
        while (iterator.hasNext()) {
            BaseUnit unit = iterator.next();
            if (!unit.isAlive) {
                deadAllies.add(unit);
                iterator.remove();
            }
        }

        if (deadAllies.size() > 2) {
            flag = true;
        }
        if (flag && mana == maxmana) {
            deadAllies.sort((u1, u2) -> u2.priority - u1.priority);
            deadAllies.get(0).hp=maxHP;
            this.mana = 0;
            flag = false;
            return;
        }

        if (flag) {
            mana++;
            return;
        }
        if (mana < 2) {
            mana++;
            return;
        }
        listForHeal.get(0).hp+=30;
        mana -= 2;
    }
}
