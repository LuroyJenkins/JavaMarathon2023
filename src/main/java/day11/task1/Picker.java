package day11.task1;

public class Picker implements Worker {
    private int salary;
    private static final int TASK_SALARY = 80;
    private static final int TASK_BONUS = 70000;
    private boolean isPayed;
    private final Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.salary = 0;
        this.isPayed = false;
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public void doWork() {
        salary += TASK_SALARY;
        warehouse.incrementCountPickedOrders();
    }

    @Override
    public void bonus() {
        if(warehouse.getCountPickedOrders() >= 10000 && !isPayed){
            salary += TASK_BONUS;
            isPayed = true;
        }else if(isPayed){
            System.out.println("Бонус уже был выплачен");
        } else
            System.out.println("Бонус пока не доступен");
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}
