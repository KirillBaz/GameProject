package Units;

public class Archer extends Shooter {
    int shotsByStep;
    int amountOfArrows;

    public Archer(String name, int x, int y) {
        super(name, x, y);
        this.shotsByStep = 1;
        this.amountOfArrows = 5;
    }

    public int getShotsByStep() {
        return shotsByStep;
    }

    public int getAmountOfArrows() {
        return amountOfArrows;
    }

    @Override
    public String toString() {
        return "#"+BaseUnit.id+" "+"Archer: " +
                "name='" + name + '\'';
    }
}
