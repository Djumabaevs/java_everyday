package Patterns;

import java.util.ArrayList;
import java.util.List;

public class StrategyPattern {
    public static void main(String[] args) {
        List<Stock> list = new ArrayList<>();

        list.add(new Stock("Google", 1200, 100));
        list.add(new Stock("Amz", 900, 600));
        list.add(new Stock("Microsoft", 700, 800));

        StockFilters.bySymbol(list, "Amx").forEach(System.out::println);
        System.out.println("---------------------------------");
        StockFilters.byPrice(list, 700).forEach(System.out::println);

        StockFilters.filter(list, stock -> stock.getSymbol().equals("Amz")).forEach(System.out::println);

    }
}
