package Units;

public class Sniper extends Shooters {
    int visibility;
    int accuracy;

    public Sniper(String name, int x, int y) {
        super(name, x, y);
        this.visibility = 1;
        this.accuracy = 5;
        super.maxcharges = 5;
        super.charges = maxcharges;
    }

    public int getVisibility() {
        return visibility;
    }

    public int getAccuracy() {
        return accuracy;
    }

    @Override
    public String toString() {
        return "#"+this.id+" "+"Sniper: " +
                "name='" + name + '\''+" "+ this.hp;
    }
    public String getInfo(){
        return "ДСнайпер ";
    }
}
