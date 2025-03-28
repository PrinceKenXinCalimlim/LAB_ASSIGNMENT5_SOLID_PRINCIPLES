public class OrderTest {

    public static void main(String[] args) {

        GenerateOrder order = new OrderAction();
        order.calculateTotal(59.0, 2);
        order.placeOrder("LeBron James", "Carriedo Street");

        Invoice invoice = new OrderAction();
        invoice.generateInvoice("order_623.pdf");

        GenerateEmail generate = new OrderAction();
        generate.sendEmailNotification("lebronjames@goat.com");
    }
}