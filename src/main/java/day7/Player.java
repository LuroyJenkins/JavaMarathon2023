package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if(countPlayers < 6)
            countPlayers++;
    }

    public void run(){
        if(stamina != 0) {
            stamina--;
            if (stamina == MIN_STAMINA) {
                countPlayers--;
                System.out.println("Игрок покидает поле.");
            }
        }
        else{
            System.out.println("Игрок отдыхает.");
        }
    }

    public static void info(){
        switch (countPlayers){
            case 5:
                System.out.println("Команды неполные. На поле ещё есть " + countPlayers + " свободных мест");
                break;
            case 4:
            case 3:
            case 2:
                System.out.println("Команды неполные. На поле ещё есть " + countPlayers + " свободных места");
                break;
            case 1:
                System.out.println("Команды неполные. На поле ещё есть " + countPlayers + " свободное место");
                break;
            default:
                System.out.println("На поле нет свободных мест");
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }
}
