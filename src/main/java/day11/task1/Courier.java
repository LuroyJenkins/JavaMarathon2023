package day11.task1;

public class Courier implements Worker {
    private int salary;
    private static final int TASK_SALARY = 100;
    private static final int TASK_BONUS = 50000;
    private boolean isPayed;
    private final Warehouse warehouse;

    public Courier(Warehouse warehouse) {
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
        warehouse.incrementCountDeliveredOrders();
    }

    @Override
    public void bonus() {
        if(warehouse.getCountDeliveredOrders() >= 10000 && !isPayed){
            salary += TASK_BONUS;
            isPayed = true;
        }else if(isPayed){
            System.out.println("Бонус уже был выплачен");
        } else
            System.out.println("Бонус пока не доступен");
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}
