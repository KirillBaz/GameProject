package Units;

import java.util.Random;

public abstract class BaseUnit{


    protected static Random r;
   protected String name;
   protected int hp;
   protected int maxHP;
   protected int damage;
   protected  int experience;
   protected int level;
   protected int attackRange;
   protected int armour;
   protected boolean isAlive;
   protected int movementRange;

    public BaseUnit(String name, int hp, int maxHP, int damage, int experience, int level, int attackRange, int armour, boolean isAlive) {
        this.name = name;
        this.hp = hp;
        this.maxHP = maxHP;
        this.damage = damage;
        this.experience = experience;
        this.level = level;
        this.attackRange = attackRange;
        this.armour = armour;
        this.isAlive = isAlive;
    }

    public BaseUnit(String name) {
       this.name = name;
       this.maxHP = 100;
       this.hp = maxHP;
       this.damage = 10;
       this.level = 1;
       this.experience = 0;
       this.attackRange = 0;
       this.armour = 0;
       this.isAlive = true;
       movementRange = 2;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getArmour() {
        return armour;
    }

    public int getExperience() {
        return experience;
    }

    public int getLevel() {
        return level;
    }


    public int getHp() {
        return hp;
    }

    public void levelUp(){
        switch (this.experience){
            case 100:
                this.level=2;
                break;
            case 300:
                this.level=3;
                break;
            case 500:
                this.level=4;
                break;
            case 700:
                this.level=5;
                break;
        }
    }

    @Override
    public String toString() {
        return "BaseUnit{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                ", armour=" + armour +
                ", isAlive=" + isAlive +
                '}';
    }
    public void Attack(BaseUnit target) {
       // if (distance<=attackRange){
        target.hp -= this.damage-target.armour;
        target.armour--;
        if (!target.isAlive()){
            this.experience+=100;
        }
    }
    public void death(){
       if (this.hp==0) isAlive = false;
    }

}
