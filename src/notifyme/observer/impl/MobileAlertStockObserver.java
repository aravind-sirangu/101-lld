package notifyme.observer.impl;

import notifyme.observer.StockObserver;

public class MobileAlertStockObserver implements StockObserver {

    @Override
    public void notifyMe() {
        System.out.println("Mobile Notification sent: New mobiles Stock updated");
    }
}
