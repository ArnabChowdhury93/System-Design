import java.util.List;





@Getter
@Setter
public class Order {
    private int orderId;
    private OrderStatus status;
    private List<FoodItem> items;
    private Date orderDate;
    private NotificationService notificationService;


    public boolean makePayment(Payment payment){
        return payment.processPayment(billingInfo, amount);
    }

    
}
