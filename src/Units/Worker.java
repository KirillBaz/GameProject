package Units;

import Units.BaseUnit;

import java.util.List;

public class Worker extends BaseUnit {

    public Worker(String name,int x, int y) {
        super(name,x,y);
        this.priority = 0;
    }
    public void buildAWall(){

    }
    public void bringAnArrow(){

    }
    @Override
    public void step(List<BaseUnit> enemyTeam, List<BaseUnit> allies) {
        for (BaseUnit ally: allies){
        if (ally instanceof Shooters && ((Shooters) ally).charges<((Shooters) ally).maxcharges) ((Shooters) ally).charges++;
        }
    }

    @Override
    public String toString() {
        return "#"+this.id+" "+"Units.Worker: " +
                "name='" + name + '\''+" "+ this.hp;
    }
    public String getInfo(){
        return "Крестьянин ";
    }
}
