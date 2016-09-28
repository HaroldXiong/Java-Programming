/**
 * Created by xiong on 9/27/16.
 */
public class P2 {
    public static void main(String[] args) {
        Stock stock = new Stock("Java", "Sun Microsystems Inc");
        stock.previousClosingPrice = 4.5;
        stock.currentPrice = 4.35;
        System.out.println(stock.symbol + stock.name
                + stock.getChange() * 100 + "%");
    }
}

class Stock {
    String symbol = "";
    String name = "";
    double previousClosingPrice;
    double currentPrice;

    Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

    double getChange() {
        return (currentPrice - previousClosingPrice)
                / previousClosingPrice;
    }
}
