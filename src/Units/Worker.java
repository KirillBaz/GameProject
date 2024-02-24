package Units;

import Units.BaseUnit;

public class Worker extends BaseUnit {

    public Worker(String name,int x, int y) {
        super(name,x,y);
    }
    public void buildAWall(){

    }
    public void bringAnArrow(){

    }


    @Override
    public String toString() {
        return "#"+BaseUnit.id+" "+"Units.Worker: " +
                "name='" + name + '\'';
    }
}
