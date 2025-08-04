package notifyme.observer.impl;

import notifyme.observable.StockObservable;
import notifyme.observer.StockObserver;

public class EmailAlertStockObserver implements StockObserver {
    StockObservable stockObservable;

    public EmailAlertStockObserver(StockObservable stockObservable){
        this.stockObservable = stockObservable;
    }
    @Override
    public void notifyMe() {
        sendEmail();
    }

    public void sendEmail(){
        System.out.println("New mobiles Stock updated : Email Notification sent");
    }
}
