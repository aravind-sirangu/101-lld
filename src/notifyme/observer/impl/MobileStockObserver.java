package notifyme.observer.impl;

import notifyme.observer.StockObserver;

public class MobileStockObserver implements StockObserver {

    @Override
    public void notifyMe() {
        System.out.println("New mobiles Stock updated");
    }
}
