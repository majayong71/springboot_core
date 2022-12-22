package springtraining.core.order;

public interface OrderService {
    Order createOrder (Long member , String itemName , int itemPrice);
}
