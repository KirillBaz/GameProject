package Units;

public class Sniper extends Shooter {
    int visibility;
    int accuracy;

    public Sniper(String name, int x, int y) {
        super(name, x, y);
        this.visibility = 1;
        this.accuracy = 5;
    }

    public int getVisibility() {
        return visibility;
    }

    public int getAccuracy() {
        return accuracy;
    }

    @Override
    public String toString() {
        return "#"+BaseUnit.id+" "+"Sniper: " +
                "name='" + name + '\'';
    }
}
