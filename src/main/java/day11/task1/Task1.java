package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);
        businessProcess(picker);
        businessProcess(courier);

        System.out.println("Кол-во собранных заказов 1 склада: " + warehouse.getCountPickedOrders());
        System.out.println("Кол-во доставленных заказов 1 склада: " + warehouse.getCountDeliveredOrders());
        System.out.println("ЗП Сборщика: " + picker.getSalary());
        System.out.println("ЗП Курьера: " + courier.getSalary());

        Warehouse warehouse2 = new Warehouse();

        Picker picker2 =  new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);

        picker2.doWork();
        courier2.doWork();

        System.out.println("Кол-во собранных заказов 2 склада: " + warehouse2.getCountPickedOrders());
        System.out.println("Кол-во доставленных заказов 2 склада: " + warehouse2.getCountDeliveredOrders());

        System.out.println("Кол-во собранных заказов 1 склада: " + warehouse.getCountPickedOrders());
        System.out.println("Кол-во доставленных заказов 1 склада: " + warehouse.getCountDeliveredOrders());
    }

    public static void businessProcess(Worker worker){
        for(int i = 0; i < 10000; i++){
            worker.doWork();
        }
        worker.bonus();
    }
}
