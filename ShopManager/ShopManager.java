public class ShopManager {

    private static final int PRICE_LOW = 100;
    private static final int PRICE_MEDIUM = 200;
    private static final int PRICE_HIGH = 300;

    private static final int MIN_ITEMS_THRESHOLD = 5;

    private int money = 0;
    private int items = 0;

    public void processAction(int actionType) {

        updateState(actionType);
        printReport();
        checkStock();

    }

    private void updateState(int actionType) {

        switch (actionType) {

            case 1:
                addTransaction(PRICE_LOW);
                break;

            case 2:
                addTransaction(PRICE_MEDIUM);
                break;

            case 3:
                addTransaction(PRICE_HIGH);
                break;

            default:
                System.out.println("unknown action");
        }

    }

    private void addTransaction(int price) {
        money += price;
        items -= 1;
    }

    private void checkStock() {

        if (items < MIN_ITEMS_THRESHOLD) {
            System.out.println("buy more");
        }

    }

    private void printReport() {
        System.out.println(money);
        System.out.println(items);
    }

    public void printHeader() {
        System.out.println("report");
    }

}
