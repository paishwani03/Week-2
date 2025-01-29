// Main class
public class Main {
    public static void main(String[] args) {
        Order order = new Order(101, "2025-01-23");
        System.out.println(order.getOrderStatus());

        ShippedOrder shippedOrder = new ShippedOrder(102, "2025-01-23", "TRK12345");
        System.out.println(shippedOrder.getOrderStatus());

        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2025-01-23", "TRK67890", "2025-01-24");
        System.out.println(deliveredOrder.getOrderStatus());
    }
}