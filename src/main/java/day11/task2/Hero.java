package day11.task2;

public abstract class Hero implements PhysAttack {
    private int health;
    public static final int MAX_HEALTH = 100;
    public static final int MIN_HEALTH = 0;
    private final int physAtt;
    private final double physDef;
    private final double magicDef;

    public Hero(int physAtt, double physDef, double magicDef) {
        this.health = MAX_HEALTH;
        this.physAtt = physAtt;
        this.physDef = physDef;
        this.magicDef = magicDef;
    }

    @Override
    public void physicalAttack(Hero hero) {
        if(hero.health - physAtt * (1 - hero.getPhysDef()) < MIN_HEALTH)
            hero.health = MIN_HEALTH;
        else
            hero.health -= physAtt * (1 - hero.getPhysDef());
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }
}
