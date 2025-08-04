package notifyme;

import notifyme.observable.StockObervable;
import notifyme.observable.impl.MobilesStockObservable;
import notifyme.observer.StockObserver;
import notifyme.observer.impl.MobileStockObserver;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StockObserver mobileStockObserver = new MobileStockObserver();
        List<StockObserver> list = new ArrayList<>();
        list.add(mobileStockObserver);
        StockObervable mobileStockObservable = new MobilesStockObservable(list, 0);
        mobileStockObservable.add(10);
    }
}
