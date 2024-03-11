package Units;

public class Archer extends Shooters {
    int shotsByStep;

    public Archer(String name, int x, int y) {
        super(name, x, y);
        this.shotsByStep = 1;
        super.maxcharges = 7;
        super.charges = maxcharges;
    }

    public int getShotsByStep() {
        return shotsByStep;
    }

//    public int getAmountOfArrows() {
//        return charges;
//    }

    @Override
    public String toString() {
        return "#"+this.id+" "+"Archer: " +
                "name='" + name + '\'' +" "+ this.hp;
    }
    public String getInfo(){
        return "ДЛучник ";
    }
}
