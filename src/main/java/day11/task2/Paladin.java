package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer{
    private final int physAtt;

    public Paladin() {
        super(0.5, 0.2);
        this.physAtt = 15;
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 25);
        if(getHealth() > 100)
            setHealth(100);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(getHealth() + 10);
        if(hero.getHealth() > 100)
            hero.setHealth(100);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth((int) (hero.getHealth() - physAtt * (1 - hero.getPhysDef())));
        if(hero.getHealth() > Hero.MAX_HEALTH)
            hero.setHealth(100);
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + getHealth() +
                '}';
    }
}
