package Units;

public class Priest extends BaseUnit {
    int maxMana;
    int mana;
    int faith;

    public Priest(String name) {
        super(name);
        this.maxMana = 100;
        this.mana = maxMana;
        this.faith = 1;
    }
    public void Healing(BaseUnit targetAlly){
        targetAlly.hp += 20*this.faith;
        this.mana -= 30;
    }

    @Override
    public String toString() {
        return "Priest: " +
                "name='" + name + '\'';
    }
}
