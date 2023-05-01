package day11.task2;

public class Magician extends Hero implements MagicAttack, PhysAttack {
    private final int magicAtt;

    public Magician() {
        super(5,0, 0.8);
        this.magicAtt = 20;
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth((int) (hero.getHealth() - magicAtt * (1 - hero.getMagicDef())));
        if(hero.getHealth() < MIN_HEALTH)
            hero.setHealth(Hero.MIN_HEALTH);
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + getHealth() +
                '}';
    }
}
