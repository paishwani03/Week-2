public class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    String getOrderStatus() {
        return "Order shipped. Tracking Number: " + trackingNumber;
    }
}