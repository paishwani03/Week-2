// Class to represent the order details
public class Order {
    int orderId;
    String orderDate;

    // Constructor to initialize the order id and order date
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;

    }
        // Method to return the order status
        String getOrderStatus(){
            return "Order placed.";
        }

}
