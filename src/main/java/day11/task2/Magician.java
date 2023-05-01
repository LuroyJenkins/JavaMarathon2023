package day11.task2;

public class Magician extends Hero implements MagicAttack, PhysAttack {
    private final int physAtt;
    private final int magicAtt;

    public Magician() {
        super(0, 0.8);
        this.physAtt = 5;
        this.magicAtt = 20;
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth((int) (hero.getHealth() - magicAtt * (1 - hero.getMagicDef())));
        if(hero.getHealth() < 0)
            hero.setHealth(Hero.MIN_HEALTH);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth((int) (hero.getHealth() - physAtt * (1 - hero.getPhysDef())));
        if(hero.getHealth() < 0)
            hero.setHealth(Hero.MIN_HEALTH);
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + getHealth() +
                '}';
    }
}
