package multilevelinheritence.ordermanagement;
public class OrderManagement {
    public static void main(String[] args) {
        Order order = new Order("List1", "20-01-25");
        ShippedOrder shippedOrder = new ShippedOrder("A01", "22-12-2024", "HGSTYD");
        DeliveredOrder deliveredOrder = new DeliveredOrder("A02", "22-09-2025", "SJHDHS", "25-01-2025");

        System.out.println(order.getOrderStatus());
        System.out.println();

        System.out.println(shippedOrder.getOrderStatus());
        System.out.println();

        System.out.println(deliveredOrder.getOrderStatus());
    }
}