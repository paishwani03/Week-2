// Subclass of ShippedOrder
public class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    // Constructor
    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate + ".";
    }
}
