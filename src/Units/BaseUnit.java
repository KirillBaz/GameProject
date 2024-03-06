package Units;

import java.util.List;
import java.util.Random;

public abstract class BaseUnit implements Step{


    protected static Random r;
//    public static int id;
//    static {
//        id=0;
//    }
    protected int id = 0;
    protected int hp;
    protected String name;
   protected int maxHP;
   protected int damage;

    public void setId(int id) {
        this.id = id;
    }
    protected  int priority;
    protected  int experience;
   protected int level;
   protected int attackRange;
   protected int armour;
   protected boolean isAlive;
   protected int movementRange;
   public Coordinates position;

    public BaseUnit(String name, int hp, int maxHP, int damage, int experience, int level, int attackRange, int armour, boolean isAlive, int x, int y) {
        this.name = name;
        this.hp = hp;
        this.maxHP = maxHP;
        this.damage = damage;
        this.experience = experience;
        this.level = level;
        this.attackRange = attackRange;
        this.armour = armour;
        this.isAlive = isAlive;
        position = new Coordinates(x,y);
    }

    public BaseUnit(String name, int x, int y) {
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
       id++;
       position = new Coordinates(x, y);
       priority = 0;
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


    public void Attack(BaseUnit target) {
       // if (distance<=attackRange){
        System.out.println("Персонаж "+target.id+" "+ target.name+"имеет"+target.hp);
        target.hp -= this.damage-target.armour;
        target.armour--;
        if (target.hp<1){
            target.death(target);
            this.experience+=100;
        }
        System.out.println("Теперь у него "+target.hp);
    }

    @Override
    public String toString() {
        return "BaseUnit{" +
                "id=" + id +
                ", hp=" + hp +
                ", name='" + name + '\'' +
                '}';
    }

    public void death(BaseUnit unit){
        if(unit.hp<1) isAlive = false;
    }

    public Coordinates getPosition() {
        return position;
    }

    public int getPriority() {
        return priority;
    }
    public BaseUnit findNearestEnemy(List<BaseUnit> enemyTeam){
        double minDist = 100;
        BaseUnit nearestEnemy=null;
        for (BaseUnit enemy : enemyTeam){
            if (position.targetDistance(enemy)<minDist && enemy.isAlive==true){
                nearestEnemy = enemy;
                minDist = position.targetDistance(enemy);
            }
        }
        return nearestEnemy;
    }

    public String getInfo(){
        return " ";
    }
}
