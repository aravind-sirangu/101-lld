package notifyme;

import notifyme.observable.StockObservable;
import notifyme.observable.impl.MobilesStockObservable;
import notifyme.observer.StockObserver;
import notifyme.observer.impl.EmailAlertStockObserver;
import notifyme.observer.impl.MobileAlertStockObserver;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StockObserver mobileStockObserver = new MobileAlertStockObserver();
        List<StockObserver> list = new ArrayList<>();
        list.add(mobileStockObserver);
        list.add(new EmailAlertStockObserver(new MobilesStockObservable(new ArrayList<>(), 0)));
        StockObservable mobileStockObservable = new MobilesStockObservable(list, 0);
        mobileStockObservable.add(10);
    }
}
