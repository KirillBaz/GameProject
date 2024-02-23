package Units;

public class Archer extends BaseUnit{
    int shotsByStep;
    int amountOfArrows;

    public Archer(String name) {
        super(name);
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
        return "Archer: " +
                "name='" + name + '\'';
    }
}
