package Units;

public class Rogue extends BaseUnit{
    int luck;

    public Rogue(String name) {
        super(name);
        this.luck = 1;
    }

    public int getLuck() {
        return luck;
    }

    @Override
    public String toString() {
        return "Rogue: " +
                "name='" + name + '\'';
    }
}
