package notifyme.observable.impl;

import notifyme.observable.StockObervable;
import notifyme.observer.StockObserver;

import java.util.List;

public class MobilesStockObservable implements StockObervable {
    List<StockObserver> observerList;

    int stockUnits;

    public MobilesStockObservable(List<StockObserver> observerList, int stockUnits){
        this.observerList = observerList;
        this.stockUnits = stockUnits;
    }
    @Override
    public void add(int newUnits) {
        if(stockUnits==0){
            notifyObservers();
        }
        this.stockUnits+=newUnits;
    }

    @Override
    public void notifyObservers() {
        for(StockObserver observer : observerList){
            observer.notifyMe();
        }
    }
}
