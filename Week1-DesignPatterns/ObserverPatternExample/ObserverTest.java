package ObserverPatternExample;

public class ObserverTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileUser=new MobileApp("Rakesh");
        Observer webUser=new WebApp("Tanisha");
        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);
        stockMarket.setStock("TCS", 4200.50);
        stockMarket.removeObserver(webUser);

        stockMarket.setStock("Infosys", 1550.75);
    }
}
