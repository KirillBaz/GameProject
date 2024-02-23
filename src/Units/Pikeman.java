package Units;

public class Pikeman extends BaseUnit{
    int rage;
    public Pikeman(String name) {
        super(name);
        this.rage = 1;
    }

    public int getRage() {
        return rage;
    }

    @Override
    public String toString() {
        return "Pikeman: " +
                "name='" + name + '\'';
    }
}
