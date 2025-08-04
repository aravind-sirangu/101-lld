package notifyme.observable.impl;

import lombok.Data;
import notifyme.observable.StockObservable;
import notifyme.observer.StockObserver;

import java.util.List;

@Data
public class MobilesStockObservable implements StockObservable {
    List<StockObserver> observerList;

    private int stockUnits;

    public MobilesStockObservable(List<StockObserver> observerList, int stockUnits){
        this.observerList = observerList;
        this.stockUnits = stockUnits;
    }

    @Override
    public void addObserver(StockObserver stockObserver) {
        this.observerList.add(stockObserver);
    }

    @Override
    public void removeObserver(StockObserver stockObserver) {
        this.observerList.remove(stockObserver);
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
