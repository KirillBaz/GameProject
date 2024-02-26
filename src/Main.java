import Units.*;
import Units.Priest;
import Units.Wizard;
import Units.Archer;
import Units.Sniper;
import Units.Pikeman;
import Units.Rogue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        List<BaseUnit> team1 = teamBuilder(1);
        List<BaseUnit> team2 = teamBuilder(2);
        System.out.println(team1);
        System.out.println(team2);
        //System.out.println(team1.get(9).getPosition());
        //for (BaseUnit hero: team1) if (hero instanceof Shooter) System.out.println(hero+" "+hero.getPriority());
        for (BaseUnit hero1 : team1 ) hero1.step(team2);
    }

    public static List<BaseUnit> teamBuilder(int side12) {
        List<BaseUnit> team = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
         int number = r.nextInt(7);
        switch (number){
            case 0:
                team.add(new Archer("Archer", 0, 0));
                break;
            case 1:
                team.add(new Pikeman("Pikeman", 0 ,0));
                break;
            case 2:
                team.add(new Priest("Priest", 0, 0));
                break;
            case 3:
                team.add(new Rogue("Rogue", 0, 0));
                break;
            case 4:
                team.add(new Sniper("Sniper", 0, 0));
                break;
            case 5:
                team.add(new Wizard("Wizard", 0, 0));
                break;
            case 6:
                team.add(new Worker("Worker", 0, 0));
                break;
        }

        if (side12==1) {
            team.get(i).position.y = 0;
            team.get(i).position.x = i;
            team.get(i).setId(i+1);
        }
        else{
            team.get(i).position.y = 9;
            team.get(i).position.x = i;
            team.get(i).setId(i+11);
        }
        }
        team.sort(new PriorityComparator());
        Collections.reverse(team);
        return team;
    }
}