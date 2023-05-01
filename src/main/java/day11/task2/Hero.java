package day11.task2;

public abstract class Hero {
    private int health;
    public static final int MAX_HEALTH = 100;
    public static final int MIN_HEALTH = 0;
    private final double physDef;
    private final double magicDef;

    public Hero(double physDef, double magicDef) {
        this.health = MAX_HEALTH;
        this.physDef = physDef;
        this.magicDef = magicDef;
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
