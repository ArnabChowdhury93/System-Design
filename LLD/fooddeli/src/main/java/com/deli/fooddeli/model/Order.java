import java.util.List;


import main.java.com.deli.fooddeli.enum.OrderStatus;

@Getter
@Setter
public class Order {
    private int orderId;
    private OrderStatus status;
    private List<FoodItem> items;
    
}
