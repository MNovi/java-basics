package simple.automation;

public class Main {
    private static final String EXISTED_USER = new String("existed");
    private static final String NOT_EXISTED_USER = "wrong";

    public static void main(String[] args) {

        new AuthorizationTest().testLogin();
        OrderTests orderTests = new OrderTests();
        orderTests.testCreateOrder();
        orderTests.testListOrders();
    }
}