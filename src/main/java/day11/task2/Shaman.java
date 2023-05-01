package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer{
    private final int magicAtt;
    public static final int HEAL_HIMSELF_AMOUNT = 50;
    public static final int HEAL_TEAMMATE_AMOUNT = 30;

    public Shaman() {
        super(10,0.2, 0.2);
        this.magicAtt = 15;
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + HEAL_HIMSELF_AMOUNT);
        if(getHealth() > Hero.MAX_HEALTH)
            setHealth(Hero.MAX_HEALTH);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(getHealth() + HEAL_TEAMMATE_AMOUNT);
        if(hero.getHealth() > Hero.MAX_HEALTH)
            hero.setHealth(Hero.MAX_HEALTH);
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth((int) (hero.getHealth() - magicAtt * (1 - hero.getMagicDef())));
        if(hero.getHealth() < MIN_HEALTH)
            hero.setHealth(Hero.MIN_HEALTH);
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + getHealth() +
                '}';
    }
}
