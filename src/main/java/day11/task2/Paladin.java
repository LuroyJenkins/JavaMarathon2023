package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer{

    public static final int HEAL_HIMSELF_AMOUNT = 25;
    public static final int HEAL_TEAMMATE_AMOUNT = 10;
    public Paladin() {
        super(15,0.5, 0.2);
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + HEAL_HIMSELF_AMOUNT);
        if(getHealth() > MAX_HEALTH)
            setHealth(MAX_HEALTH);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(getHealth() + HEAL_TEAMMATE_AMOUNT);
        if(hero.getHealth() > MAX_HEALTH)
            hero.setHealth(MAX_HEALTH);
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + getHealth() +
                '}';
    }
}
