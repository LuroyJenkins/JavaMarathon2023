package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer{
    private final int physAtt;
    private final int magicAtt;

    public Shaman() {
        super(0.2, 0.2);
        this.physAtt = 10;
        this.magicAtt = 15;
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 50);
        if(getHealth() > Hero.MAX_HEALTH)
            setHealth(Hero.MAX_HEALTH);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(getHealth() + 30);
        if(hero.getHealth() > Hero.MAX_HEALTH)
            hero.setHealth(Hero.MAX_HEALTH);
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
        return "Shaman{" +
                "health=" + getHealth() +
                '}';
    }
}
