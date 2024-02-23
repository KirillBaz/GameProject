package Units;

public class Wizard extends BaseUnit {
    int wisdom;
    int scripts;

    public Wizard(String name) {
        super(name);
        this.wisdom = 1;
        this.scripts = 3;
    }

    public void increaseDamage(BaseUnit targetAlly){
        targetAlly.damage += 10*this.wisdom;
    }

    @Override
    public String toString() {
        return "Wizard: " +
                "name='" + name + '\'';
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getScripts() {
        return scripts;
    }
}
