import Units.*;
import Units.Priest;
import Units.Wizard;
import Units.Archer;
import Units.Sniper;
import Units.Pikeman;
import Units.Rogue;

import java.lang.reflect.Array;
import java.util.*;


public class Main {
 public static List<BaseUnit> holyTeam = teamBuilder(1);
 public static List<BaseUnit> darkTeam = teamBuilder(2);
 public static List<BaseUnit> allTeam = new ArrayList<>();


    public static void main(String[] args) {
        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);
        System.out.println(holyTeam);
        System.out.println(darkTeam);
        //System.out.println(holyTeam.get(9).getPosition());
        //for (BaseUnit hero: holyTeam) if (hero instanceof Shooter) System.out.println(hero+" "+hero.getPriority());
//        for (BaseUnit hero1 : holyTeam ) hero1.step(darkTeam, holyTeam);
//        for (BaseUnit hero2: darkTeam) hero2.step(holyTeam, darkTeam);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            View.view();
            scanner.nextLine();
            for (BaseUnit unit : allTeam) {
                if (holyTeam.contains(unit)) unit.step(darkTeam, holyTeam);
                else unit.step(holyTeam, darkTeam);
            }
            int liveCounter1 = 0;
            for (BaseUnit unit : holyTeam) {
                if (unit.isAlive()) liveCounter1 += 1;

            }
            if (liveCounter1 == 0) {System.out.println("darkTeam wins!");
            break;}
            int liveCounter2 = 0;
            for (BaseUnit unit : darkTeam) {
                if (unit.isAlive()) liveCounter2 += 1;
            }
            if (liveCounter2 == 0) {
                System.out.println("holyTeam wins!");
                View.view();
                break;
            }
        }
    }
        public static List<BaseUnit> teamBuilder ( int side12){
            ArrayList<BaseUnit> team = new ArrayList<>();
            Random r = new Random();
            for (int i = 1; i < 11; i++) {
                int number = r.nextInt(7);
                switch (number) {
                    case 0:
                        team.add(new Archer("Archer", 0, 0));
                        break;
                    case 1:
                        team.add(new Pikeman("Pikeman", 0, 0));
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

                if (side12 == 1) {
                    team.get(i - 1).position.y = 1;
                    team.get(i - 1).position.x = i;
                    team.get(i - 1).setId(i);
                } else {
                    team.get(i - 1).position.y = 10;
                    team.get(i - 1).position.x = i;
                    team.get(i - 1).setId(i + 10);
                }
            }
            team.sort(new PriorityComparator());
            Collections.reverse(team);
            return team;

        }

    }