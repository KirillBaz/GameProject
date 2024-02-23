package Units;

public class Sniper extends BaseUnit{
    int visibility;
    int accuracy;

    public Sniper(String name) {
        super(name);
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
        return "Sniper: " +
                "name='" + name + '\'';
    }
}
