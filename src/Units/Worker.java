package Units;

import Units.BaseUnit;

public class Worker extends BaseUnit {

    public Worker(String name) {
        super(name);
    }
    public void buildAWall(){

    }
    public void bringAnArrow(){

    }


    @Override
    public String toString() {
        return "Units.Worker: " +
                "name='" + name + '\'';
    }
}
