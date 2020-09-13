import java.util.List;





@Getter
@Setter
public class Order {
    private int orderId;
    private OrderStatus status;
    private List<FoodItem> items;
    private Date orderDate;

    public boolean makePayment(Payment payment){
        payment.processPayment(billingInfo, amount);
    }

    
}
