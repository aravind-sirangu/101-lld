package notifyme.observable;

import notifyme.observer.StockObserver;

public interface StockObservable {

    public void addObserver(StockObserver stockObserver);

    public void removeObserver(StockObserver stockObserver);

    public void add(int newUnits);

    public void notifyObservers();
}
